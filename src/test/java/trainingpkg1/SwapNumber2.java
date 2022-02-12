package trainingpkg1;

public class SwapNumber2 {
	
	public void swapNumberwithoutParameter() {

		int a= 10;

		int b=5;

		a=a+b;

		b=a-b;

		a=a-b;
		
	

		System.out.println("value = "+a+"and"+b);
		
	}

		public static void main(String[] args) { // TODO Auto-generated method stub

		SwapNumber2 obj = new SwapNumber2();
		
		obj.swapNumberwithoutParameter();
		
		

}
}

