package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void ab()
	{
		System.out.println("Befor Hook");
	}
	@After
	public void bc()
	{
		System.out.println("after Hook");
	}

}
