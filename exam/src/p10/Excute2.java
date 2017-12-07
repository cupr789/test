package p10;

public class Excute2 {
	Excute2(){
		super();
	}
	public static void main(String[] args) {
		Object p1 = new Person();
		Person per1 = (Person)p1;
		Object p2 = new P1();
		Object p3 = new P3();
		Object p4 = new P4();
		
		Object[] obArr = new Object[5];
		
		obArr[0]=p1;
		obArr[1]=p2;
		obArr[2]=p3;
		obArr[3]=p4;
		obArr[4]=per1;
		
		
		for(int i=0; i<obArr.length; i++) {
			System.out.println(obArr[i].toString());
		}
		
	}

}
