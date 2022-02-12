package trainingpkg1;

public class PracticeNestedIf {
	
	public void nestedIfMethod() {
		
		int x = 1;
		int y = 2;
		
		
		if(x==1) {
		if(y==2) {
			System.out.println("x = "  +x);
			System.out.println("y = "  +y);
		}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeNestedIf obj = new PracticeNestedIf();
		
		obj.nestedIfMethod();
	}

}
