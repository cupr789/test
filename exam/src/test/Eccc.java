package test;

import java.util.Scanner;

public class Eccc {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();
		
		int[][] arr = new int[firstNum][secondNum];
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int x=0; x<arr.length;x++) {
				i++;
				arr[i][x]=i;
				if(x==arr.length-1) {
					break;
				}
			}
		}
		
		
	}
}
