package p05;

import java.util.Scanner;

public class ArrayExam2 {
	public static void main(String[] args) {
	//스캐너클래스로 구구단의 최대값을 입력받아 주세요
		// 입력받은 각각의 단 만큼 구구단을 출력하는 프로그램을 작성해 주시기 바랍니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력해주세요!");
		int minNum = sc.nextInt();
		System.out.println("두번째 수를 입력해주세요!");
		int maxNum = sc.nextInt();
		
		
		for(int i = 1; i<=maxNum; i++) {
			for(int x= 1; x<=minNum; x++) {
				if(x==minNum) {
					System.out.println(i+"x"+x+"="+ i*x);
				}
				else {
					System.out.print(i+"x"+x+"="+ i*x+", ");
				}
			}
		}
		
	
	}
}
