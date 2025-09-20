package pkg5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC1 extends CommonCode{
	@Test
	public void test1() throws InterruptedException
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
