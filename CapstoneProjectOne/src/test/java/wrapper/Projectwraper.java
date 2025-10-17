package wrapper;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Projectwraper extends GenericWraper{
	
	@BeforeSuite
	public void invokeApp()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\Documents\\driver140\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();		
	}
	@AfterSuite
	public void closeBrowser()
	{
		//driver.quit();
	}

}
