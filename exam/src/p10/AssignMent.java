package p10;

import java.util.Random;
import java.util.Scanner;

public class AssignMent {
	int lottoCnt=0;
	int joinCnt=0;
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	
	AssignMent(){
		
		System.out.println("당첨인원을 입력해주세요");
		lottoCnt = sc.nextInt();
		System.out.println("참가인원을 입력해주세요");
		joinCnt = sc.nextInt();
	}
	
	
	
	int[] getLottos() {
		return new int[lottoCnt];
	}
	int[] getJoins() {
		return new int[joinCnt];
	}
	
	
	void setLottos(int[] lottos) {
		
		for(int i=0;i<lottos.length;i++) {
			int n=r.nextInt(joinCnt+1);
			lottos[i]=n;
		}
	}
	
	void checkLottos(int[] lottos) {
		for(int i=0; i<lottos.length; i++) {
			int n=r.nextInt(joinCnt)+1;
			lottos[i]=n;
			if(isDupl(lottos, n, i)) {
				i--;
			}
		}
	}
	
	boolean isDupl(int[] lottos,int num,int maxNum) {
		for(int i=0; i<maxNum;i++) {
			if(lottos[i]==num) {
				
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		AssignMent a = new AssignMent();
		int[] lottos = a.getLottos();
		int[] joins = a.getJoins();
		System.out.println("당첨인원 : "+a.lottoCnt);
		System.out.println("비당첨인원 : "+(a.joinCnt-a.lottoCnt));
		a.setLottos(lottos);
		a.checkLottos(joins);
		System.out.println("당첨된 사람 번호 : ");
		for(int i=0;i<joins.length;i++) {
			for(int j=0;j<lottos.length;j++) {
				if((i+1)==lottos[j]) {
					System.out.println((i+1)+",");
				}
			}
		}
	}

}
