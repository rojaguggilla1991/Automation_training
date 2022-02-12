package testNGPkg;

import org.testng.annotations.Test;

public class DependsOnMethodAndGroups {
	
	
	@Test(groups = "pre-tests")
	public void init() {
		System.out.println(" i m in init method");
	}
	
	@Test(groups = "tests",dependsOnGroups = "pre-tests")
	public void insert() {
		System.out.println(" i m in insert method");
	}
	
	@Test(groups = "tests",dependsOnMethods = "insert")
	public void selectMethod() {
		System.out.println(" i m in select method");
	}
	
	@Test(groups = "tests",dependsOnMethods = "selectMethod")
	public void updateMethod() {
		System.out.println(" i m in update method");
	}
	
	@Test(groups = "tests",dependsOnMethods = "updateMethod")	
	public void deleteMethod() {
		System.out.println(" i m in delete method");
	}
	
	@Test(dependsOnGroups = "tests")
	public void cleanUpMethod() {
		System.out.println(" i m in cleanup method");
	}


}

