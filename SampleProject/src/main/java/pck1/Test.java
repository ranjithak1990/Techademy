package pck1;

public class Test {
	public static void main(String[] args) {
		Account acc = new Account(2, 100000);
		acc.calculateinterest();
		SavingsAccount saacc = new SavingsAccount(5, 100000);
		saacc.calculateinterest();
		CurrentAccount CA = new CurrentAccount(2, 100000);
		CA.calculateinterest();
		
	}
}
