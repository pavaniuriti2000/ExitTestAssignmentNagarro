package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;

public class giftCards extends BasePages.mainPage{
	@Test
	public void giftCardsTest()
	{
		driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
		driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
		driver.findElement(LoginPage.continue_btn).click();
		
		//My Account element
		WebElement mainMenu = driver.findElement(By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]"));
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu(My Account)
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu(Gift Cards)
		WebElement subMenu = driver.findElement(commonPage.gift_cards);

		//To mouseover on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on flipkartPlusZone "myCoinBalance" field will appear in the page.
		WebElement myCoinBalance = driver.findElement(commonPage.my_coin_balance);
		Assert.assertNotNull(myCoinBalance);
		
	}

}
