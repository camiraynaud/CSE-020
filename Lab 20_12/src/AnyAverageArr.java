import java.util.Scanner;

public class AnyAverageArr {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the average of any set of numbers.");
		
		System.out.print("\nPlease choose number of values to average: ");
		int avg = input.nextInt();
		
		if (avg == 0) {
			System.out.print("\nNo numbers to average. Exiting program.");
			avg = input.nextInt();
		} else {
			System.out.print("Please choose column width for output formatting: ");
		}
		
		int col = input.nextInt();
		
		int[] arr1 = new int[avg + 1];
		double total = 0;
		
		for (int i = 1; i <= avg; i++) {
			System.out.print("Please enter value #" + i + " :");
			int num = input.nextInt();
			arr1[i] = num;
			
		}
		
		System.out.print("\nThe numbers being averaged are ... ");
		for (int i = 0; i <= avg; i++) {
			total = total + arr1[i];
			if (i % col == 0)
				System.out.println("");
			System.out.print(arr1[i] + " ");
		}
		System.out.println("\nAverage is: " + total/avg);
		input.close();
	}
}