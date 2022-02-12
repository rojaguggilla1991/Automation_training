package testNGPkg;

import org.testng.annotations.Test;

public class ParallelExcecutionTest1 {
	
	
	@Test
	public void method1() {
		System.out.println("i m in method1");
	}
	@Test
	public void method2() {
		System.out.println("i m in method2");
	}
	@Test
	public void method3() {
		System.out.println("i m in method3");
	}
	@Test
	public void method4() {
		System.out.println("i m in method4");
	}

}
