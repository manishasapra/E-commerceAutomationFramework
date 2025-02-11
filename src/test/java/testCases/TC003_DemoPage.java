package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObject.Homepage;
import testBase.BaseClass;

public class TC003_DemoPage extends BaseClass {
	@Test
	  public void DemoPage() throws InterruptedException {
			Homepage hm = new Homepage(driver);
			hm.clickDemo();
			Thread.sleep(20000);
			
			
	  }
}
