package trainingpkg1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListListIterator {
	
	public void listIteratorMethod() {
		
ArrayList <String> list = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list);
		
		ListIterator<String> ok = list.listIterator(1);
		
		while (ok.hasNext()) {
			
			System.out.println(ok.next()+ " ");
		}
		
		ListIterator<String> ok1 =list.listIterator(3);
		
		while (ok1.hasPrevious()) {
			
			System.out.println(ok1.previous()+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayListListIterator obj = new ArrayListListIterator();
		
		obj.listIteratorMethod();

	}

}
