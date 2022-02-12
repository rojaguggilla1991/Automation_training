package testNGPkg;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo360 {

	WebDriver driver;

	public void prtcMethod() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.eschool360.in/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'EXAMS')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Marks Entry')] ")).click();
		driver.switchTo().frame(driver.findElement(By.id("main")));
		


		//CLASS NAME
		WebElement classname = driver.findElement(By.xpath("//select[contains(@id,'class_name')]"));
		classname.click();
		//driver.findElement(By.xpath("//select[contains(@name,'class_name')]")).click();
		//Select sel = new Select(classname);
		Select sel = new Select(classname);
		sel.selectByIndex(2);
		Thread.sleep(500);

		// SECTION SELECT
		WebElement sectionname = driver.findElement(By.xpath("//select[contains(@id,'section_id')]"));
		sectionname.click();
		sel = new Select(sectionname);
		sel.selectByIndex(2);
		Thread.sleep(500);

		//EXAM MAIN TYPE
		WebElement exammaintype = driver.findElement(By.id("exam_main_type_id_for_exam_name_combo"));
		exammaintype.click();
		sel = new Select(exammaintype);
		sel.selectByIndex(2);
		Thread.sleep(500);

		//EXAM TYPE
		WebElement examtype= driver.findElement(By.id("exam_type_id_for_exam_type_combo"));
		examtype.click();
		sel = new Select(examtype);
		sel.selectByIndex(1);
		Thread.sleep(500);
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		
		JavascriptExecutor jsc = (JavascriptExecutor) driver;
		String existing_marks = "90/80/79/67/89/90";
		String [] indv_marks = existing_marks.split("/");
		
		
		
		
		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				//student_marks_element.sendKeys(Keys.chord(Keys.CONTROL,"a"),"95");
				jsc.executeScript("arguments[0].value='"+indv_marks[marks_iter]+"';",student_marks_element);
				marks_iter = marks_iter+1;
				
			}
		}
		
		WebElement save = driver.findElement(By.xpath("//input[contains(@id,'mode')]"));
		jsc.executeScript("arguments[0].click()", save);
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Exams Master')]")).click();
		Thread.sleep(2000);
		
	}
			


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Demo360 obj = new Demo360();
		obj.prtcMethod();
		

}



	}


