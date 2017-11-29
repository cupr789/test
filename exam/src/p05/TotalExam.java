package p05;

public class TotalExam {
	
	int a;
	Integer ac;
	boolean b;
	Boolean bc;
		
	public static void main(String[] args) {
		
		TotalExam ex = new TotalExam();
		if(ex.a==1 || ex.a==2 || ex.a==3) {
			System.out.println("a가 0이 아니네요");
		}
		else if(ex.a==0 && ex.a==1){
			System.out.println("a가 0이 이네요");
		}
		
		System.out.println(Integer.parseInt("167")==167);
		
	}

}
