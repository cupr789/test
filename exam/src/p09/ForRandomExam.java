package p09;

import java.util.Random;

public class ForRandomExam {

	int[][] arr = new int[3][3];
	int[] rdArr = new int[9];
	Random rd = new Random();

	void initRdNums() {
		for (int i = 0; i < rdArr.length; i++) {
			int rdNum = rd.nextInt(20) + 1;
			rdArr[i] = rdNum;
		}
	}

	void rdNumCheck() {
		for (int i = 0; i < rdArr.length; i++) {
			for (int x = i + 1; x < rdArr.length; x++) {
				if (rdArr[i] == rdArr[x]) {
					rdArr[x] = rd.nextInt(20) + 1;
					i = 0;
					x--;
				}
			}

		}
	}

	void sortNum() {
		for (int i = 0; i < rdArr.length; i++) {
			for (int x = i + 1; x < rdArr.length; x++) {
				if (x != 0) {
					if (rdArr[i] < rdArr[x]) {
						int temp = rdArr[x];
						rdArr[x] = rdArr[i];
						rdArr[i] = temp;
					}
				}

			}
		}
	}

	void inputArr() {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int x = 0; x < arr.length; x++) {
				arr[i][x] = rdArr[count];
				count++;

			}
		}
	}

	void print() {

		System.out.println("");
		System.out.println("최종값");

		for (int i = 0; i < arr.length; i++) {

			for (int x = 0; x < arr.length; x++) {

				if (x == arr.length - 1) {
					System.out.print(arr[i][x]);
				} else {
					System.out.print(arr[i][x] + ", ");
				}

			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// 3 X 3 개의 방갯수를 가진 2차원 인트형 배열변수를 선언해주세요
		// 각 방에 랜덤한 숫자를 넣어 주시는데 랜덤한 숫자의 미니멈값은 1 맥시멈값은 20
		// 0번째층의 0번째 방부터 큰수가 들어갈 수 있도록 프로그램을 만들어서 출력해주세요.
		// 중복불가

		ForRandomExam fre = new ForRandomExam();

		fre.initRdNums(); // rdArr배열을 랜덤값으로 초기화하는 함수 (중복제거X)
		fre.rdNumCheck(); // 초기화가 된 rdArr배열에서 중복값 제거하는 함수 (중복제거O)
		fre.sortNum(); // rdArr배열의 값들을 내림차순으로 정렬하는 함수
		fre.inputArr(); // 최종 출력배열인 3 X 3 배열 arr에 rdArr배열값 입력하는 함수
		fre.print(); // 최종배열 arr 출력

	}

}
