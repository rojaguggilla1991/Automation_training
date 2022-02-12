package trainingpkg1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	
	public void createFileMethod() {
		
		File cfm = new File(".txt");
		
		try {
			boolean value = cfm.createNewFile();
			
			System.out.println(value);
			
			if(value) {
				
				System.out.println("the new file is created");
				
			}else {
				System.out.println("the file is already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public void readfilemethod() {
		
		char[] array = new char[100];
		
				
				try {
					
					FileReader frobj = new FileReader("C:\\Automation PROJECT_SELENIUM\\DEC06.txt");
					try {
						frobj.read(array);
						System.out.println(array);
						//closing the file reader
						frobj.close();
						
					boolean IOException;
					 (IOException);
						
					
						
					

		
	}

	public static void main(String[] args) {
		
		FileHandling obj = new FileHandling();
		
		obj.createFileMethod();
		obj.createFileMethod();
		obj.readfilemethod();
		obj.writeDataIntoFileMethod();
		obj.readfilemethod();
		// TODO Auto-generated method stub

	}
	private void writeDataIntoFileMethod() {
		// TODO Auto-generated method stub
		
	}

}
