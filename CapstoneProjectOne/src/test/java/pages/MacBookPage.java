package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import wrapper.GenericWraper;

public class MacBookPage extends GenericWraper {

	public MacBookPage(RemoteWebDriver driver) {
		this.driver =driver;
	}

	public MacBookPage goToNextWindow()
	{
		Windowhandle();
		return this;
	}
	
	public MacBookPage AddProductToCart()
	{
		click("//*[text()='Add to cart']");
		return this;
	}
	
	public MacBookPage productOutofStock(String text)
	{
		validateText("//*[contains(text(),'Product is now out of stock.')]", text);
		return this;
	}
	
}
