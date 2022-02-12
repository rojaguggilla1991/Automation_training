package trainingpkg1;

public class OverRide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rbi obj = new Sbi();
		obj.deposit();
		obj.transfer();
	
   Rbi obj1 = new Rbi();
   obj1.deposit();
   obj1.transfer();
	}
	
}
