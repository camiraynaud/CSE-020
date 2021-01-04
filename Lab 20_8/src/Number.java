import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 1-26: ");
		int num = input.nextInt();
		char charA = 'A';
		System.out.println("You have entered " + num );
		if (1<=num && num<=26)
			System.out.println("Character " + num + " of the alphabet is " + (char)(charA + num - 1) + ".");
		else
		System.out.println ("Invalid Input! Number outside of acceptable range.");
	}

}
