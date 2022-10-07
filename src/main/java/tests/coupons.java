package tests;



import org.apache.log4j.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;

public class coupons extends BasePages.mainPage{
	 public  static Logger logger = Logger.getLogger(advertise.class);
	@Test
	public void couponsTest()
	{
		//Extent Report
        test.log(LogStatus.INFO,"Test get Passed");
        //Logger implementation
        logger.info("Cross the signup slide ");
		driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
		driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
		driver.findElement(LoginPage.continue_btn).click();
		
		//My Account element
		WebElement mainMenu = driver.findElement(commonPage.My_Account);
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu(My Account)
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu(My Profile)
		WebElement subMenu = driver.findElement(commonPage.coupon);

		//To mouse over on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on Coupons "Available Coupons" field will appear in the page.
		WebElement availableCoupons = driver.findElement(commonPage.Available_coupons);
		Assert.assertNotNull(availableCoupons);
	}

}
