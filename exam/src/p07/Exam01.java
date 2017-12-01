package p07;

import java.util.Scanner;

public class Exam01 {
	int[] nums = new int[5];
	Scanner sc = new Scanner(System.in);
	
	void checkNums() {
		if (nums[0] < nums[1]) {
			int temp = nums[1];
			nums[1] = nums[0];
			nums[0] = temp;
		}

		else if (nums[2] < nums[3]) {
			int temp = nums[2];
			nums[2] = nums[3];
			nums[3] = temp;
		}
	}

	void inputNums() {

		for(int i=0; i<nums.length;i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요!");
			nums[i] = sc.nextInt();
		}
	}

	void print() {
		int temp = 0;
		int count=0;
		int totalCount = 0;
		for (int i = nums[0]; i >= nums[1]; i--) {

			for (int x = nums[2]; x >= nums[3]; x--) {
				temp = i * x;
				if(temp % nums[4]==0) {
					count++;
				}
				if (x == 1) {
					
					System.out.print(i + " X " + x + "= " + (temp % nums[4] == 0 ? temp + ", " + nums[4] + "의 배수! " : temp)+"   \r\n"+i+"단의 "+nums[4]+"의배수 갯수는 " +count+"개\r\n");
					totalCount+=count;
					count =0;

				} else {
					System.out.print(
							i + " X " + x + "= " + (temp % nums[4] == 0 ? temp + ", " + nums[4] + "의 배수! " : temp + ", "));
				}
			}
			System.out.println("");
		}
		System.out.println(nums[4]+"의 배수 총 갯수는 "+totalCount+"개");
	}
	

	public static void main(String[] args) {

		Exam01 ex = new Exam01();
		ex.inputNums();
		ex.print();
		ex.sc.close();
		
	}
	
	


}
