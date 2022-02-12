package testNGPkg;

import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("i am in beforesuite method");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("i am in aftersuite method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("i am in beforetest method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("i am in aftertest method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("i am in beforeclass method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("i am in afterclass method");
	}
	
	@Test
	public void testMethod() {
		System.out.println("i am in test method");
	}
	
	@Test
	public void testMethod1() {
		System.out.println("i am in test method");
	}

}
