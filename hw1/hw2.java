package hw1;
import java.util.Scanner;


public class hw2 {
	public static void main(String arg[]) {
		double Price = 0;
		String TheTypeOfFrames;
		String TheColorOfTheFrame;
		String regular = "regular";
		String white = "white";
		int TheNumberOfCrowns;
		float Perimeter;
		float Area;
		float Length;
		float Width;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the length and width of the frame:");
		Length = scan.nextFloat();
		Width = scan.nextFloat();
		scan.nextLine();
		System.out.println("Please enter the type of picture frame you want(regular or fancy):");
		TheTypeOfFrames = scan.nextLine();
		System.out.println("Please enter the color of the frame:");
		TheColorOfTheFrame = scan.nextLine();
		System.out.println("Please enter the number of crowns:");
		TheNumberOfCrowns = scan.nextInt();
		scan.close();
		if (TheTypeOfFrames.equals(regular)) {
			Perimeter = (Length + Width) * 2;
			Price = Perimeter * 0.15;
		} else {
			Perimeter = (Length + Width) * 2;
			Price = Perimeter * 0.25;
		}
		if (TheColorOfTheFrame.equals(white)) {
		} else {
			Price = (Length + Width) * 2 * 0.1 + Price;
		}
		Area = Length * Width;
		Price = Price + Area *0.9;
		Price = Price + TheNumberOfCrowns * 0.35;
		System.out.println("The price of the picture frame is:" + Price);

	}
}
