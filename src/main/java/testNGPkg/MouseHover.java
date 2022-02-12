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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class MouseHover {
	


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
	    

WebDriver driver;




Loginname.findElement(driver).sendKeys("admin");
password.findElement(driver).sendKeys("admin");
school.findElement(driver).sendKeys("1");
Login.findElement(driver).click();

//Thread.sleep(2000);

exams.findElement(driver).click();


	    Actions act = new Actions(driver);
	    act.moveToElement(reports.findElement(driver));
	    act.moveToElement(exportExamMarks.findElement(driver));
	    act.click().build().perform();


	}
}