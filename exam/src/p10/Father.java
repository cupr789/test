package p10;

public class Father {
	public int minNum;
	public int maxNum;

	public String toString() {
		return "너냐? 날 부른게?";			
	}
	public Father(int minNum, int maxNum) {
		this.minNum = minNum;
		this.maxNum = maxNum;
	}

	void print() {
		System.out.println("아빠프틴트얌!!!");
	}

	public static void main(String[] args) {
		System.out.println("아빠 프린트");
	}
}
