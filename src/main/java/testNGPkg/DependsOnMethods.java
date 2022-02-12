package testNGPkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependsOnMethods {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("i m in before method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("i m in after method");
	}
	@Test(dependsOnMethods = "testMethod3")
	public void testMethod1() {
		System.out.println(" i m in test method 1");
	}
	@Test(dependsOnMethods = "testMethod1")
	public void testMethod2() {
		System.out.println(" i m in test method 2");
	}
	@Test
	public void testMethod3() {
		System.out.println(" i m in test method 3");
	}

}

