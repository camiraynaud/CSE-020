import java.util.Scanner;

public class SumAll {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("This program will find the sum of all numbers till a specified maximum.");
		System.out.println();
		System.out.print("Please enter the max amount of numbers to add: " );
		int max = in.nextInt();
		int i = 0;
		int total = 0;
		do {
			System.out.println("Number " +i);
			total += i;
			i++;
		} while ( i <= max);
		
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + total);
	}
}
