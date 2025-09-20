package testNg;

public class CalculatorTest {
    
	public int add(int a,int b)
	{
		int c= a+b;
		return c;
	}
	public int sub(int a,int b)
	{int c;
		
		if(a>b) {
		 c= a-b;} else{ c= b-a;}
		return c;
	}
	public int mul(int a,int b)
	{
		int c= a*b;
		return c;
	}
	public int div(int a,int b)
	{
		int c= a/b;
		return c;
	}

}
