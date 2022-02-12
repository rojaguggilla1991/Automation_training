package testNGPkg;


	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.StaleElementReferenceException;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Wait;
	import org.testng.annotations.Test;

	public class SimpleLogin{


	public static By Loginname = By.id("123auth_user_name123");
	public static By password = By.id("auth_password");
	public static By school = By.id("auth_school");
	public static By Login = By.name("Login");

	WebDriver driver;
	public String  msg =null;


	@Test
	public void demoMethod() throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://demo.eschool360.in/index.php");
	driver.manage().window().maximize();
	
	editBox_Util( Loginname, "UserName", "Login Page", "admin");
	editBox_Util( password, "PassWord", "Login Page", "admin");
	editBox_Util(school, "School", "Login Page", "1");
	Login.findElement(driver).click();


	}


	public  String elementPresent(By locator, String locatorName, String pageName) {
	
	try {
	Wait<WebDriver> wait =  new FluentWait<WebDriver>(driver)
	.withTimeout(Duration.ofSeconds(30))
	.pollingEvery(Duration.ofSeconds(5))
	.ignoring(StaleElementReferenceException.class);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	} catch (Exception e) {
	System.out.println("I have entered into catch block");
	msg = "Locator Name:-"+locatorName+" : "+locator+" is not identified in Page : "+pageName;
	}
	return msg;
	}


	public void editBox_Util(By locator, String locatorName, String pageName, String value) {

	System.out.println(driver);
	System.out.println(locator);
	msg = elementPresent(locator, locatorName, pageName);
	if(msg==null) {

	locator.findElement(driver).sendKeys(Keys.chord(Keys.CONTROL,"a"),value);
	}else {
	System.out.println(msg);
	}
	}

	}



