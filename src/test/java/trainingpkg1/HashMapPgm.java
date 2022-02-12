package trainingpkg1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;

public class HashMapPgm {

	HashMap hm = new HashMap();

	public void insertElementsIntoHashMap() {

		hm.put(1,2);
		hm.put("r", "s");
		hm.put(0.9,0.8);
		hm.put(5, 6);


		System.out.println(hm);

	}


	public void fetchValue() {

		System.out.println(hm.get(0.9));
	}


	public void changeValue() {
		hm.put(5,"hi");
		hm.put(1, "yes");

		System.out.println(hm);
	}


	public void findPosition() {
		System.out.println(hm.get(0));


	}
	public void accessmethod() {
		System.out.println(hm.get(2));
	}

	public void changeMethod() {
		hm.put("r", 10);
		System.out.println(hm.get("r"));

	}

	public void removeValue() {

		hm.remove(5);
		System.out.println(hm);
	}

	public void removeDupValue() {


HashMap hm1 = new HashMap ();


		hm1.add("a");
		hm1.add("cake");
		hm1.add("chips");
		hm1.add("pins");

		LinkedList hm2 = new LinkedList();

		hm2.add("a");
		hm2.add("red");
		hm2.add("chips");
		hm2.add("green");

		System.out.println(hm1);
		System.out.println(hm2);

		hm1.removeAll(hm2);
		System.out.println(hm1);

		hm2.removeAll( hm1);
		System.out.println(hm2);


	}





	public void printCommonValues() {

		LinkedList hm3 = new LinkedList();

		hm3.add("a");
		hm3.add("cake");
		hm3.add("chips");
		hm3.add("pins");

		LinkedList hm4 = new LinkedList();

		hm4.add("a");
		hm4.add("red");
		hm4.add("chips");
		hm4.add("green");

		System.out.println(hm3);
		System.out.println(hm4);

		hm4.retainAll(hm3);
		System.out.println(hm4);

		hm4.remove(1);
		System.out.println(hm4);

		hm4.clear();
		System.out.println(hm4);

	}


	public static void main(String[] args) {
		

		HashMapPgm obj = new HashMapPgm();
		obj.insertElementsIntoHashMap();
		obj.fetchValue();
		obj.changeValue();
		obj.removeDupValue();
		obj.removeValue();
		obj.printCommonValues();
		obj.findPosition();
		
		// TODO Auto-generated method stub

	}

}
