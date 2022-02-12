package trainingpkg1;

public class MinPrgrm {
	
	public void minMethod() {
		
		int a[] = {3,8,1,9,12,6};
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			
		
			if (min>=a[i]) {
		    min = a[i];
			}
			
		
		}
		System.out.println("min number is "  +min);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MinPrgrm obj = new MinPrgrm();
		obj.minMethod();
	}

}
