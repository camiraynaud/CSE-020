
import java.util.Scanner;

public class Errors3 { //added a curly brace
	//public class Errors3

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner kbd = new Scanner (System.in); //added brackets around System.in
		int numerator; // Changed Int to int
		int denominator; 

		System.out.println ("This program divides two numbers."); //added out. in between System and println
		//System.println("This program divides two numbers.");
		System.out.print ("Enter the numerator: "); //added out. in between System and println add ln to print
		//System.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print ("Enter the denominator: ");
		denominator = kbd.nextInt(); //fixed spelling error switched places of a and t
		//denomintaor = kbd.nextInt();


		System.out.print (numerator); //capitalized the S in System
		//system.out.print(numerator);
		System.out.print ("/");
		System.out.print (denominator); //capitalized the S in System and lowercased the p in print
		//system.out.Print(denominator);
		System.out.print (" = ");
		System.out.println ((double) numerator/denominator); //lowercased the p in print
		//System.out.Println((double) numerator/denominator);
	}
} //Added a curly brace