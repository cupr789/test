package test;

public class User {
	private String name;
	private int age;
	private int no;
	
	
	User(String name, int age, int no){
		this.name = name;
		this.age = age;
		this.no = no;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", no=" + no + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	
	
}
