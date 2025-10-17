package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import wrapper.GenericWraper;

public class IphonePage extends GenericWraper {

	public IphonePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public IphonePage goToNextWindow()
	{
		Windowhandle();
		return this;
	}
	
	public IphonePage AddProductToCart()
	{
		click("//*[text()='Add to cart']");
		return this;
	}
	
	public IphonePage validateProductInCart(String text)
	{
		validateText("//a[contains(text(),'iPhone 17')]", text);
		return this;
	}

}
