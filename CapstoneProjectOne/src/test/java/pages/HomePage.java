package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import wrapper.GenericWraper;

public class HomePage extends GenericWraper{
	
	public HomePage(RemoteWebDriver driver)
	{
		this.driver =driver;
	}
	
	public HomePage FlipKartNameCheck(String text)
	{
		validateflipkart("(//*[@title='Flipkart'])[3]","title",text);
		return this;
	}
	public HomePage enterproductNameinSearchBox(String productname)
	{
		entertext("//*[@name='q']", productname);
		return this;
	}
	
	public HomePage clickOnenter()
	{
		enterkey("//*[@name='q']");
		return this;
	}
	
   public MacBookPage selectMacDisplayedFirst()
   {
	   click("(//*[contains(text(),'Apple M2 ')])[1]");
	   return new MacBookPage(driver);
   }
   
   public IphonePage selectIphoneDisplayedFirst()
   {
	   click("(//*[contains(text(),'iPhone 17')])[2]");
	   return new IphonePage(driver);
   }
   
   
}
