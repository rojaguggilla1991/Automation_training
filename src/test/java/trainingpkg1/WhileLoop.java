package trainingpkg1;

public class WhileLoop {
	
	
	public void whileLoopMethod() {
	int x=10,sum =0;
	while(x>=1) {
		
		sum=sum+2;
		x--;
		System.out.println("inside "  +  sum);
		System.out.println("outside"  + sum);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          WhileLoop obj = new WhileLoop();
          	obj.whileLoopMethod();
	}

}
