package p11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ListExam {
	Scanner sc = new Scanner(System.in);
	Random r = new Random();
	void initAndCheck(ArrayList<Integer> list, int flag) {
		int zeroOrOne = 0;
		int partNum=0;
		int n = 0;
	
		for (int i = 0; i < 6; i++) {
			if (flag == 1 || flag == 3) {
				n = r.nextInt(10) + 1;
			} else if (flag == 2) {
				if (zeroOrOne == 0) {
					System.out.println(" 1: 자동숫자 , 2: 수동숫자");
					partNum = sc.nextInt();
					zeroOrOne++;
				}
				if (partNum == 1) {
					flag = 1;
					i = 0;
					//list.clear();
					continue;
				} else if (partNum == 2) {
					System.out.println((i + 1) + "번째 숫자를 입력해주세요");
					n = sc.nextInt();
				}
			}

			if (list.indexOf(n) == -1) {
				list.add(n);
			} else {
				if (flag == 2) {
					System.out.println("중복숫자 발견! 다시 입력해주세요!");
				}
				i--;
			}

		}
	}

	int finalCheck(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		int lottoCount = 0;
		for (int i = 0; i < list1.size(); i++) {
			for (int x = 0; x < list2.size(); x++) {
				if (list1.get(i) == list2.get(x)) {
					lottoCount++;
					break;
				}
			}
		}
		return lottoCount;
	}

	void print(ArrayList<Integer> list1, ArrayList<Integer> list2, int flag) {
		switch (flag) {
		case 1:

			for (Integer i : list1) {
				System.out.print(i + ", ");
			}

			System.out.println("");
			break;

		case 2:
			System.out.print("내 숫자: ");
			for (int i = 0; i < list2.size(); i++) {
				System.out.print(list2.get(i) + ", ");
			}
			System.out.println("");

			break;

		default:
			System.out.println("관리자에게 문의해주세용");
			break;
		}

	}

	void finalResult(int result) {
		System.out.println("맞춘갯수 : " + result);
		if (result == 6) {
			System.out.println("결과 : 1등 당첨");
		} else if (result == 5) {
			System.out.println("결과 : 2등 당첨");
		} else if (result == 4) {
			System.out.println("결과 : 3등 당첨");
		} else {
			System.out.println("결과 : 꽝");
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> lottoNums = new ArrayList<Integer>();
		ArrayList<Integer> myNums = new ArrayList<Integer>();

		ListExam le = new ListExam();
		le.initAndCheck(lottoNums, 1);
		le.print(lottoNums, myNums, 1);
		le.initAndCheck(myNums, 2);
		le.print(lottoNums, myNums, 2);
		int result = le.finalCheck(lottoNums, myNums);
		le.finalResult(result);

	}
}
