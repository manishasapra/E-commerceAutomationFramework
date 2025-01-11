package testCases;

import org.testng.annotations.Test;
import pageObject.Homepage;
import pageObject.Loginpage;
import testBase.BaseClass;

public class TC001_LoginPage extends BaseClass {
	
	@Test
	public void LoginPage() throws InterruptedException {
	Homepage hm = new Homepage(driver);
	hm.clickLogin();
	Thread.sleep(50000);
	
	Loginpage lp = new Loginpage(driver);
	lp.login("manisha.sapra.nov@gmail.com");
	lp.password("Manisha123456");
	lp.loginbutton();

	}
	
}
