package testCase;

import org.testng.annotations.Test;

import pages.HomePage;
import wrapper.Projectwraper;

public class TC1 extends Projectwraper{
	
	@Test
	public void macBookcheck()
	{
		new HomePage(driver)
		.FlipKartNameCheck("Flipkart")
		.enterproductNameinSearchBox("Macbook air m2")
		.clickOnenter()
		.selectMacDisplayedFirst()
		.goToNextWindow()
		.productOutofStock("Product is now out of stock.");
	}

}
