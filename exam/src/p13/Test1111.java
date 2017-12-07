package p13;

import java.util.ArrayList;

public class Test1111 {
	public static void main(String[] args) {
		
		ArrayList<Person1> nums = new ArrayList<Person1>();
		Person1 p = new Person1();
		nums.add(p);
		p=new Person1();
		nums.add(p);
		p.setAge(3);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(p);
	}
}
