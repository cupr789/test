package p04;

import java.util.Scanner;

public class Excute {
	public static void main(String[] args) {
		
		/*ObjectExam oe = new ObjectExam();
		oe.inputNums();
		Gugudan gugu = new Gugudan();
		gugu.printLoop(oe);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값을 입력해주세요!");
		int num1 = sc.nextInt();
		System.out.println("끝값을 입력해주세요!");
		int num2 = sc.nextInt();
		System.out.println("추가 숫자를 입력해주세요!");
		int num3 = sc.nextInt();
		LoopTest lt = new LoopTest();
		lt.loopMethod1(num1, num2);
		lt.loopMethod2(num1, num2);
		lt.loopMethod3(num1, num2, num3);
		sc.close();
		
	}
}
