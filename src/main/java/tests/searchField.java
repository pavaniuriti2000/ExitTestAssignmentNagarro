package tests;



import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import BasePages.commonPage;
import BasePages.searchPage;

public class searchField extends BasePages.mainPage{
	@Test
	public void searchFieldTest()
	{
		driver.findElement(searchPage.crossButton).click();
		driver.findElement(commonPage.search_link).sendKeys("dresses");
	}
	
	@AfterTest
	public void assertion()
	{
		//after searching for some thing "sort By" tab will appear in the page
		WebElement sortBy =driver.findElement(commonPage.sort_by);
		Assert.assertNotNull(sortBy);
	}

}
