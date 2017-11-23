package p02;

public class FunctionTest {

	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static int add2(int num1,int num2) {
		int result =num1+num2;
		System.out.println(result);
		return result; 
	}
	public static void main(String[] args) {

		System.out.println(add2(1,2));
		
	}

}
