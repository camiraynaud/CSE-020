import java.util.Scanner;

	public class Errors7 {

		public static void main(String[] args) {

			System.out.println("*** This program will find the average of 5 numbers ***");

			Scanner input = new Scanner(System.in);

			double n0 = 0, n1 = 0, n2 = 0, n3 = 0, n4 = 0;

			System.out.print("Please enter 0th number:");
			n0 = input.nextDouble();

			System.out.print("Please enter 1st number:");
			n1 = input.nextDouble();

			System.out.print("Please enter 2nd number:");
			n2 = input.nextDouble();

			System.out.print("Please enter 3rd number:");
			n3 = input.nextDouble();

			System.out.print("Please enter 4th number:");
			n4 = input.nextDouble();

			System.out.println("The average of 5 numbers is " + ((n0 + n1 + n2 + n3 + n4)/5));
			
			// Only add up positive numbers and take the average
			double total =0, count =0;
			
			if (n0 > 0) {
				total += n0;
				count ++;
			} if (n1 > 0) {
				total += n1;
				count ++;
			} if (n2 > 0) {
				total += n2;
				count ++;
			} if (n3 > 0) {
				total += n3;
				count ++;
			} if (n4 > 0) {
				total += n4;
				count ++;
			}
			if (count>0)
			System.out.println("Average of the positive numbers is " + total/count);
			
			else
			System.out.println("None of the numbers were positive.");	
			input.close();
		}
	}