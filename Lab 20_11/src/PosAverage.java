import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int i = 1;
		int total = 0;
		int num = 0;
		int times = 0;
		System.out.println("Enter 0 or less to stop entering numbers.");
        do {
		System.out.print("Enter value #" +  i  +  ":");
	    num = input.nextInt();
	    total = total + num;
	    	times = i + i;
	    i++;
        }
	    while (num >= 1);
	    	total = total - num;
	    	times = i-1;
		System.out.println("Average is " + (total/times));
	
        }
	}