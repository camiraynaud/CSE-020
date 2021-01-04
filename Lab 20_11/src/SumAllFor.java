import java.util.Scanner;

public class SumAllFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the sum of all numbers till a specified maximum.");

		System.out.print("Please enter the max amount of numbers to add: ");

		int max = input.nextInt();
		int total = 0; 
		for (int i = 0; i <= max; i++) {
			
			total = i;
			System.out.println("Number " + i);
	}
		System.out.println("The sum of all numbers from 0 till " + max + " is: " + total);
		}
}