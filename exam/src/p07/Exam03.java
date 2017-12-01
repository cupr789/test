package p07;

import java.util.Scanner;

public class Exam03 {
	int[] intArr = new int[5];
	Scanner sc = new Scanner(System.in);
	String partNum;

	int input() {

		for (int i = 0; i < intArr.length; i++) {
			
			System.out.println("숫자입력");
			intArr[i] = sc.nextInt();
		
			}
		
		sc.nextLine();

		System.out.println("초기입력 숫자");
		for (int x = 0; x < intArr.length; x++) {
			if (x == intArr.length - 1) {
				System.out.print(intArr[x]);
			} else {

				System.out.print(intArr[x] + " , ");
			}
		}

		System.out.println("");
		while (true) {
			try {
				System.out.println("1. 오름차순 정렬, 2. 내림차순 정렬 3. 종료");
				partNum = sc.nextLine();
				if (Integer.parseInt(partNum) == 1 || Integer.parseInt(partNum) == 2) {
					break;
				} else if (Integer.parseInt(partNum) == 3) {
					System.out.println("종료됩니다.");
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("다시 입력해주세요!");
			}
		}
		return Integer.parseInt(partNum);
	}

	void oper(int partNum) {
		int temp = 0;
		for (int i = 0; i < intArr.length; i++) {

			for (int x = i + 1; x < intArr.length; x++) {
				if (partNum == 1) {

					if (intArr[i] > intArr[x]) {
						temp = intArr[i];
						intArr[i] = intArr[x];
						intArr[x] = temp;
					}
				} else if (partNum == 2) {

					if (intArr[i] < intArr[x]) {
						temp = intArr[i];
						intArr[i] = intArr[x];
						intArr[x] = temp;
					}
				}

			}
		}

	}

	void output() {

		System.out.println("정렬된 숫자");
		for (int x = 0; x < intArr.length; x++) {
			if (x == intArr.length - 1) {
				System.out.print(intArr[x]);
			} else {
				System.out.print(intArr[x] + " , ");
			}
		}

	}

	public static void main(String[] args) {
		Exam03 ex = new Exam03();
		int part = ex.input();
		ex.oper(part);
		ex.output();
	}

}
