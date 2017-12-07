package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {
	public static void main(String[] args) {
		HashMap<String,String>hm = new HashMap<String,String>();
		hm.put("age", 10+"");
		hm.put("name", "홍길동");
		
		
		ArrayList<HashMap<String, String>>al = new ArrayList<HashMap<String, String>>();
		
		Random rd = new Random();
		
		
		
		
		for(int i =0; i<5; i++) {
			int rdNum = rd.nextInt(5)+1;
			hm=new HashMap<String,String>();
			hm.put("age", rdNum+"");
			hm.put("name", rdNum+"홍길동");
			al.add(hm);
		}
		
		//1,3,6,8,4,5,10
		//3,1,6,8,4,5,10
		
		
		
		for(HashMap<String, String>h:al) {
			System.out.println(h);
		}
		
		System.out.println("");
		ArrayList<HashMap<String, String>>al2 = new ArrayList<HashMap<String, String>>(); 
		 
		int max = 0;
		int idx = 0;
		
		for(int i=0; i<al.size();i++) {// al: 5 , i: 0,
			if(max<Integer.parseInt(al.get(i).get("age"))) {
				// max =2
				max = Integer.parseInt(al.get(i).get("age"));
				idx = i;
			}
			if(i==al.size()-1) {
				al2.add(al.get(idx));
				al.remove(idx);
				max = idx =0;
				i = -1;
			}
			
		}
		
		for(HashMap<String, String>h:al2) {
			System.out.println(h);
		}
	}
}
