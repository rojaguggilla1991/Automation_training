package trainingpkg1;

public class SinInhParentClass {

	int a = 1;
	String b = "roja";
	double c = 1.0;

	public SinInhParentClass() {
		// TODO Auto-generated constructor stub
		System.out.println("i m in Parent Class constructor");
	}

	public void parentMethod() {
		System.out.println("i m in Parent Method");

	}
	
	public static void main (String[]args) {
		
	
		SinInhParentClass obj = new SinInhParentClass() ;
		obj.parentMethod();
		System.out.println(obj.a+" "+obj.b+" "+obj.c+" ");
		
	}
	

	 
	  
}
