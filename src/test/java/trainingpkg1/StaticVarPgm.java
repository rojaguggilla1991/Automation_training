package trainingpkg1;

public class StaticVarPgm {
	
		String str = "roja";
		
		static String strng = "yuvan";
		
		public void method1() {
			
			System.out.println(str);
			System.out.println(strng);
			
		}
		
		
		public void method2() {
			
			System.out.println(str);
			System.out.println(strng);
		}

		public void method3() {
	
	System.out.println(str);
	System.out.println(strng);
}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			StaticVarPgm obj = new StaticVarPgm();
			StaticVarPgm obj1 = new StaticVarPgm();
			StaticVarPgm obj2 = new StaticVarPgm();
			
			obj.method1();
			obj1.method2();
			obj2.method3();
			
		obj.str = "red";
		
		obj.strng = "yellow";
		
		obj.method1();
		obj.method2();
		obj.method3();
		
			
	}

}
