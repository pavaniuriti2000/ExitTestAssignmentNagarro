package tests;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BasePages.flipkartExplorePlusPage;
import BasePages.searchPage;

public class explorePlus extends BasePages.mainPage{
	@Test
	public void explorePlusTest()
	{
		driver.findElement(searchPage.crossButton).click();
		driver.findElement(flipkartExplorePlusPage.explorePlus_link).click();
		
	}
	
	@AfterTest
	public void Assertion()
	{
		WebElement coinBalance= driver.findElement(flipkartExplorePlusPage.coin_balance);
		Assert.assertNotNull(coinBalance);
	}

}
