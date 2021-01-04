import java.util.Scanner;

public class Interviewer {

	public static void main(String[] args) {
				
				@SuppressWarnings("resource")
				Scanner input = new Scanner(System.in);
		
				String name;
				System.out.println("What is your name?");
				name = input.next();
				System.out.println("My name is " + (name) + ".");
				
				String major;
				System.out.print("What is your major?");
				major = input.next();
				System.out.println("My major is " + (major) + ".");
				
				String place;
				System.out.print("Do you live on or off campus?");
				place = input.next();
				System.out.println("I live " + (place) + " campus.");
				
				int year;
				System.out.print("What year did you first enter UC Merced?");
				year = input.nextInt();
				System.out.println ("I entered UC Merced in " + (year) + ".");
				
				float inHeight, cmHeight;
				System.out.print("What is your height in inches?");
				inHeight = input.nextFloat();
				cmHeight = inHeight * (float)2.54;
				System.out.println("My height is " + (inHeight) + " in.");
				System.out.println("My height in cm is " + (cmHeight) + ".");
				
				System.out.println("So your name is " + (name) +"." + "Your major is " + (major) + "." + "You live " + (place) + " campus." + "You entered UC Merced in " + (year) + "." + "Your height in centimeters is " + (cmHeight) + ".");

				
	}

}
