package p10;

public class SonOfSon extends Father{
	
	
	
	public SonOfSon(){
		super(1, 3);
		System.out.println("디폴트 기본생성자!");
	}
	private SonOfSon(int a){
		super(1, 3);
		
		System.out.println("파라미터 a를 가지고 있는 생성자");
	}
	public SonOfSon(int a,int b) {
		super(1, 3);
		System.out.println("파라미터 a와 b를 가지고 있으며 접근지정자 public을 가지고있는 생성자");
	}
	void print() {
		System.out.println("SonOfSon에서 그냥그냥프린트");
	}
	protected void printUser() {
		System.out.println("SonOfSon에서 일반 프린트");
	}
	private void printNum(int a) {
		
		System.out.println("SonOfSon에서 숫자 프린트 = "+a);
	}
	void printString(String str) {
		System.out.println("SonOfSon에서 문자열 프린트 = "+str);
	}

}
