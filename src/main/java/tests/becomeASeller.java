package tests;




import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import BasePages.becomeASellerPage;
import BasePages.commonPage;
import BasePages.searchPage;
public class becomeASeller extends  BasePages.mainPage{
	
	@Test
	public void BecomeASeller()
	{
		driver.findElement(searchPage.crossButton).click();
		driver.findElement(becomeASellerPage.seller_link).click();
	}
	
	//Assertion
	
	//after clicking this link user should see the "start selling" link
	
	@AfterTest
	public void assertion()
	{
		WebElement selling_link = driver.findElement(commonPage.start_Selling);
		Assert.assertNotNull(selling_link);
	}
	
	
		
	

}
