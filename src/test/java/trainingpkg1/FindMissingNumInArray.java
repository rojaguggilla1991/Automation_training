package trainingpkg1;

import java.util.ArrayList;

public class FindMissingNumInArray {
	
	public void missingNumber() {
		
		int[] a = {1,2,5,6,7};
		int j = 0;
		
		ArrayList list = new ArrayList();
		
		
		
		for(int i = 1;i<=7;i++) {
			
			if (a[j]!= i) {
				
				list.add(i);
				j=j;
				
			}else {
				j=j+1;
			}
			
		
				
	}
		
		System.out.println(list);
	}

	public static void main(String[] args) {
		
		FindMissingNumInArray obj = new FindMissingNumInArray();
		
		obj.missingNumber();
		// TODO Auto-generated method stub

	}

}
