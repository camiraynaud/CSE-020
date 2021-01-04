
import java.util.Scanner; //added this statement

public class Errors2 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in); //chaged kbd to keyboard //added suppress warning 
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will ");  //added a semicolon and a space after will
		//System.out.print("Enter a number and I will")
		System.out.print("square it for you"); //added a bracket and a semicolon following the double quote
		//System.out.print("square it for you:  )
		number =  keyboard.nextInt(); //changed int to Int
		
		theSquare = number * number; //changed lowercase s to uppercase S

		System.out.print(number + " squared = ");  //added a bracket
		//System.out.print(number + " squared = ";
		System.out.println(theSquare); //removed the " and " symbol
	}
}

