package p16;

import java.util.ArrayList;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class Exam {
	
	public void sort(ArrayList<Integer> list) {
		ArrayList<Integer> numList = list; 
		int min=numList.get(0);
		int idx=0;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		for(int i=0; i<numList.size(); i++) {
			
			if(min>numList.get(i)) {
				min = numList.get(i);
				idx = i;
			}
			if(i==numList.size()-1) {
				tempList.add(min);
				numList.remove(idx);
				i=-1;
				idx=0;
				try {
				min=numList.get(0).intValue();
				}
				catch(Exception e){
					break;
				}
			}
		}
		
		int count =0;
		for(Integer a : tempList) {
			count++;
			if(count==tempList.size()) {
				System.out.print(a);
			}
			else {
				System.out.print(a+",");
			}
		}
		
	}
	
	public static void main(String[] args) {
			Exam e = new Exam();
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Integer> totalList = new ArrayList<Integer>();
		ArrayList<Integer> avgList = new ArrayList<Integer>();
		
		int total=0;
		ArrayList<Integer> firstList = new ArrayList<Integer>();
		for(int x=0; x<5; x++) {
			 firstList = new ArrayList<Integer>();
			for(int i=0; i<5; i++) {
				System.out.println((x+1)+"번째 학생 "+(i+1)+"과목 점수 입력");
				firstList.add(Integer.parseInt(sc.nextLine()));
			}
			for(int y=0; y<5;y++) {
				 total += firstList.get(y).intValue();
			}
			System.out.println((x+1)+"번째 학생 입력점수 오름차순");
			e.sort(firstList);
			System.out.println("");
			totalList.add(total);
			avgList.add(total/5);
			total=0;
		}
		sc.close();
		int cnt =1;
		for(Integer a1: totalList) {
			System.out.println(cnt+"번째 학생 총점: "+a1);
			cnt++;
		}
		System.out.println("");
		cnt =1;
		for(Integer a1: avgList) {
			System.out.println(cnt+"번째 학생 평균: "+a1);
			cnt++;
		}
		System.out.println("");
		System.out.println("총점을 오름차순");
		e.sort(totalList);
		System.out.println("");
		System.out.println("평균을 오름차순");
		e.sort(avgList);
		
		
		
	}
}
