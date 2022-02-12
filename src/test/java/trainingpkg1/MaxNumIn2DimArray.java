package trainingpkg1;

public class MaxNumIn2DimArray {
			
		public void max2Array() {
			
			int[][]a= {{2,4,6,8},{9,3,5,7,1}};
			
			int max = a[0][0];
			
			for(int row = 0;row<a.length;row++) {
				
				
				
				for(int col = 0;col<a[row].length;col++) {
					
					
					
					if(max<a[row][col]) {
						
					   max = a[row][col];
						
						
					}
					
					
				}
				
				System.out.println("max num in row is  "   +max);
			}
				
				
				System.out.println("max num in an array is  "   +max);
			
			
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			MaxNumIn2DimArray obj = new MaxNumIn2DimArray();
			obj.max2Array();
		}

	}



