package tests;



import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import BasePages.commonPage;
import BasePages.searchPage;

public class advertise extends BasePages.mainPage{

    public  static Logger logger = Logger.getLogger(advertise.class);
	@Test
	public void advertiseTest()
	{
		//Extent Report
        test.log(LogStatus.INFO,"Test get Passed");
        //Logger implementation
        logger.info("Cross the signup slide ");

		driver.findElement(searchPage.crossButton).click();
		driver.findElement(commonPage.advertise_link).click();
	}
	
	@AfterTest
	public void assertion()
	{
		WebElement contactUs = driver.findElement(commonPage.contactUs);
	    Assert.assertNotNull(contactUs);
	}

}
