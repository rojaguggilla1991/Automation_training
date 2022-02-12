package trainingpkg1;

public class ThisKeyword {

	String empname;
	String empdpt;
	
	public void method1(String empname,String empdpt) {
	
		this.empname = empname;
		this.empdpt = empdpt;
	}
	
	public void printVariables() {
		
		System.out.println(empname);
		System.out.println(empdpt);
	}
	public static void main(String[] args) {
		
		ThisKeyword obj = new ThisKeyword();
		obj.method1("ofc","manager");
		obj.method1("obc","manages");
		
		obj.printVariables();
		
		// TODO Auto-generated method stub

	}

}
