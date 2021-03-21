package hw2;
import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
		int n;
		double t,sum=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input your n:");
		n=scan.nextInt();
		scan.close();
		for(double i=Math.pow(10, n-1);i<Math.pow(10, n);i++) {
			sum=0;
			for(t=i;t!=0;t=(int)(t/10)) {
				sum=sum+Math.pow(t%10, n);
			}
			if(sum==i)
				System.out.println(i);
		}
		System.out.println("Over!");
	}

}

