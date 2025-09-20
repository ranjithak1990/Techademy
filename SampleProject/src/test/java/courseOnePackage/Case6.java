package courseOnePackage;

import java.util.Scanner;

public class Case6 {

	public static void main(String[] args) {
		
		String[] a = new String[5];
		for(int i=0;i<5;i++)
		{
			Scanner scan= new Scanner(System.in);
			a[i]= scan.nextLine();
		}
		int i=4;
		while(i>=0) {
		System.out.println(a[i]);
		i--;
		}
	}

}
