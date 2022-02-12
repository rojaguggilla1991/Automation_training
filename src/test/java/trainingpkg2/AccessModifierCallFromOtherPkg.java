package trainingpkg2;

import trainingpkg1.PublicAccessModifierProgram;

public class AccessModifierCallFromOtherPkg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PublicAccessModifierProgram obj = new PublicAccessModifierProgram();
		
		System.out.println(obj.name);
		obj.public_method();
	}

}
