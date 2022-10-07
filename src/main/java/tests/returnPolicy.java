package tests;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BasePages.commonPage;
import BasePages.searchPage;

public class returnPolicy extends BasePages.mainPage{
	@Test
	public void returnPolicyTest()
	{
		driver.findElement(searchPage.crossButton).click();
		driver.findElement(commonPage.return_policy).click();
		
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement ReturnPolicyText = driver.findElement(commonPage.return_policy_text);
		Assert.assertNotNull(ReturnPolicyText);
	}

}
