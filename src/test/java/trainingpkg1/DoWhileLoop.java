package trainingpkg1;

public class DoWhileLoop {
	
	public void doWhileLoop() {
		
		int x=2,sum=0;
		
		do {
			sum = sum+x;
			x++;
			System.out.println("inside = "  +sum);
		}while(x<2);
		
		System.out.println("outside = "  + sum);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DoWhileLoop obj = new DoWhileLoop();
		obj.doWhileLoop();
	}

}
