package trainingpkg1;

import java.io.File;

public class ExceptionHandling {
	
	public void arithmeticException() {
		
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			
			System.out.println(c);
		} catch (NullPointerException e) {
			
			System.out.println("i m in catch block");
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			System.out.println("try catch method");
		}
	}
	
	public void nullpointerException() {
		
		try {
			String str = null;
			System.out.println(str.charAt(0));
			} 
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("i m in null pointer");
			
			e.printStackTrace();
			
		}catch (Exception e) {
			System.out.println("im in execption method");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	
		public void stringOutOfBoundException() {

			try {
				String str = "hi";

				System.out.println(str.charAt(5));

			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("i m in null pointer");

				e.printStackTrace();
			}
		}

	
	public void fileNotFound() {
		
		try {
			File f1 = new File("c:file.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
				
			}
	public void arrayOutOfBoundException() {
		int a[]  = new int[5];
		a[6] = 9;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling obj = new ExceptionHandling();
		
		//obj.arithmeticException();
		obj.nullpointerException();
		obj.stringOutOfBoundException();
		obj.arrayOutOfBoundException();

	}

}
