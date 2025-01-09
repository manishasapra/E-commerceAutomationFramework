package testBase;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.opencart.com/index.php?route=common/home&member_token=7adc5bc492d574047ebe7b656dbcc814");
		driver.manage().window().maximize();
		Thread.sleep(10000);
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}

}
