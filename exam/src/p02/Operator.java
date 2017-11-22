package p02;

import javax.xml.soap.SAAJResult;

public class Operator {
	public static void main(String[] args) {

		int a = 3;
		int b = a;
		int c = b;
		boolean b1 = a == b;

		if (a == b) {
			System.out.println("a와 b는 같습니다.");
		}

		System.out.println(a == b);
		System.out.println(b1);

		if (b1) {
			System.out.println("a와 b는 같습니다.");
		} else {
			System.out.println("a와 b는 다릅니다.");
		}

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println((i) + ".a와b는 같습니다. (짝수)");
			} else {
				System.out.println((i) + ".a와b는 같습니다. (홀수)");
			}
		}

		int len = 7;
		String[] strArr = new String[len];

		int num = 10;
		int i=0;
		
		for (len = 0; len < 7; len++) {
			strArr[len] = num + "";
			num += 10;
			System.out.println("strArr["+len+"]= "+strArr[len]);
		}
		
		for(len = 6; len>=0; len--) {
			System.out.println("strArr["+len+"]= "+strArr[len]);
		}
		
		System.out.println("");
		
		
		for(int x=10; x<=100; x+=10) {
			System.out.println(x-5);
		}
		System.out.println("");
		
		for(int x=100; x>=10; x-=5) {
			System.out.println(x-5);
		}
		

	}
}
