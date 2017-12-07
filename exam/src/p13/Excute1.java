package p13;

import java.util.ArrayList;

public class Excute1 {
	public static void main(String[] args) {
		Person1 p = new Person1();
		p.setName("a");
		p.setAge(1);
		ArrayList<Person1> alPerson1 = new ArrayList<Person1>();
		alPerson1.add(p);
		
		p = new Person1();
		p.setName("d");
		p.setAge(2);
		alPerson1.add(p);
		
		p = new Person1();
		p.setName("d");
		p.setAge(4);
		alPerson1.add(p);
		
		p = new Person1();
		p.setName("d");
		p.setAge(6);
		alPerson1.add(p);
		
		p = new Person1();
		p.setName("d");
		p.setAge(3);
		alPerson1.add(p);
		

		
		
		for (Person1 pr : alPerson1) {
			System.out.println(pr);
		}
		System.out.println("");
		System.out.println("---------------------------");
		System.out.println("");

		Person1 tempPs = new Person1();
		
/*		for (int i = 0; i < alPerson1.size(); i++) {
			for (int x = i + 1; x < alPerson1.size(); x++) {
				if (alPerson1.get(i).getAge() < alPerson1.get(x).getAge()) {
					tempPs = alPerson1.get(i);
					alPerson1.remove(i);
					alPerson1.add(tempPs);
				}
				else {	
					x++;
				}
				x--;
			}
			
			
		}*/
		

		/*
		 * for(int i=0;i<alPerson1.size();i++) { Person1 pr = alPerson1.get(i); for(int
		 * j=i+1;j<alPerson1.size();j++) { Person1 pr2 = alPerson1.get(j);
		 * if(pr.getAge()<pr2.getAge()) { Person1 tmpP = pr; pr=pr2; pr2=tmpP;
		 * alPerson1.set(i, pr); alPerson1.set(j, pr2); }
		 * 
		 * } }
		 */
		for (Person1 pr : alPerson1) {
			System.out.println(pr);
		}
		
		
		
		System.out.println("=========");
		for(int i=0; i<alPerson1.size(); i++) {
			if(alPerson1.get(i).getAge()==3) {
			
				System.out.println(i);
			}
		}
		
		

	}
}
