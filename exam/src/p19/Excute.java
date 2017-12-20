package p19;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class Excute {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		UserDAO userdao = null;
		try {
			userdao = new UserDAO();
			userdao.openCon();
			HashMap<String, Object> hm = new HashMap<String, Object>();
			hm.put("uiname", "ttttt");
			hm.put("uiage", 99);
			hm.put("uiid", "ttttt");
			hm.put("uipwd", "ttttt");
			hm.put("address", "수원");
			userdao.insertUser(hm);
			userdao.deleteUser(9);
			userdao.commit();
			
			ArrayList<HashMap<String, Object>> al = userdao.getUserList();
			for (HashMap<String, Object> user : al) {
				System.out.println(user);
			}
		} catch (ClassNotFoundException | SQLException e ) {
			e.printStackTrace();

			if (userdao != null) {
				try {
					userdao.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		}finally {
			if (userdao != null) {
				try {
					userdao.closeCon();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

	}

}
