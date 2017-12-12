package p16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import com.google.common.collect.Lists;

public class Exam {
	
	/*1. 총 5명의 학생의 점수를  Scanner클래스의 nextLine()함수를 사용하여 입력받아 총점과 평균을 구하고
	점수가 낮은 순서대로 출력
	ex) 입력 순서가 50점 60점 30점 70점 100 점이었다면 30,50,60,70,100 점수가 낮은대로*/
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer[] nums = {1,2,3,4,5};
		for(int i=0; i<5; i++) {
			System.out.println((i+1)+"번째 학생 점수 입력");
			nums[i]= Integer.parseInt(sc.nextLine());
		}

		ArrayList<Integer> numList = Lists.newArrayList(nums);

		
/*		Comparator comparator = Collections.reverseOrder();
		
		Collections.sort(numList,comparator);
		
		//Collections.sort(numList);
		
		System.out.println(numList);*/

		
		int min=numList.get(0);
		int idx=0;
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		
		// 20 60 10 40 100
		
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
}
