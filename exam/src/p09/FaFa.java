package p09;

public class FaFa {
	/*
	 * public FaFa() { System.out.println("파파생성자"); }
	 */

	public FaFa(String str) {
		System.out.println("아빠 생성자 호출 : " + str);
	}

	public FaFa(String str1, String str2) {
		System.out.println("아빠 생성자 호출2 : " + str1 + str2);
	}

	protected int a = 3;

	public void print() {
		System.out.println("내가니 애비다");
	}

	public void print(String str) {
		System.out.println(str);
	}
}
