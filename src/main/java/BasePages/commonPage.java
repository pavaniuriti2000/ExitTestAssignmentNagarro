package BasePages;

import org.openqa.selenium.By;

public class commonPage {
	//Advertise
	public static By advertise_link = By.xpath("//span[contains(text(),'Advertise')]");
	public static By contactUs = By.xpath("/html/body/app-root/flipscore-ext/app-header-home/header/div[3]/nav/span/a");
	
	//become a seller
	public static By start_Selling = By.xpath("//div[contains(text(),'Start Selling')]");
	
	//cart
	public static By priceDetails = By.xpath("//span[contains(text(),'Price details')]");
	
	//coupons
	public static By My_Account = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]");
	public static By coupon = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By Available_coupons =By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	//Fashion
	public static By Fashion_link = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[4]/a");
	public static By viewAll = By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div/div[1]/div/div/a");
	
	//my account
	public static By my_account = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]");
	public static By plusZone = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By coin_balance =By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");

	public static By gift_cards = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By my_coin_balance = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By log_out = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By log_in =By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By mobiles_tablets = By.xpath("//div[contains(text(),'Mobiles & Tablets')]");
	public static By big_Sale = By.xpath("//h1[contains(text(),'Mobile Phones Big Dussehra Sale')]");
	
	public static By my_profile = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By hello_text = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By orders = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	
	public static By return_policy =By.xpath("//*[@id=\"container\"]/div/footer/div/div[3]/div[1]/div[3]/a[1]");
	public static By return_policy_text = By.xpath("//*[@id=\"returns-policy\"]");
	
	public static By search_link = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]");
	public static By sort_by = By.xpath("//span[contains(text(),'Sort By')]");
	
	public static By super_coin_zone = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	public static By view_coin_activity = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	
	public static By top_offers =By.xpath("//div[contains(text(),'Top Offers')]");
	public static By view_all = By.xpath("/html/body/div/div/div[3]/div[2]/div/div[1]/div/div/a");
	
	public static By my_wish_list = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
	public static By wish_list_link = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]");
	
	public static By invalid_login_text = By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/span[3]/span");
	
}
