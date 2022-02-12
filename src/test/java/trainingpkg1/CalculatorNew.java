package trainingpkg1;

public class CalculatorNew {
	
	
	// without return type.
	public CalculatorNew() {
		
	}
	
	
	public void additionMethod() {
		System.out.println("Im in addtion method");
	}
	
	private int testMethod(int arg1, int arg2) {
		return arg1 + arg2;
	}
	
	
	public static void main(String args[]) {
		
		CalculatorNew object = new CalculatorNew();
		
		int total = object.testMethod(2, 3);
		System.out.println(total);
		
		int total2 = object.testMethod(4, 5);
		System.out.println(total2);
		
	}
	

}
