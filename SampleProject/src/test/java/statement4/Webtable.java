package statement4;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\eclipse-workspace\\SampleProject\\src\\test\\resources\\driver\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");
		
		 WebElement table = driver.findElement(By.xpath("//*[@class='table table-striped mt-3']"));
		 List<WebElement> rows= table.findElements(By.tagName("tr"));
		 List<WebElement> clms= rows.get(0).findElements(By.tagName("td"));
		 
		 for(WebElement row:rows)
		 {
			 List<WebElement> columns= row.findElements(By.tagName("td"));
			 for(WebElement clm: columns)
			 {
				System.out.println( clm.getText());
			 }
		 }	 
		 
		 
		driver.close();
	}

}
