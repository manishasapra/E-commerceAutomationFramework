package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;



public class Base {
	
	WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}
