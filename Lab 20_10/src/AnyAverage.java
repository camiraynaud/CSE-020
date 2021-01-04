import java.util.Scanner;

public class AnyAverage {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("This program will find the average of as many numbers as you like.");
		System.out.println();
		System.out.print("Please choose the number of values to average: ");
		int num = in.nextInt();
		int i = 1;
		int total = 0;
		while ( i <= num) {
			System.out.print("Please enter the " + i + " number:");
			total += in.nextInt();
			i++;
		}
		System.out.println();
	    double average = total/i;
		System.out.println("The average of all the numbers is: " + average);
	}
}
