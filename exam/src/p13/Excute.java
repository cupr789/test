package p13;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {
	ArrayList<Person> alPerson;
	Excute() {
			alPerson = new ArrayList<Person>();
	}
	
	
	void inputsPersonCount() {
		System.out.println("시험본 총 학생수를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
	
		for(int i=0; i<cnt; i++) {
			sc.nextLine();
			System.out.println((i+1)+"번째 학생이름을 입력해주세요.");
			String name = sc.nextLine();
			Student st = new Student(name);
			System.out.println((i+1)+"번째 학생의 점수를 입력해주세요.");
			int point = sc.nextInt();
			st.setPoint(point);
			alPerson.add(st);
		}
		
		
	}
	
	void order() {
		for(int i=0;i<alPerson.size();i++) {
			for(int x=i+1; x<alPerson.size();x++)
			{
				
				System.out.println(alPerson.get(i)); //여기가 문제
			}
			
		}
	}
	
	
	void printAlPerson() {
		for(Person p:alPerson) {
			Student s = (Student)p;
			System.out.println(s.name);
			System.out.println(s.getPoint());
		}
	}
	
	
	public static void main(String[] args) {
		Excute e = new Excute();
		e.inputsPersonCount();
		e.printAlPerson();
		e.order();
		
	}
}
