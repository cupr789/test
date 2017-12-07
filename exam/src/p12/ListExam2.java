package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam2 {
	// String으로 구성된 ArrayList를 만들어주세요
	// 스캐너클래스를 사용하여 숫자를 입력받아
	// 해당 숫자만큼 반복해서 ArrayList의 값을
	// 스캐너 변수로 문자열숫자를 입력받아주세요
	// 중복값은 없어야 합니다.
	// 만약 중복값을 입력한 경우 중복값이 있다고 알려주고
	// 다시 돌아야 합니다.
	// ArrayList안에 값을 출력하는 함수를 2개 만들어주시고
	// 첫번째 함수는 짝수 일때만 출력
	// 두번째 함수는 홀수 일때만 출력해주세요.
	Scanner sc = new Scanner(System.in);
	ArrayList<String> al = new ArrayList<String>();
	
	
	void print1() {
		System.out.println("[짝수일때]");
		for (int i = 0; i < al.size(); i++) {
			if (Integer.parseInt(al.get(i)) % 2 == 0) {
				System.out.println(al.get(i));
			}
		}
	}

	void print2() {
		System.out.println("[홀수일때]");
		for (int i = 0; i < al.size(); i++) {
			if (Integer.parseInt(al.get(i)) % 2 != 0) {
				System.out.println(al.get(i));
			}
		}
	}
	
	void duplCheck() {
		System.out.println("반복하실 숫자를 입력해주세요!");
		int num = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < num; i++) {
			System.out.println("출력하실 문자열숫자를 입력해주세요!");
			String str = sc.nextLine();
			for (int x = 0; x < al.size(); x++) {
				if (str.equals(al.get(x))) {
					System.out.println("중복발견! 다시입력바랍니다!");
					i--;
					al.remove(x);
					break;
				}
			}
				al.add(str);
		}
	}

	public static void main(String[] args) {

		ListExam2 le2 = new ListExam2();
		le2.duplCheck();
		le2.print1();
		le2.print2();
	}

}
