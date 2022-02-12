package trainingpkg1;

public class NewProgram {
	
	public void intMethod() {
		
		int[] a =	{25,30,35,40,1};
		int max = a[0];
		
		
		for(int i = 0; i<a.length; i++) {
			if(max<=a[i]) {
				max =a[i];
			}			
		}		
		
		
		System.out.println("max num of array is "  +max);
	}
	
	
	
	
	
	public static void main (String[] args) {
		
		NewProgram obj = new NewProgram();
		obj.intMethod();
	}
	
}
	
	
	
	
	
	
	