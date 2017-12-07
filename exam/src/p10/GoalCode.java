package p10;

import java.util.Random;
import java.util.Scanner;

public class GoalCode {

	int joinMember;
	int goalMember;
	Scanner sc = new Scanner(System.in);
	int[] memberArr;
	int[] goalArr;
	Random rd = new Random();

	int[] finalResult;
	int goalNum;
	int goalCount;
	int noGoalCount;

	void initNum() {
		System.out.println("참가인원을 입력해주세요!");
		joinMember = sc.nextInt();
		System.out.println("당첨가능인원을 입력해주세요!!");
		goalMember = sc.nextInt();
		memberArr = new int[joinMember];
		goalArr = new int[goalMember];
		finalResult = new int[goalMember];

	}

	void initUserNums() {

		System.out.println("참가인원 : " + joinMember + "  당첨가능인원 " + goalMember);
		System.out.println("");

		for (int i = 0; i < memberArr.length; i++) {
			int n = rd.nextInt(joinMember * 2) + 1;
			memberArr[i] = n;
			if (isDupl(memberArr, n, i)) {
				i--;
			}
		}

		for (int i = 0; i < memberArr.length; i++) {
			System.out.print("사용자번호 : " + memberArr[i] + ", ");
		}
		System.out.println("");
		System.out.println("-----");
		System.out.println("");

	}

	void initGoal() {
		for (int i = 0; i < goalArr.length; i++) {
			int n = rd.nextInt(joinMember * 2) + 1;
			goalArr[i] = n;
			if (isDupl(goalArr, n, i)) {
				i--;
			}
		}

		for (int i = 0; i < goalArr.length; i++) {
			System.out.print("당첨번호 : " + goalArr[i] + ", ");
		}
		System.out.println("");

	}

	boolean isDupl(int[] lottos, int num, int maxNum) {
		for (int i = 0; i < maxNum; i++) {
			if (lottos[i] == num) {

				return true;
			}
		}
		return false;
	}

	void goalCheck() {

		for (int i = 0; i < goalArr.length; i++) {
			for (int x = 0; x < memberArr.length; x++) {
				if (goalArr[i] == memberArr[x]) {
					finalResult[i] = memberArr[x];
					break;
				}
				
			}

		}

	}

	void print() {

		for (int i = 0; i < finalResult.length; i++) {
			System.out.println(finalResult[i] + ", ");
		}

	}

	public static void main(String[] args) {

		GoalCode ex = new GoalCode();
		ex.initNum();
		ex.initUserNums();
		ex.initGoal();
		ex.goalCheck();
		ex.print();

	}

}
