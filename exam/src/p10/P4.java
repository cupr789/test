package p10;

public class P4 extends P3{
	public String toString() {
		
		return "P4의 toString()"; 
	}
	
	public static void main(String[] args) {
		String[] arr = {"월","화","수","목","금","토","일"};
		
		for(String a : arr) {
			System.out.println(a);
		}
	}
}
