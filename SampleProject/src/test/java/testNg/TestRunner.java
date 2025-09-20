package testNg;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="C:\\Users\\Manikandan\\eclipse-workspace\\SampleProject\\src\\test\\resources\\SampleFeature.feature",
	glue="stepdef",
	dryRun=false
	)

public class TestRunner {
	@BeforeClass
	public static void a()
	{
		System.out.println("Before hook runs");
	}
	
	@AfterClass
	public static void B()
	{
		System.out.println("After hook runs");
	}
	
	

}
