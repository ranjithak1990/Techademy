package pkg2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manikandan\\Documents\\driver140\\geckodriver.exe");
		  FirefoxDriver driver = new FirefoxDriver();		
		 driver.get("https://www.makemytrip.com/");
		 WebElement ele=driver.findElement(By.xpath("//img[@alt='Make My Trip']"));
		  if(ele.isDisplayed());
		  {
			  System.out.println("Pass");
		  }
		 driver.quit();
	}

}
