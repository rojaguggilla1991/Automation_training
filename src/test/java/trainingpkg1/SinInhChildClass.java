package trainingpkg1;

public class SinInhChildClass extends  SinInhParentClass{
	int r = 2;
	String s = "roja";
	double t = 10.1;

	
	public SinInhChildClass() {
		// TODO Auto-generated constructor stub
		System.out.println("i m in childclass constructor");
	}
	
	public void childMethod() {
	System.out.println("i m in childmethod");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SinInhChildClass obj1 = new SinInhChildClass();
		obj1.childMethod();
		System.out.println(obj1.r+" "+obj1.s+" "+obj1.t+" ");
		
	    obj1.parentMethod();
	    System.out.println(obj1.a+" "+obj1.b+" "+obj1.c+" ");
	}
	

}
