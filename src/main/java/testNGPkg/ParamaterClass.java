package testNGPkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamaterClass {
	
	@Parameters("name")
	
	@Test
	public void Method1(String name) {
	System.out.println("i am in Method1");
	System.out.println("String Value : " + name );
	}
	}



