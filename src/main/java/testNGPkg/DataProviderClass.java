package testNGPkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {
	

	@Test(dataProvider = "getDataMethod")
	public void method1(String username,String password) {
		System.out.println("username" + username);
		System.out.println("password" + password);
	}
	

	@Test(dataProvider = "getDataMethod")
	public void method2(String username,String password) {
		System.out.println("username value is : " + username);
		System.out.println("password : " + password);
	}
	

	@Test(dataProvider = "getDataMethod")
	public void method3(String username,String password,String abc) {
		System.out.println("username" +username);
		System.out.println("password" +password);
		System.out.println("abc" + abc);
	}
	//@DataProvider
	//public Object [][] getDatamethod(){
		//Object[][]data = new Object[2][2];
			//FIRST ROW
		//	data[0][0] ="roja";
		//	data[0][1] ="class";
			//second row
			//data[1][0] ="roja1";
		////	data[1][1] ="class1";
			
			//return data;
			
	
	@DataProvider
	public Object [][] getDatamethod(){
		return new Object[][] {
			{"username"},{"password1"}
		};
				
	}
}
