package trainingpkg1;

public class OverrideMethodExecuteClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverwriteParentClass obj = new  MethodOverrideCallParentClass();
		obj.eat();
		obj.getInterest();
		obj.getnoice();
		obj.parentmethod();
		
		//MethodOverwriteParentClass obj1 = new MethodOverwriteParentClass();
		//obj1.eat();
		//obj1.getInterest();
		//obj1.getnoice();
		//obj1.parentmethod();
		
	}

}
