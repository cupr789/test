package p12;

import java.util.Scanner;


public class Execute{


	public static void main(String[] args) {
		
		ListExam le = new ListExam();
		//Execute ex = new Execute();
		
	/*	for(int i=0;i<10;i++) {
			le.add(i+"");
		}
		le.printAlStr();*/
		//System.out.println(le.get(0));
		
	/*	
		String str = "1,2,3,4";
		String temp = new String();
		for(char c : str.toCharArray()) {
			if(c!=',') 
			{
				temp +=c+"";
			}
		}
		System.out.println(temp);*/
		//System.out.println(str.toCharArray());
		/*Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] strArr = str.split(",");	
		for(int i=0; i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}*/
		
		le.inputAlStr();
		le.printAlStr2();
		le.addPrint();
		
		
		
	}
}
