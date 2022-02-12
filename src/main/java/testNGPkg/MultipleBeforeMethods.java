package testNGPkg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleBeforeMethods {
	
	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("i m in before method 2");
	}
	@BeforeMethod
	public void beforeMethod1() {
		System.out.println("i m in before method 1");
	}
	
	@Test
	public void testMethod() {
		System.out.println("i m in test method");
	}
}
 