package trainingpkg1;

public class ForLoop {

	public void forLoopMethod() {

		int sum = 0;

		int i;

		for( i = 1;i<=10;i++) {

			//for( int i = 10;i>=10;i--)


			System.out.println("printing i value" + i);

			sum = sum+i;

			System.out.println("sum value inside the loop" +sum);

			System.out.println("printing i value" + i);

		}
		System.out.println("sum value outside the loop" +sum);
	}


	public void forEachMethod() {

		int[] marks = {80,90,95,100,75};

		for(int num:marks) {
			System.out.println("printing each marks value: " +num );
		}



	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ForLoop obj = new ForLoop();
	//	obj.forLoopMethod();
		obj.forEachMethod();
	}

}
