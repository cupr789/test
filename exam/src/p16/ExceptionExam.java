package p16;

import java.util.Scanner;

public class ExceptionExam {
	public void convertAndPrint(String numStr) throws Exception {
		System.out.println(Integer.parseInt(numStr) + 1);
		System.out.println("숫자를 적어야지 임마!");
	}

	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		Scanner sc = new Scanner(System.in);
		String str;

		System.out.println("출력하실 숫자를 적어주세요!");
		str = sc.nextLine();
		try {
			ee.convertAndPrint(str);
		} catch (Exception e) {
			System.out.println("숫자를 적어달라고 했잖아요 ㅜㅜ");
			System.out.println("숫자를 적어주세요");
			str = sc.nextLine();
		}
		try {
			ee.convertAndPrint(str);
		} catch (Exception e1) {
			System.out.println("숫자를 적어달라고 했잖아요 ㅜㅜ");
		}
	}
}
