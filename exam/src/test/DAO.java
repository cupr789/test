package test;

import java.util.ArrayList;

public class DAO {
	ArrayList<User> al = new ArrayList<User>();
	
	public boolean insertUser(User user) {
		
		return al.add(user);
	}
	public boolean deleteUser(User user) {
		return al.remove(user);
	}
	public boolean updateUser(String name, User user) {
		user.setName(name);
		if(user.getName().equals(name)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public ArrayList<User> getUserList(){
		return al;
	}
	
	
}
