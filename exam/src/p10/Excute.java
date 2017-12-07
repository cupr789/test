package p10;

public class Excute extends Father {
	// int a=4;
	public Excute(int num1, int num2) {
		super(num1, num2);
	}
	
	public void print(Father f) {
		System.out.println(f.toString());
	}

	void print() {
		String[] strs = { "3", "6", "9" };
		String printStr = "";

		for (int i = minNum; i <= maxNum; i++) {
			String str = i + "";
			for (String s : strs) {
				str = str.replace(s, "짝");
			}

			if (str.indexOf("짝") > -1) {
				for (char c : str.toCharArray()) {
					if (c == '짝') {
						printStr += c;
					}
				}
			} else {
				printStr += str;
			}

			printStr += ",";
			if (i % 10 == 0) {
				printStr += "\n";
			}
		}
		System.out.println(printStr);
	}

	public void print(int a) {
		if (a == 0) {
			this.print();
		} else {
			super.print();
		}
	}

	public static void main(String[] args) {
		

		Father f = new Father(1, 2);
/*		System.out.println(f);
		Excute e = new Excute(1, 2);
		e.print(f);*/
		
		
		
		
		
		
		
		SonOfSon son1 =new SonOfSon();
		son1.printUser();
		
		
		Father f1 = new Son();
		Father f2 = new Excute(1, 2);
		System.out.println(f2 instanceof Excute);
		System.out.println(f2 instanceof Father);
		System.out.println(f instanceof Excute);
		System.out.println(f1 instanceof Father);
		System.out.println(f1 instanceof Excute);
		Father[] fs = new Father[3];
		fs[0] = new Father(1, 2);
		fs[1] = f1;

		Excute[] ec = new Excute[3];
		
		Father f3 = new SonOfSon();
		Father f4 = new Father(1, 2);
		SonOfSon sos = (SonOfSon) f3;
		sos.printString("이게??");
		f3.print();

		sos.print();
		sos.printString("dddd");
		sos.printUser();

		System.out.println(f3 instanceof Father);
		System.out.println(f3 instanceof Excute);
		System.out.println(f3 instanceof SonOfSon);



		
	}
}
