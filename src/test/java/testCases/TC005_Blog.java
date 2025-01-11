package testCases;

import org.testng.annotations.Test;

import pageObject.Homepage;
import testBase.BaseClass;

public class TC005_Blog extends BaseClass {
	@Test
	  public void DemoPage() throws InterruptedException {
			Homepage hm = new Homepage(driver);
			hm.clickBlog();
			Thread.sleep(20000);
			
			
	  }
}
