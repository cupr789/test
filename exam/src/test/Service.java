package test;

import java.util.ArrayList;

public class Service {
	
	private DAO dao;
	
	Service(){
		dao = new DAO();
	}
	
	public boolean insertUser(User user) {
		
		return dao.insertUser(user);
	}
	public boolean updateUser(User user) {
		
		return dao.updateUser(user);
	}
	
	public boolean deleteUser(User user) {
		
		return dao.deleteUser(user);
	}
	
	public ArrayList getUserList(String name) {
		
		return dao.getUserList(name);
	}

}
