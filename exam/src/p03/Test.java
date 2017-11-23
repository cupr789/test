package p03;

public class Test {

	String str;

	void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		Test t = new Test();

		t.print("");

		String str1 = "안녕하십니다 윤재형입니다! 반갑습니다!";
	
		int count =0;
		int index =0;
		int temp = 0;
			System.out.println(str1);
			for(int i=0; i<10; i++) {
				index = str1.indexOf("다");
				temp += index;
				System.out.println("temp값은 ? "+temp);
				
			
				if(index==-1) {
					break;
				}
				
			}
		
	}
}
