package hw2;

import java.util.Scanner;

public class hw3 {
	public static void main(String a[]) {
		String start;
		System.out.println("If start(y or n)");
		Scanner scan = new Scanner(System.in);
		start = scan.next();
		while (start.equalsIgnoreCase("y")) {
			int randomNumber, guessNumber, i;
			randomNumber = (int) (Math.random() * 1000);
			System.out.println(randomNumber);
			System.out.println("I have a number between 1 and 1000");
			System.out.println("Can you guess my number?");
			System.out.println("Please type your guess:");
			Scanner scan1 = new Scanner(System.in);
			guessNumber = scan1.nextInt();

			for (i = 1; i < 10; i++) {
				if (randomNumber == guessNumber) {
					System.out.println("Excllent!You gussed the number.spend" + i);
					break;
				} else {
					if (randomNumber > guessNumber) {
						System.out.println("Too low,Try again");
					} else {
						System.out.println("Too hight,Try again");
					}
					System.out.println("Left " + (10 - i));
					System.out.println("Please type your guess:");
					Scanner scan2 = new Scanner(System.in);
					guessNumber = scan2.nextInt();
				}

			}
			if (i >= 10) {
				System.out.println("sorry,you fail!");
			}
			System.out.println("If start(y or n)");
			Scanner scan3 = new Scanner(System.in);
			start = scan3.next();
		}

	}
}

