package p05;

import java.util.Scanner;

public class ArrayExam {

	int num1;
	int num2;
	int numArr[][];

	void inputNums() {
		Scanner sc = new Scanner(System.in);

		System.out.println("행을 입력해주세요!");
		num1 = sc.nextInt();
		System.out.println("열을 입력해주세요!");
		num2 = sc.nextInt();
		sc.close();

	}

	void initNumArr() {
		numArr = new int[num1][num2];
		for (int x = 0; x < numArr.length; x++) {

			for (int y = 0; y < numArr.length; y++) {

				numArr[x][y] = y + 1 + (x * numArr[x].length);

			}

		}

	}

	void printNumArr() {
		
		for (int i = 0; i < numArr.length; i++) {
			for (int y = 0; y < numArr.length; y++) {
				if (y == numArr.length - 1) {
					System.out.println(numArr[i][y]);
				} else {
					System.out.print(numArr[i][y] + ",");
				}
			}

		}
	}

	public static void main(String[] args) {
		
		ArrayExam ae = new ArrayExam();
		ae.inputNums();
		ae.initNumArr();
		ae.printNumArr();

	}

}
