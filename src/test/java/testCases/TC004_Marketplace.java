package testCases;

import org.testng.annotations.Test;

import pageObject.Homepage;
import testBase.BaseClass;

public class TC004_Marketplace extends BaseClass {
	@Test
	  public void DemoPage() throws InterruptedException {
			Homepage hm = new Homepage(driver);
			hm.clickMarketplace();
			Thread.sleep(20000);
			
			
	  }
}
