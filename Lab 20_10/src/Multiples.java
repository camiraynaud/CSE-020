import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("This program prints out multiples of a given number till a specified maximum.");
		System.out.println();
		System.out.print("Please enter the maximum number: "); 
		int max = in.nextInt();
		
		System.out.print("Please enter the number whose multiples to print: ");
		int mul = in.nextInt();
		System.out.println();
		System.out.println("Multiples of " + mul + " from 1 till " + max + " are: ");
		int i = 1;
		while ( i <= max) {
			if (i % mul == 0)
			System.out.println("Number " + i);	
			i++;
		}

	}
}
