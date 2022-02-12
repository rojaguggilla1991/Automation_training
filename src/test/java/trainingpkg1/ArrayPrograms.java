package trainingpkg1;

public class ArrayPrograms {
	
	String name = " my name is  roja ";
	
	public void stringMethod() {
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(6));
		
		System.out.println(name.indexOf("a"));
		
		System.out.println(name.compareTo(" my name is roja "));
		
		System.out.println(name.compareToIgnoreCase("he is 6 years old"));
		
		System.out.println(name.concat("he likes toys"));
		
		System.out.println(name.endsWith("roja"));
		
		System.out.println(name.startsWith(" "));
		
		System.out.println(name.trim());
		
		System.out.println(name.toLowerCase());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.substring(5));
		
		System.out.println(name.substring(5,10));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayPrograms obj = new ArrayPrograms();
		obj.stringMethod();

	}

}
