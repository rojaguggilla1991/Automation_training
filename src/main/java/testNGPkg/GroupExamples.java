package testNGPkg;

import org.testng.annotations.Test;

public class GroupExamples {
	
	
	@Test(groups = "smoketest")
	public void method1() {
		System.out.println("i m in method1");
	}
	@Test(groups = "regression")
	public void method2() {
		System.out.println("i m in method2");
	}
	@Test(groups = "smoketest")
	public void method3() {
		System.out.println("i m in method3");
	}
	@Test(groups = "regression1")
	public void method4() {
		System.out.println("i m in method4");
	}

}
