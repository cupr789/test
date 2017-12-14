package test;

import java.util.ArrayList;

public class Excute {
	public static void main(String[] args) {
		User user = new User("재형", 20, 1);
		Controler c = new Controler();
		ArrayList<User> al = c.get("insert", user);
		
		al = c.get("list", user);
		for(User u : al) {
			System.out.println(u);
		}
		
		
		user = new User("진녕",20,2);
		al = c.get("insert", user);
		al = c.get("list", user);
		
		for(User u : al) {
			System.out.println(u);
		}
		
	/*	c.get("delete", user);
		
		for(User u : al) {
			System.out.println(u);
		}		*/
		al = c.get("update", user);
		al = c.get("list", user);
		for(User u : al) {
			System.out.println(u);
		}
		
		
		
	}
}
