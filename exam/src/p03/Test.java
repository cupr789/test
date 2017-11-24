package p03;

import java.util.Scanner;

public class Test {

	String str;

	public void print(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
/*		Test t = new Test();

		t.print("");

		String str1 = "다";
		
		int count = 0;
		int index = 0;
		int temp = 0;
		String strTemp = str1;
		System.out.println(str1);
		
		Scanner sc = new Scanner(System.in);
		
		String inputStr = sc.nextLine();
		
		
		
		for (int i = 0; i <= count; i++) {

			if(strTemp.indexOf(inputStr)!=-1) {
			index = strTemp.indexOf(inputStr);
			count++;
			}
			else {
				
				break;
			}
			
			strTemp = strTemp.substring(index + 1);
			
			System.out.println("");
			
			System.out.println((i+1)+"번째 ["+inputStr+"] 의 위치: "+(index+temp));
			temp += (index+1);

		}*/
		
		
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		Gugudan ggd = new Gugudan();
		ggd.printLoop(oe);

	}
}
