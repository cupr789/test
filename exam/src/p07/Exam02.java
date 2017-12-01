package p07;

public class Exam02 {
	public static void main(String[] args) {
		/*
		 * 총 107리터의 물이 있습니다. 5리터의 물통과 3리터의 물통 2리터의 물통을 가지고 있을때 총 몇개의 물통이 있어야 107리터를 담을 수
		 * 있는지를 계산하는 프로그램을 작성해주세요. 단 물통의 갯수는 최소여야합니다.
		 * 
		 */

		int totWater = 107;
		int a=5;
		int b=3;
		int c=2;
		int countA=0;
		int countB=0;
		int countC=0;
		int result=0;
		int totResult=0;
		int count=0;
		

		for(int i=100; i>=0;i-=a) {
			countA++;
		}
		result = 100%a;
		if(result!=0) {
			result = result%b;
			if( result!=0) {
				result = result%c;
				countC++;
			}
			else if(result==0) {
				countB++;
			}
		}
	
		
	
		
		System.out.println(a+"리터 물통 갯수: "+countA);
		System.out.println(b+"리터 물통 갯수: "+countB);
		System.out.println(c+"리터 물통 갯수: "+countC);
		totResult = (countA+countB+countC);
		System.out.println("최종 물통갯수: "+totResult);
		System.out.println("");
		
		countA=0;
		countB=0;
		countC=0;
		
	


		

	}
}
