package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends Base {
	WebDriver driver;
	public Loginpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement login;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[contains(@class, 'col-sm-6')]/button type[2]") 
	WebElement btnlogin;
	
	public void login(String email ) {
		login.sendKeys(email);
	}
	
	public void password(String pwd ) {
		password.sendKeys(pwd);
	}
	
	public void loginbutton() {
		btnlogin.click();
	}
}
