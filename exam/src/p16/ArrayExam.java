package p16;

import java.util.ArrayList;

public class ArrayExam {
	
	private ArrayList list;
	
	public ArrayExam() {
		list = new ArrayList();
		
	}
	
	public ArrayList getArrayList(int a, int b) {
		for(int i=a;i<=b;i++) {
			list.add(i);
		}
		return list;
	}

}
