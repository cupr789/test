package p06;

public class Exam01 {
	
	public static void main(String[] args) {
		int temp = 0;
		for (int i = 9; i >= 1; i--) {

			for (int x = 9; x >= 1; x--) {
				temp = i * x;
				
				
				if (x == 1) {
					
					System.out.print(i + " X " + x + "= " + (temp%3==0 ? temp+", 3의 배수! " : temp));
					
				} else {
					System.out.print(i + " X " + x + "= " + (temp%3==0 ? temp+", 3의 배수! " : temp+", "));
				}
			}
			System.out.println("");
		}

	}

}
