package test;

import java.util.ArrayList;

public class DAO {
	ArrayList<User> userList = new ArrayList<User>();
	
	public boolean insertUser(User user) {
			
		return userList.add(user);
	}
	public boolean updateUser(User user) {
		return userList.add(user);
	}
	public boolean deleteUser(User user) {
		return userList.add(user);
	}
	
	
	
	public ArrayList getUserList(String name) {
		
		return userList;
	}
	
	
	
	
}
