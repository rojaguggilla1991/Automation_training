
package trainingpkg1;

import java.util.ArrayList;

public class ArrayListPgm1 {
	
	public void intArrayList() {
		
		ArrayList<Integer> game = new ArrayList<Integer>();
		
		game.add(123);
		game.add(456);
		game.add(789);
		
		System.out.println(game);
		
	}
	
	
	public void stringArrayList() {
		
		ArrayList<String> game1 = new ArrayList<String>();
		
		game1.add("abc");
		game1.add("def");
		game1.add("ghi");
		
		System.out.println(game1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListPgm1 obj = new ArrayListPgm1();
		
		obj.intArrayList();
		obj.stringArrayList();
		

	}

}
