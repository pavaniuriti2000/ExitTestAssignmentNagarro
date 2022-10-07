package tests;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.testng.Assert;
import org.testng.annotations.Test;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;

public class myProfile extends BasePages.mainPage{
	
	@Test
	public void myProfileTest()
	{
		
		driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
		driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
		driver.findElement(LoginPage.continue_btn).click();
		
		//My Account element
		WebElement mainMenu = driver.findElement(commonPage.my_account);
		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu(My Account)
		actions.moveToElement(mainMenu);

		// Locating the element from Sub Menu(My Profile)
		WebElement subMenu = driver.findElement(commonPage.my_profile);

		//To mouse over on sub menu(My Profile)
		actions.moveToElement(subMenu);
		actions.click();

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
		
		//Assertion
        //after clicking on myProfile "Hello" field will appear in the page.
		WebElement helloText = driver.findElement(commonPage.hello_text);
		Assert.assertNotNull(helloText);
    ////div[contains(text(),'SuperCoin Zone')]
		
}
}
