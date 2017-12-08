package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {
	public static void main(String[] args) {
		MapExam me =new MapExam();
		Random rd = new Random();
		int[] arr = new int[5];
		ArrayList<MapExam> al= new ArrayList<MapExam>();
		
		
		
		for(int i=0;i<arr.length;i++) {
			
			
			
			for(int x=i+1;x<arr.length;x++) {
				int rdNum = rd.nextInt(5)+1;
				System.out.println("랜덤값!! : "+rdNum);
				arr[i]=rdNum;
				if(arr[i]==arr[x]) {
					i--;
					break;
				}
			}
			
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
		/*for(int i=0; i<5; i++) {
			me =new MapExam();
			int rdNum = rd.nextInt(5)+1;
			
			System.out.println("랜덤값!!!!"+rdNum);
			me.put("name", i+"");
			me.put("age", rdNum+"");
			al.add(me);
		}
		
		System.out.println(me.sortIng());
		System.out.println(al);
		//System.out.println(al.size());
*/		
		
		
	}
}
