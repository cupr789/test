package p16;

import java.util.ArrayList;

public class ArrayExam2 {
	
/*	아래의  ArrayExam2 클래스를 실행하게 되면 다음과 같은 결과가 나옵니다.
	단 ArrayList는 ArrayExam에 있는 list변수를 받아와서 실행해야 합니다.
	[0,1,2,3,4,5,6,7,8,9]
			위의 결과가 올바르게 나올수 있도록 코딩작성*/
	public static void main(String[] args) {
		ArrayExam ae = new ArrayExam();
    	ArrayList al = ae.getArrayList(0, 9);
       for(int i=0;i<10;i++){
    	   al.add(i);
       }
       System.out.println(al);

	}
}
