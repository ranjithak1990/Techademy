package pck1;

public class CurrentAccount extends Account{

	public CurrentAccount(int interestRate, int Balance) {
		super(interestRate, Balance);
		
	}

	public void calculateinterest()
	{
		int interest=Balance*(interestRate/100);
		Balance=Balance+interest;	
		System.out.println("Current Account: "+Balance);
		
	}
	

}
