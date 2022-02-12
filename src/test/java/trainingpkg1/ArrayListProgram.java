package trainingpkg1;

import java.util.ArrayList;

public class ArrayListProgram {
	
	ArrayList r = new ArrayList();

	public void createArrayList() {

		

		r.add("hi");
		r.add(646);
		r.add(1.2);
		r.add("home");
		r.add("new list");

		System.out.println(r);
		r.add(123);
		r.add("types");

		System.out.println(r);


	}

	public void accessArrayListElement() {


		System.out.println(r.get(3));
	}

	public void changeArrayListValue() {

		r.set(1,"ih");

		System.out.println(r);
	}
	
	
	public void removeArrayListValue() {
		
		r.remove(2);
	}
	
	public void mergeArrayList() {
		
		ArrayList r2 = new ArrayList();
		ArrayList r3 = new ArrayList();
		ArrayList r4 = new ArrayList();
		
		r2.add("home");
		r3.add("homes");
	//	r2.add(r3);
		r4.add(r2);
		r4.add(r3);
		
		System.out.println(r4);
		
	}
	
	public void removeDupArrayListValues() {
		
		ArrayList r5 = new ArrayList();
		
		r5.add("a");
		r5.add("cake");
		r5.add("chips");
		r5.add("pins");
		
		ArrayList r6 = new ArrayList();
		
		r6.add("a");
		r6.add("red");
		r6.add("chips");
		r6.add("green");
		
		System.out.println(r5);
		System.out.println(r6);
		
		r5.removeAll(r6);
		System.out.println(r5);
		
		r6.removeAll(r5);
		System.out.println(r6);
		
		
		
		
	}
	
	public void printCommonValues() {
		
ArrayList r5 = new ArrayList();
		
		r5.add("a");
		r5.add("cake");
		r5.add("chips");
		r5.add("pins");
		
		ArrayList r6 = new ArrayList();
		
		r6.add("a");
		r6.add("red");
		r6.add("chips");
		r6.add("green");
		
		System.out.println(r5);
		System.out.println(r6);
		
		r6.retainAll(r5);
		System.out.println(r6);
		
		r6.remove(1);
		System.out.println(r6);
		
		r6.clear();
		System.out.println(r6);
		
	}
	
	

	public static void main(String[] args) {

		ArrayListProgram obj = new ArrayListProgram();

		obj.createArrayList();
		obj.accessArrayListElement();
		obj.changeArrayListValue();
		obj.mergeArrayList();
		obj.removeDupArrayListValues();
		obj.printCommonValues();
		
		// TODO Auto-generated method stub

	}

}
