package pck1;

import org.testng.annotations.Test;

public class Account {
public int interestRate;
public int Balance;

public Account(int interestRate, int Balance)
{
	this.Balance=Balance;
	this.interestRate=interestRate;
	
}
	
	public void calculateinterest()
	{
		int interest;
		 interest=Balance*(interestRate/100);
		System.out.println(interest);
		Balance=Balance+interest;	
		System.out.println(Balance);
		
	}

}
