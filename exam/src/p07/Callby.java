package p07;

public class Callby {
	int[] doFunc(int[] a,int[] b) {
		System.out.println("함수 실행되자마자 a 주소 "+a);
		a[0]=3;
		a= new int[4];
		System.out.println("함수안에서 a length "+ a.length);
		System.out.println("함수안에서 a값 "+ a[0]);
		System.out.println("새로생성 후 에 a주소 "+a);
		return a;
	}
	public static void main(String[] args) {
		int[] a= new int[1];
		int[] b= new int[2];
		System.out.println("원래 주소 "+a);
		Callby cb = new Callby();
		
		System.out.println(a[0]);
		a = cb.doFunc(a, b);
		
		System.out.println("return 받은 a주소 "+a);
		
	}
	

}
