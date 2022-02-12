package trainingpkg1;

public class MinNumIn2DimArray {
	
	public void min2Array() {
		
		int[][]a= {{2,4,6,8},{9,3,5,7,1}};
		
		int min = a[0][0];
		
		for(int row = 0;row<a.length;row++) {
			
			
			
			for(int col = 0;col<a[row].length;col++) {
				
				
				
				if(min>a[row][col]) {
					
				   min = a[row][col];
					
					
				}
				
				
			}
			
			System.out.println("min num in row is  "   +min);
		}
			
			
			System.out.println("min num in an array is  "   +min);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MinNumIn2DimArray obj = new MinNumIn2DimArray();
		obj.min2Array();
	}

}
