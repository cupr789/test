package p09;

public class ForExam {

	public static void main(String[] args) {
		int[][] nums = new int[4][3];
		int[] a = new int[3];
		int[] b = new int[4];
		
		nums[0] = a;
		nums[1] = b;
		nums[2] = new int[5];
		nums[3] = new int[6];
		System.out.println(nums.length);
		System.out.println(nums[0].length);
		for(int i=0;i<3;i++) {
			nums[0][i]=(i+1);	
		}
		
		System.out.println();
		
		int addNum=1;
		for(int i=0;i<nums.length;i++) {
			if(i!=0) {
				addNum+=nums[i-1][i+1];
			}
			for(int x=0;x<nums[i].length;x++) {
				nums[i][x]=addNum+x;
			}
		}
		

		for(int i=0;i<nums.length;i++) {
			for(int x=0;x<nums[i].length;x++) {
				System.out.print(nums[i][x]+", ");
			}
			System.out.println();
		}
				
	}

}
