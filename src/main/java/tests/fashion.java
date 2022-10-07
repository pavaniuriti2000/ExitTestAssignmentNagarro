package tests;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BasePages.commonPage;
import BasePages.searchPage;


public class fashion extends BasePages.mainPage{
	@Test
	public void homeLinkTest()
	{
		driver.findElement(searchPage.crossButton).click();
		driver.findElement(commonPage.Fashion_link).click();
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement viewAll = driver.findElement(commonPage.viewAll);
		Assert.assertNotNull(viewAll);
	}

}
