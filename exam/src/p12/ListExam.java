package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {

	private ArrayList<String> alStr;

	ListExam() {
		alStr = new ArrayList<String>();
	}

	void add(String str) {

		alStr.add(str);
	}

	String get(int idx) {
		return alStr.get(idx);
	}

	void remove(int idx) {
		alStr.remove(idx);
	}

	void inputAlStr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 스트링을 넣어주세요. 구분자는 , 입니다.");
		String str = sc.nextLine();
		String[] strArr = str.split(",");
		for(String s : strArr) {
			 alStr.add(s);
		}
	}

	void printAlStr2() {
		for (int i = 0; i < alStr.size(); i++) {
			String numStr = alStr.get(i);
			System.out.println(i + "번째 값 : " + numStr);
		}
	}

	void printAlStr() {
		/*
		 * for (String s : alStr) { System.out.println(s); }
		 */
		// 0123456789
		// 13456789
		for (int i = 0; i < alStr.size(); i++) {
			if (Integer.parseInt(alStr.get(i)) % 2 == 0) {
				alStr.remove(i);
				i--;
			} else {
				// System.out.println(alStr.get(i)+"값의 인덱스는 : "+i);
				System.out.println(i + "번째 값 : " + alStr.get(i));
			}

		}
	}
	
	
	void addPrint() {
		int result=0;
		for(int i=0; i<alStr.size();i++) {
			result +=Integer.parseInt(alStr.get(i));
			
		}
		System.out.println(result);
	}

}
