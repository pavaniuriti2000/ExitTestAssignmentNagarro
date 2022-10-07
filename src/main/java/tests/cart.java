package tests;


import org.openqa.selenium.By;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


import com.relevantcodes.extentreports.LogStatus;

import BasePages.cartPage;
import BasePages.searchPage;
import org.testng.*;

public class cart extends BasePages.mainPage{
	public  static Logger logger = Logger.getLogger(cart.class);
	
	@Test
	public void cartTest()
	{
		//Extent Report
        test.log(LogStatus.INFO,"Test get Passed");
        //Logger implementation
        logger.info("Cross the signup slide ");

		driver.findElement(searchPage.crossButton).click();
		driver.findElement(cartPage.cart_link).click();
	}
	
	@AfterTest
	public void assertion1()
	{
		WebElement priceDetails = driver.findElement(By.xpath("//span[contains(text(),'Price details')]"));
		Assert.assertNotNull(priceDetails);
	}

}
