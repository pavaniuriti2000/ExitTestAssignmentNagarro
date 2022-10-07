package tests;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BasePages.commonPage;
import BasePages.searchPage;

public class mobilesAndTablets extends BasePages.mainPage{
	@Test
	public void mobilesTabletsTest()
	{
		driver.findElement(searchPage.crossButton).click();
		driver.findElement(commonPage.mobiles_tablets).click();
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement BigSale = driver.findElement(commonPage.big_Sale);
	    Assert.assertNotNull(BigSale);
	}

}
