package tests;




import BasePages.SignupPage;
import Utilities.ReadingPropertiesFile;
import org.testng.annotations.Test;

public class signUp extends BasePages.mainPage {
//    String mob = ReadingPropertiesFile.getProperty("mobileNumber");
    @Test
    public void SignUp() {// Locate the email field and send data
        driver.findElement(SignupPage.newUSer).click();
        driver.findElement(SignupPage.mobNumber).sendKeys(ReadingPropertiesFile.getProperty("mobileNumber"));

    }
}
