package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObject.Homepage;
import testBase.BaseClass;

public class TC002_FeaturesPage extends BaseClass{
	@Test
  public void FeaturesPage() throws InterruptedException {
		Homepage hm = new Homepage(driver);
		hm.clickFeature();
		Thread.sleep(20000);
		
		
  }


}
