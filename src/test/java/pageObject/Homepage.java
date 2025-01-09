package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Base {
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//div[contains(@class, 'navbar-right')]/a[2]") 
	WebElement Register;
	
	@FindBy(xpath="//div[contains(@class, 'navbar-right')]/a[1]") 
	WebElement Login;
	
	public void clickRegister() {
		Register.click();
	}
	
	public void clickLogin() {
		Login.click();
	}

}
