package trainingpkg1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListItarator {
	
	public void iteratorMethod() {
		
		ArrayList <String> list = new ArrayList();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		System.out.println(list);
		
		Iterator<String> iter = list.iterator();
		
		while (iter.hasNext()) {
			
			System.out.println(iter.next()+" ");
		}
			
		
	}

	public static void main(String[] args) {
		
		ArrayListItarator obj = new ArrayListItarator();
		
		obj.iteratorMethod();
		// TODO Auto-generated method stub

	}

}
