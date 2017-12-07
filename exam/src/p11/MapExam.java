package p11;

import java.util.HashMap;

public class MapExam {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("name", "윤재형");
		hm.put("name", "박재형");
		
		System.out.println(hm.get("name"));
	}
}
