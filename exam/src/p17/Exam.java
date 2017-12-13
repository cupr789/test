package p17;

public class Exam {
	
	private static int add(int num1,int num2) {
		return num1+num2;
	}
	
	public static void printCal(String op, int num1,int num2) {
		if(op.equals("+")) {
			int result = add(num1,num2);
			System.out.println(num1+" + "+num2+" = "+ result);			
		}
	}
	
}
