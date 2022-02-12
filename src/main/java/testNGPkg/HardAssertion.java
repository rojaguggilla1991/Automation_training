package testNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	WebDriver driver;

	@Test
	public void hardAsr() throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\selenium project\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.eschool360.in/index.php");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.id("auth_user_name")).sendKeys("admin");
		driver.findElement(By.id("auth_password")).sendKeys("admin");
		driver.findElement(By.id("auth_school")).sendKeys("1");
		driver.findElement(By.xpath("//input[contains(@name,'Login')]")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		String expected = "School";
		String actual = driver.getTitle();
		Assert.assertEquals(expected,actual);
		Assert.assertNotEquals(expected,actual);
		System.out.println("I have crossed assertion");
	}
}
