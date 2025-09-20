package pkg5;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CommonCode {
	
	static ChromeDriver driver;
	
	@BeforeMethod
	public void browserLaunch() {
		System.setProperty("System.chrome.driver", "C:\\Users\\Manikandan\\Documents\\driver140\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));}
	@AfterMethod
	public void browserClose() {
		driver.quit();		
	}
	
	

}
