package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	
@Given("Launch the brower")
public void launch_the_brower() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan\\eclipse-workspace\\SampleProject\\src\\test\\resources\\driver\\chromedriver.exe");
	  driver = new ChromeDriver();		
	 driver.get("https://www.facebook.com/login.php/");
}

@When("Enter the {string} and {string}")
public void enter_the_and(String UserName, String Pwd) {
	 driver.findElement(By.id("email")).sendKeys(UserName);
	 driver.findElement(By.id("pass")).sendKeys(Pwd);
}

@When("Click On Submit button")
public void click_on_submit_button() {
	 driver.findElement(By.id("loginbutton")).click();
   
}
@Then("Close the brower")
public void close_the_brower() {
	driver.quit();
    
}


}
