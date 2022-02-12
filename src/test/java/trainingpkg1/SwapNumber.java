package trainingpkg1;

public class SwapNumber {
	
	
	public void swapNumberUsingAddparameter() {

		int a= 10;

		int b=5;

		int c;

		c=a+b;

		a=c-a;

		b=c-a;

		System.out.println("swap value = "+a+ "and" +b);
	}

		public static void main(String[] args) { // TODO Auto-generated method stub

		SwapNumber obj = new SwapNumber();
		
		obj.swapNumberUsingAddparameter();


		}
}
