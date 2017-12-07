package p11;


import java.util.Random;
import java.util.Scanner;

public class AssignMent3 {
	
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
		
	}
	
	void initRandomNum() {
		
		System.out.println("참가인원 : " + joinMember + "  당첨가능인원 " + goalMember);
		System.out.println("");

		for(int i=0; i<memberArr.length; i++) {
			int n=rd.nextInt(joinMember*2) + 1;
			memberArr[i]=n;
			if(isDupl(memberArr, n, i)) {
				i--;
			}
		}
		
		for(int i=0; i<memberArr.length;i++) {
			System.out.print("사용자번호 : "+memberArr[i]+", ");
		}
		System.out.println("");
		System.out.println("-----");
		System.out.println("");
		
		
		for(int i=0; i<goalArr.length; i++) {
			int n=rd.nextInt(joinMember) + 1;
			goalArr[i]=memberArr[n-1];
			if(isDupl(goalArr, memberArr[n-1], i)) {
				i--;
			}
		}
		
		for(int i=0; i<goalArr.length;i++) {
			System.out.print("당첨번호 : "+goalArr[i]+", ");
		}
		
		System.out.println("");
	
	}
	
	boolean isDupl(int[] lottos,int num,int maxNum) {
		for(int i=0; i<maxNum;i++) {
			if(lottos[i]==num) {
				
				return true;
			}
		}
		return false;
	}
	
	
	void goalCheck() {
		finalResult = new int[goalMember];
		for (int i = 0; i < goalArr.length; i++) {
			for(int x=0; x<memberArr.length;x++) {
				if(goalArr[i]==memberArr[x]) {
					finalResult[i] =memberArr[x];
				}
			}
			


		}
		
	}
	
	void print() {
		
/*		System.out.println("");
		System.out.println("");
		System.out.println("당첨인원: " + goalCount);
		System.out.println("꽝 인원: " + noGoalCount);*/

		for(int i=0; i<finalResult.length;i++) {
			System.out.println(finalResult[i]+", ");
		}
		
	}

	public static void main(String[] args) {


		AssignMent3 ex = new AssignMent3();
		ex.initNum();
		ex.initRandomNum();
		ex.goalCheck();
		ex.print();
		
		
		
	
	}

}
