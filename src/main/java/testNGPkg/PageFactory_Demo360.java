package testNGPkg;


import static org.testng.Assert.assertEquals;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import com.aventstack.extentreports.reporter.configuration.Theme;


public class PageFactory_Demo360 {

	protected ExtentHtmlReporter htmlReporter;
	protected ExtentReports extent;
	protected ExtentTest test;
	WebDriver driver;

	//PageFactory syntax using findBy
	@FindBy(id= "auth_user_name") WebElement loginName;
	@FindBy(id= "auth_password") WebElement password;
	@FindBy(id= "auth_school") WebElement schoolName;
	@FindBy(name= "Login") WebElement login;
	@FindBy(xpath = "//span[contains(text(),'EXAMS')]") WebElement exams;
	@FindBy(xpath = "//a[contains(text(),'Marks Entry')]") WebElement marksentry;
	@FindBy(id = "class_name") WebElement classname;
	@FindBy(id = "section_id") WebElement secsel;
	@FindBy(id = "exam_main_type_id_for_exam_name_combo") WebElement exammaintype;
	@FindBy(id = "exam_type_id_for_exam_type_combo")WebElement examtype;
	@FindBy(xpath = "//input[contains(@id,'mode')]") WebElement save;
	@FindBy(xpath = "//input[contains(@id,'mode')]") List save_exist;
	@FindBy(xpath = "//a[contains(text(),'Exams Master')]") WebElement examMaster;

	@BeforeTest
	public void extentReportSetup() {

		System.out.println("I am in BeforeTest");

		htmlReporter = new ExtentHtmlReporter("extentReport.html");    

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);        
		htmlReporter.config().setDocumentTitle("Automation Report"); 
		htmlReporter.config().setReportName("Extent Report V4");
		htmlReporter.config().setTheme(Theme.DARK);
		extent.setSystemInfo("Application Name", "Application");
	}


	@Test
	public void loadURL() throws InterruptedException {

		test = extent.createTest("MYDEMOTEST","Script start execution");


		System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver_win32\\chromedriver.exe");
	
		driver = new ChromeDriver();
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 40),this);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		test.info("Page loaded ");

		System.out.println(loginName);
		loginName.sendKeys("admin");
		password.sendKeys("admin");
		schoolName.sendKeys("1");
		login.click();
		Thread.sleep(3000);
		exams.click();
		marksentry.click();

		driver.switchTo().frame(driver.findElement(By.id("main")));
		
	//	System.out.println("calling method");
		
		
		select_method(classname,1);
		select_method(secsel,1);
		select_method(exammaintype,1);
		select_method(examtype,1);
		
		//CLASS NAME

		classname.click();
		//Select sel = new Select(classname);
		//sel.selectByIndex(1);
		Thread.sleep(500);

		// SECTION SELECT

		secsel.click();
		Select sel1 = new Select(secsel);
		sel1.selectByIndex(1);
		Thread.sleep(500);

		//EXAM MAIN TYPE

		exammaintype.click();
		Select sel2 = new Select(exammaintype);
		sel2.selectByIndex(2);
		Thread.sleep(500);

		//EXAM TYPE
		examtype.click();
		Select sel3 = new Select(examtype);
		sel3.selectByIndex(1);
		Thread.sleep(500);
		
		

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		test.info("Exam Marks page loaded successful");

		JavascriptExecutor jse = (JavascriptExecutor)driver; // casting the driver into javaScript executor

		String existing_marks = "95/85/92/88/80/100";
		String[] indv_marks = existing_marks.split("/");


		//Adding values into textboxes
		WebElement student_marks_element ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));

				jse.executeScript("arguments[0].value= '"+indv_marks[marks_iter]+"';",student_marks_element );
				marks_iter = marks_iter+1;

			}
		}
		jse.executeScript("arguments[0].click()", save);
		test.info("Marks updation done");

		Thread.sleep(2000);


		Alert alert =driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		test.info("Alert option succesfully");

		driver.switchTo().defaultContent();
		examMaster.click();
		Thread.sleep(2000);


		driver.switchTo().frame(driver.findElement(By.id("main")));


		String existing_marks1 = "95/85/95/98/60/90";
		String[] indv_marks1 = existing_marks.split("/");


		//Adding values into textboxes
		WebElement student_marks_element1 ;
		for(int student = 1;student <= 5;student ++) {
			int marks_iter = 0;
			for(int marks = 2; marks <= 7; marks++) {
				student_marks_element1 = driver.findElement(By.xpath("//th[contains(text(),'Student')]/ancestor::tr[1]/following-sibling::tr["+student+"]/td["+marks+"]/input"));
				String stu_marks_value = student_marks_element1.getAttribute("value");
				assertEquals(indv_marks1[marks_iter], stu_marks_value);
				marks_iter = marks_iter+1;
			}
			test.info("Row comparission completed Successfully");
		}
		test.info("Test executed Successfully");

	}
	
	
	private void select_method(WebElement dd2, int i) {
		
		
	}


	public void dropDown_Selection(WebElement dd ,int index_value) {
		
	//System.out.println("check Method");
	dd.click();
	Select sel = new Select(dd);
	sel.selectByIndex(index_value);
	}

	@AfterTest
	public void tearDown() {
		//driver.close();
	//	driver.quit();
	//	extent.flush();
	}

}