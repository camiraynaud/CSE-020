import java.util.Scanner;

public class MultiplesFor {
	

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner input = new Scanner(System.in);
		System.out.println("This program prints out multiples of a base number till a specified maximum.");
		System.out.println();
		System.out.print("Please enter the maximum number: ");
		int max = input.nextInt();
		System.out.print("Please enter the base number whose multiples to print: ");
		int base = input.nextInt();
		System.out.println();
		System.out.println("Multiples of " + base + " from 1 till 25 are: ");
		int last = 1;
		for (int i = 1; i * base<= max; i++) { 
		last = i * base;
		System.out.println("Number is " + last); 
		}
	}
}