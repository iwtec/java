package hw1;

import java.util.Scanner;


public class hw1 {
	public static void main(String arg[]) {
		float Money;
		int cents;
		int TheNumberOfDollar = 0;
		int TheNumberOf50Cent = 0;
		int TheNumberOf20Cent = 0;
		int TheNumberOf10Cent = 0;
		int TheNumberOf5Cent = 0;
		int TheNumberOf2Cent = 0;
		int TheNumberOf1Cent = 0;
		System.out.println("Please enter the amount of money:");
		Scanner scan = new Scanner(System.in);
		Money = scan.nextFloat();
		scan.close();
		Money = Money * 100;
		cents = (int) Money;

		TheNumberOfDollar = cents / 100;
		cents = cents % 100;

		TheNumberOf50Cent = cents / 50;
		cents = cents % 50;

		TheNumberOf20Cent = cents / 20;
		cents = cents % 20;

		TheNumberOf10Cent = cents / 10;
		cents = cents % 10;

		TheNumberOf5Cent = cents / 5;
		cents = cents % 5;

		TheNumberOf2Cent = cents / 2;
		cents = cents % 2;

		TheNumberOf1Cent = cents / 1;
		cents = cents % 1;

		Money = Money / 100;
		System.out.println("$" + Money + " would be $" + TheNumberOfDollar + "," + TheNumberOf50Cent + "*50c,"
				+ TheNumberOf20Cent + "*20c," + TheNumberOf10Cent + "*10c," + TheNumberOf5Cent + "*5c,"
				+ TheNumberOf2Cent + "*2c," + TheNumberOf1Cent + "*1c.");
		

	}
	
}
