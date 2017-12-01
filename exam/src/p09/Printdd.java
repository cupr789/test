package p09;

 class Son extends FaFa {
	
	public void print() {
		System.out.println("아들꺼");
	}
	public void twoPrint() {
		super.print();
		this.print();
	}

}

public class Printdd{
	public static void main(String[] args) {
		Son sn = new Son();
		sn.twoPrint();
		sn.print();
	}
}