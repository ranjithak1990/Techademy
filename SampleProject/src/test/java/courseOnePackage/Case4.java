package courseOnePackage;

import java.util.Scanner;

public class Case4 {

	public static void main(String[] args) {
		
		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(i + " * " +n+ " = " + i*n);
		}

	}

}
