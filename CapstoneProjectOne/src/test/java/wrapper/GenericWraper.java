package wrapper;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericWraper {
	
	
	public RemoteWebDriver driver;
	
	 public void click(String xpath)
	 {
		 driver.findElement(By.xpath(xpath)).click();;
	 }
	 
	 public void validateflipkart(String xpath,String name,String text)
	 {
		 String s=driver.findElement(By.xpath(xpath)).getAttribute(name);
		 if(s.contains(text))
			{
				System.out.println(text+" text present");
			}else
			{System.out.println(text+" text not present");}		 
	 }
	 
	 public void validateText(String xpath, String text)
	 {
		String s= driver.findElement(By.xpath(xpath)).getText();
		if(s.contains(text))
		{
			System.out.println(text+" text present");
		}else {System.out.println(text+" text not present");}
	 }
	 
	 public void entertext(String xpath,String text)
	 {
		 driver.findElement(By.xpath(xpath)).sendKeys(text);
	 }
	 public void enterkey(String xpath)
	 {
		 driver.findElement(By.xpath(xpath)).sendKeys(Keys.ENTER);
	 }
	 
	 public void Windowhandle()
	 {
		Set<String> allwindow= driver.getWindowHandles();
		
		for(String eachWindow : allwindow)
		{
			driver.switchTo().window(eachWindow);
		}
	 }
}
