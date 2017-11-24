package p04;

public class LoopTest {
	int a = 0;

	public void loopMethod1(int num1, int num2) {
		if(num1>num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		System.out.println("[" + num1 + "부터 " + num2 + "까지의 합]");

		int result = (num1 + num2) * ((num1 + num2) / 2);

		System.out.println(result);
		/*
		 * for(int i =1;i<=100;i++) { a+=i; }
		 * 
		 * 
		 * System.out.println(a); a=0;
		 */

		System.out.println("");

	}

	public void loopMethod2(int num1, int num2) {
		System.out.println("");
		if(num1>num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		System.out.println("[" + num1 + "부터 " + num2 + "까지 짝수만 출력]");
		for (int i = num1; i <= num2; i++) {
			// a += i;
			if (i % 2 == 0) {
				if (i != num2) {
					System.out.print(i + ",");
				} else {
					System.out.print(i);
				}
			}
		}
		a = 0;
		System.out.println("");
	}

	public void loopMethod3(int num1, int num2,int num3) {
		if(num1>num2) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		System.out.println("[" + num1 + "부터 " + num2 + "까지 홀수만 출력]");
		for (int i = num1; i <= num2; i++) {
			// a += i;
			if (i % num3 == 0) {
				if (i < num2) {
					System.out.print(i + ",");
					if (i == (num2 - 1)) {
						System.out.println(i);
					}

				}
			}
		}
		a = 0;
		System.out.println("");
	}

	public static void main(String[] args) {

	}
}
