package BasePages;

import org.openqa.selenium.By;

public class cartPage {
	public static By cart_link = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]");
	public static By price_details = By.xpath("//span[contains(text(),'Price details')]");

}
