package trainingpkg1;

public class PublicAccessModifierProgram {
	
	private int private_a = 10;
	public String name = "ROJA";
	
	private void private_method() {
		System.out.println("i m in private method");
		
	}
	
	public void public_method( ) {
		System.out.println("i m in public method");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicAccessModifierProgram obj = new PublicAccessModifierProgram();
		
		System.out.println(obj.private_a);
		System.out.println(obj.name);
		
		obj.private_method();
		obj.public_method();
	}

}
