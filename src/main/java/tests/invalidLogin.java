package tests;

import BasePages.LoginPage;
import BasePages.commonPage;
import Utilities.ReadingPropertiesFile;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class invalidLogin extends BasePages.mainPage {

    @Test
    public void signIn() {
        driver.findElement(LoginPage.email_field).sendKeys(ReadingPropertiesFile.getProperty("email"));
        driver.findElement(LoginPage.password_field).sendKeys(ReadingPropertiesFile.getProperty("wrong_password"));
        driver.findElement(LoginPage.continue_btn).click();

    }
    
    @AfterTest
    public void assertion()
    {
    	WebElement invalid_login_text = driver.findElement(commonPage.invalid_login_text);
    	Assert.assertNotNull(invalid_login_text);
    }
}
