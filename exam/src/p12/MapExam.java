package p12;

import java.util.HashMap;
import java.util.Random;

public class MapExam {

	HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
/*	void add(String str) {
		hm.put(hm.size(), str);
	}*/
	void add(int idx) {
		
		if(hm.get(idx)==null) {
			System.out.println("넘어온 idx : "+idx);
			System.out.println(hm.size()+1);
			hm.put(idx, (hm.size()+1)+"번째 값");
		}
		
	}
	
	public static void main(String[] args) {
		MapExam me = new MapExam();
		
		Random rd =new Random();
		
		for(int i=0; i<10;i++) {
			int rdNum = rd.nextInt(10);
			me.add(rdNum);
		}
		System.out.println(me.hm);
	}
}
