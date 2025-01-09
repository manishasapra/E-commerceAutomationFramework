package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base {
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-username']")
	WebElement txtusername;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath = "//input[@id='input-country']")
	WebElement country;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	
	@FindBy()
	WebElement register;
	
	public void setusername(String username) {
		txtusername.sendKeys(username);
		
	}
	public void setfirstname(String fname) {
		firstname.sendKeys(fname);
		
	}
	public void setlastname(String lname) {
		lastname.sendKeys(lname);
		
	}
	public void setemail(String email) {
		txtemail.sendKeys(email);
		
	}
	public void setpassword(String pwd) {
		password.sendKeys(pwd);
		
	}
	public void register() {
		register.click();
	}

}
