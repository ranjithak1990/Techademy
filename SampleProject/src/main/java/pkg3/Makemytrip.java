package pkg3;

import java.sql.Time;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Makemytrip {

	static ChromeDriver driver ;	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("system.chrome.driver", "C:\\Users\\Manikandan\\Documents\\driver140\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Makemytrip trip= new Makemytrip();
	trip.test();
	driver.quit();
	}
	
	public void test() throws InterruptedException
	{   
		driver.findElement(By.xpath("//*[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
		driver.findElement(By.xpath("//*[text()='One Way']")).click();
		driver.findElement(By.xpath("//*[text()='From']")).click();
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("MAA");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//*[text()='Chennai']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();	
		driver.findElement(By.xpath("//*[text()='To']")).click();
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("BLR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Bengaluru']")).click();
		
	}
}
