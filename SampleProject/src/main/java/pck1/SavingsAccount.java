package pck1;

public class SavingsAccount extends Account{

	public SavingsAccount(int interestRate, int Balance) {
		super(interestRate, Balance);
		// TODO Auto-generated constructor stub
	}

	public void calculateinterest()
	{
		int interest;
		interest=Balance*(interestRate/100);
		Balance=Balance+interest;	
		System.out.println("Savings Account: "+Balance);
		
	}
	
	
}
