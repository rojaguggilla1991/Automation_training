package testNGPkg;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class BYClassPgm {

	WebDriver driver;

	public static By LoginName = By.id("auth_user_name");
	public static By password = By.id("auth_password");
	public static By school = By.id("auth_school");
	public static By Login = By.name("Login");
	public static By exams = By.xpath("//span[contains(text(),'EXAMS')]");
	public static By marksentry= By.xpath("//a[contains(text(),'Marks Entry')]");
	public static By main = By.id("main");
	public static By classname = By.id("class_name"); 
	public static By section_id =  By.id("section_id"); 
	public static By exammaintype = By.id("exam_main_type_id_for_exam_name_combo");
	public static By examtype = By.id("exam_type_id_for_exam_type_combo");

	@Test

	public void demoMethod () throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver_win32\\chromedriver.exe"); 
		driver = new ChromeDriver();

		driver.get("https://demo.eschool360.in/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();

		LoginName.findElement(driver).sendKeys("admin");
		password.findElement(driver).sendKeys("admin");
		school.findElement(driver).sendKeys("1");
		Login.findElement(driver).click();
		Thread.sleep(2000);
		exams.findElement(driver).click();
		marksentry.findElement(driver).click();
		Thread.sleep(2000);
	
		
		driver.switchTo().frame(main.findElement(driver));
		Thread.sleep(3000);
		classname.findElement(driver).click();
		Select sel = new Select(classname.findElement(driver));
		sel.selectByIndex(2);
		section_id.findElement(driver).click();
		Thread.sleep(2000);
		Select sel1 = new Select(section_id.findElement(driver));
		sel.selectByIndex(1);
		Thread.sleep(2000);
		exammaintype.findElement(driver).clear();
		Select sel2 = new Select(exammaintype.findElement(driver));
		sel.selectByIndex(0);
		Thread.sleep(2000);
		examtype.findElement(driver).clear();
		Select sel3 = new Select(examtype.findElement(driver));
		sel.selectByIndex(0);


	}
}