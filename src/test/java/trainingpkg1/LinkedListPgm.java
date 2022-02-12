package trainingpkg1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPgm {
	
	LinkedList ok = new LinkedList();

	
	public void	llp() {
		
		ok.add("string");
		
		ok.add(123);
		
		ok.add("light");
		
		ok.add(0.5);
		
		ok.add("how are you");
		
		ok.add(123);
		
		ok.add("light");
		
		
		System.out.println(ok);
			
		}
		
	

		public void findPosition() {
				System.out.println(ok.get(0));
		
			
	}
			public void accessmethod() {
				System.out.println(ok.get(2));
			}
		
		public void changeMethod() {
			ok.set(4, 5.0);
			System.out.println(ok.get(4));
			
		}
		
	public void removeValue() {
		
		ok.remove(5);
		System.out.println(ok);
	}
	
	public void removeDupValue() {
		
		LinkedList ok1 = new LinkedList ();
		

		ok.add("a");
		ok.add("cake");
		ok.add("chips");
		ok.add("pins");
		
		LinkedList ok2 = new LinkedList();
		
		ok.add("a");
		ok.add("red");
		ok.add("chips");
		ok.add("green");
		
		System.out.println(ok1);
		System.out.println(ok2);
		
		ok1.removeAll(ok2);
		System.out.println(ok1);
		
		ok2.removeAll(ok1);
		System.out.println(ok2);
		
		
	}
	
	public void printCommonValues() {
		
		ArrayList ok3 = new ArrayList();
				
				ok3.add("a");
				ok3.add("cake");
				ok3.add("chips");
				ok3.add("pins");
				
				LinkedList ok4 = new LinkedList();
				
				ok4.add("a");
				ok4.add("red");
				ok4.add("chips");
				ok4.add("green");
				
				System.out.println(ok3);
				System.out.println(ok4);
				
				ok4.retainAll(ok3);
				System.out.println(ok4);
				
				ok4.remove(1);
				System.out.println(ok4);
				
				ok4.clear();
				System.out.println(ok4);
				
			}
			
			
		
		public static void main (String[]args) {
			
		LinkedListPgm obj = new LinkedListPgm();
		
		
		obj.llp();
		
		obj.findPosition();
		
		obj.accessmethod();
		
		obj.changeMethod();
		
		obj.removeValue();
		
		obj.removeDupValue();
		
		obj.printCommonValues();
		
		
	}


}
