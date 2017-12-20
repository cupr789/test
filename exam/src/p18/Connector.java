package p18;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import p17.UserInfo;

public class Connector {
	private Connection con;
	private String url = "jdbc:mariadb://localhost:3306/iot2";
	private String user = "root";
	private String password = "soos789";
	
	
	
	public Connector() throws ClassNotFoundException, SQLException {
		Class.forName("org.mariadb.jdbc.Driver");
	}
	
	public Connection getConnection() throws SQLException {
		if(con==null) {
			con = DriverManager.getConnection(url, user, password);
			con.setAutoCommit(false);
			
		}
		return con;
	}
	
	public void close() throws SQLException {
		System.out.println(con);
		if(con!=null) {
			con.close();
		}
		con=null;
	}
	
}
