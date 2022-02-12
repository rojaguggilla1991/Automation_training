package trainingpkg1;

public class MultiLevelInh extends SinInhChildClass {
	
	int x = 1;
	String y = "yuvan";
	double z = 1.1;
	
	public MultiLevelInh() {
		// TODO Auto-generated constructor stub
		
	System.out.println("i m in multi level class constructor");
	}
public void multiLevelmethod() {
	

System.out.println("i m in multilevel method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiLevelInh obj = new MultiLevelInh();
		
		
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.z);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.r);
		System.out.println(obj.s);
		System.out.println(obj.t);
		
		obj.childMethod();
		obj.multiLevelmethod();
		obj.parentMethod();
	}

}