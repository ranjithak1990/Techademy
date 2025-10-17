package testCase;

import org.testng.annotations.Test;

import pages.HomePage;
import wrapper.Projectwraper;

public class TC2 extends Projectwraper{
	
	@Test
	public void Iphonecheck()
	{
		new HomePage(driver)
		.FlipKartNameCheck("Flipkart")
		.enterproductNameinSearchBox("Apple iPhone 17 Pro Max (Deep Blue, 256 GB)")
		.clickOnenter()
		.selectIphoneDisplayedFirst()
		.goToNextWindow()
		.AddProductToCart()
		.validateProductInCart("iPhone 17 Pro");
	}

}
