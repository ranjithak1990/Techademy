package testNg;

import org.testng.annotations.Test;

public class Calculator {
	
	@Test
	public void calc()
	{
		CalculatorTest test = new CalculatorTest();
		test.add(5,3);
		test.sub(10, 5);
		test.mul(10, 5);
		test.div(10,5);
		
	}

}
