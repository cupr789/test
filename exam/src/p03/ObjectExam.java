package p03;

import java.util.Random;
import java.util.Scanner;

public class ObjectExam {

	int num1;
	int num2;

/*	ObjectExam() {
		System.out.println("기본 생성자를 호출하셨군요!");
	}
	ObjectExam(int num1) {
		System.out.println("기본 생성자를 호출하셨군요!");
	}*/

	void add() {
		num1=3;
		System.out.println("둘의 합은 " + (num1 + num2));
		System.out.println("add()함수 호출했구나");
	}
	
	int getNum2() {
		num2=3;
		int num2 =4;
		return this.num2;
	}
	
	void inputNums() {
		Scanner sc = new Scanner(System.in);
		this.num1 = sc.nextInt();
		this.num2 = sc.nextInt();
		
		/*for(int i=num1;i<=num2;i++) {
			System.out.print(i);
			if(i!=num2) {
				System.out.print(",");
			}
		}*/
		sc.close();
	}
	
	void printLoop() {
		Scanner sc = new Scanner(System.in);
		this.num1 = sc.nextInt();
		this.num2 = sc.nextInt();
		
		for(int i=num1;i<=num2;i++) {
			System.out.print(i);
			if(i!=num2) {
				System.out.print(",");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.printLoop();
		//String str11 = "0,1,2,3,4,5,6,7,8,9,";
		
		//System.out.println("");
		//String str22= str11.substring(0, str11.length()-1);
		//System.out.println(str22);
		
	}

}
