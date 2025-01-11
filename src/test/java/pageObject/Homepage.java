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
	
	@FindBy(linkText=("Features"))
	WebElement Features;
	
	@FindBy(linkText=("Demo"))
	WebElement Demo;
	
	@FindBy(linkText=("Marketplace"))
	WebElement Marketplace;
	
	@FindBy(linkText=("Blog"))
	WebElement Blog;
	
	public void clickRegister() {
		Register.click();
	}
	
	public void clickLogin() {
		Login.click();
	}
	public void clickFeature() {
		Features.click();
	}
	public void clickDemo() {
		Features.click();
	}
	public void clickMarketplace() {
		Features.click();
	}
	public void clickBlog() {
		Features.click();
	}

}
