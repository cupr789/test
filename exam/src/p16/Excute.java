package p16;

public class Excute {
	
	public void printAction(Action act) {
		//eat호출시 누구누구가 먹습니다.
		act.eat();
		// sleep호출시 누구누구가 잡니다.
		act.sleep();
		// walk호출시 누구누구가 걷습니다.
		act.walk();
		//act.eat("asdf");
	}
	
	
	public static void main(String[] args) {
		Action act = new Hong("Hong", 10, 180, "hong@gmail.com");
		Excute e = new Excute();
		e.printAction(act);
		
		//동물도 이름 나이 몸길이를 가지게 만들어 주시구요
		// Cat생성자 호출시 이름 나이 몸길이를 저장하게 만들어 주세요.
		
		
		Cat c = new Cat("가필드",3,30);
		e.printAction(c);
		
	}
}
