package test;

import java.util.ArrayList;

public class Service {
	DAO dao;
	Service(){
		dao = new DAO();
	}
	

	
	
	
	
	public boolean insertUser(User user) {
		return dao.insertUser(user);
	}
	public boolean deleteUser(User user) {
		return dao.deleteUser(user);
	}
	public boolean updateUser(String name,User user) {
		return dao.updateUser(name,user);
	}
	public ArrayList<User> getUserList(){
		return dao.getUserList();
	}
}
