package trainingpkg1;

public class ChildClass extends ParentClass {
	public void ChildMethod() {

		System.out.println("i m in ChildMethod");
	}

	public static void main(String []args) {

		ChildClass obj = new ChildClass();
		obj.ChildMethod();
		obj.ParentMethod();
	}
}
