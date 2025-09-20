package courseOnePackage;

import java.util.Scanner;

public class Case5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter number");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		if(n>=0)
		{System.out.println(n + " Possitive number");
		}else {
			System.out.println(n + " negative number");
		}
	}

}
