package testNGPkg;

import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority = 3,enabled = false)
	public void method1() {
		System.out.println("i m in method1");
	}
	@Test(priority = 1,enabled = true)
	public void method2() {
		System.out.println("i m in method2");
	}
	@Test(priority = 2,enabled = true,invocationCount = 5)
	public void method3() {
		System.out.println("i m in method3");
	}
	

}
