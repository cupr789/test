package p11;

import java.util.ArrayList;

public class StringList extends ArrayList {
	
/*	public String toString() {
		return "난 내가 뭘찍어야 할지 모르겠다.";
	}*/
	
	public boolean add(Object e) {
		return super.add("0");
	}

	public static void main(String[] args) {
		StringList sl = new StringList();
		sl.add("1");
		sl.add("2qsfdsaf");
		sl.add("1sdgyffg");
		System.out.println(sl);

	}
}
