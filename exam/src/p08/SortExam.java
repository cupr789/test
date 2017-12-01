package p08;

public class SortExam {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 2, 3, 3, 4 };
		int cnt = 0;
		String dupl="";
		for (int j=0;j<nums.length;j++) {
			for (int i = j + 1; i < nums.length; i++) {
				if (nums[j] == nums[i]) {
					cnt++;
					dupl+= nums[j]+",";
					System.out.println("중복!!!!!");
				}
			}
		}
		System.out.println("중복갯수는 : "+cnt);
		System.out.println("중복숫자는 :"+dupl);
	}
}
