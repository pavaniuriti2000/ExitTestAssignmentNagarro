package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ValidLogin extends BasePages.mainPage {

    @Test
    public void signIn() {// Locate the email field and send data
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("password"));
        driver.findElement(LoginPage.continue_btn).click();
    }
    
    @AfterTest
    public void assertion()
    {
    	WebElement topoffer= driver.findElement(commonPage.top_offers);
    	Assert.assertNotNull(topoffer);
    }
}
