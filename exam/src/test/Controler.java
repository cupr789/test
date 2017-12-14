package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Controler {
	Service service;

	Controler() {
		service = new Service();
	}

	public ArrayList<User> get(String command, User user) {
		if (command.equals("insert")) {
			boolean isOk = service.insertUser(user);
			if (isOk) {
				System.out.println("입력성공!");
			} else {
				System.out.println("입력실패!");
			}
		}

		else if (command.equals("delete")) {
			boolean isOk = service.deleteUser(user);
			if (isOk) {
				System.out.println("삭제성공!");
			} else {
				System.out.println("삭제실패!");
			}
		}

		else if (command.equals("update")) {
			Scanner sc = new Scanner(System.in);
			String name = sc.nextLine();
			boolean isOk = service.updateUser(name, user);
			if (isOk) {
				System.out.println("수정성공!");
			} else {
				System.out.println("수정실패!");
			}
		}

		else if (command.equals("list")) {
			
			return service.getUserList();
		}

		return null;
	}

}
