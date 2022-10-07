package tests;


import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;



import BasePages.LoginPage;
import BasePages.commonPage;

import Utilities.ReadingPropertiesFile;

public class topOffers extends BasePages.mainPage{
	@Test
	public void offerZoneTest()
	{
		

		driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
		driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
		driver.findElement(LoginPage.continue_btn).click();
		
		driver.findElement(commonPage.top_offers).click();
	}
	
	//Assertion
	@AfterTest
	public void assertion()
	{
		WebElement viewAll = driver.findElement(commonPage.view_all);
		Assert.assertNotNull(viewAll);
	}

}
