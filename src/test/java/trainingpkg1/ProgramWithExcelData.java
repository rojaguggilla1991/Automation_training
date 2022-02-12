package trainingpkg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.

public class ProgramWithExcelData {
	
	public void excelDataMethod() {
		
		try {
			FileInputStream fis = new  FileInputStream("file location");
			try {
				HSSFWorkbook wb = new HSSFWorkbook (fis);
				HSSFSheet sheet =wb.getSheet("sheet name");
				
				for(int count = 1;count<=sheet.getLastRowNum();count++) {
					HSSFRow row = sheet.getRow(count);
					
					
					if(row.getCell(1)!=null){
						//write the method logic to perform the data creation
						
						//write the method logic to perform the data creation
						HSSFCell cell = row.createCell(2);
						cell.setCellValue("status");
						fis.close();
			            FileOutputStream fos = new  FileOutputStream("file location");
			            wb.write(fos);
			            fos.close();
					}
					
						
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
			
		}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
