package p01;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		
		while (true) { //	 while문 시작
			Scanner s = new Scanner(System.in);

			String s1 = s.nextLine();
			if (s1.equals("exit")) {
				System.out.println("종료됩니다.");
				s.close();
				break;
			}
			
			int a = s.nextInt();
			int b = s.nextInt();

			if (s1.equals("+")) {//    if문 시작
				int result = a + b;
				System.out.println(a+"와 "+b+"를 더한 값은? " + result);
			} else if (s1.equals("-")) {
				int result = a - b;
				System.out.println(a+"와 "+b+"를 뺀 값은? " + result);
			} else if (s1.equals("*")) {
				int result = a * b;
				System.out.println(a+"와 "+b+"를 곱한 값은? " + result);
			} else if (s1.equals("/")) {
				int result = a / b;
				System.out.println(a+"와 "+b+"를 나눈 값은? " + result);
			} else if (s1.equals("%")) {
				int result = a % b;
				System.out.println(a+"를 "+b+"로 나눈 나머지값은? " + result);
			}
			else {
				System.out.println("연산자는 +,-,*,/ 만 입력가능합니다! 종료를 원하시면 exit를 입력해주세요!");
			}
			
			
			
//		    if문 종료
			
		}// 	while문 종료	
		
		

	}
}
