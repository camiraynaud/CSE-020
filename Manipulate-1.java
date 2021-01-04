import java.util.Scanner;

public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("This program will ask the user for two integers, ");
		System.out.println("and will calculate the sum, difference, product, and integer casts of those numbers.");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the first integer:");
		int nInt1 = input.nextInt();
		
		System.out.print("Please enter the second integer:");
		int nInt2 = input.nextInt();

		int sum;
		sum = (int)(nInt1+nInt2);
		System.out.print("The sum of " + (int)(nInt1) + " and " + (int)(nInt2) + " is ");
		System.out.println(sum);

		int difference;
		difference = (int)(nInt1-nInt2);
		System.out.print("The difference of " + (int)(nInt1)+ " and " + (int)(nInt2)+ " is ");
		System.out.println(difference);
		
		int product;
		product = (int)(nInt1*nInt2);
		System.out.print("The product of " + (int)(nInt1) + " and " + (int)(nInt2) + " is ");
		System.out.println(product);
		
		int divide;
		divide = (int)(nInt1/nInt2);
		System.out.print("The integer cast of" + " (" + (int)(nInt1) + " / " + (int)(nInt2) + ")" + " is ");
		System.out.println(divide);
		
		int remainder;
		remainder = (int)(nInt1%nInt2);
		System.out.print("The integer cast of" + " (" + (int)(nInt1) + " % " + (int)(nInt2) + ")" + " is ");
		System.out.println(remainder);
		
		//end int
		
		System.out.print("Please enter the first short between -32,768 and 32,767");
		short nShort1 = input.nextShort();
		
		System.out.print("Please enter the second short between -32,768 and 32,767");
		short nShort2 = input.nextShort();
		
		short sum1;
		sum1 = (short)(nShort1+nShort2);
		System.out.print("the sum of " + (short)(nShort1) + " and " + (short)(nShort2) + " is ");
		System.out.println(sum1);
		
		short difference1;
		difference1 = (short)(nShort1-nShort2);
		System.out.print("The difference of " + (short)(nShort1) + " and " + (short)(nShort2) + " is ");
		System.out.println(difference1);
		
		short product1;
		product1 = (short)(nShort1*nShort2);
		System.out.print("The product of " + (short)(nShort1) + " and " + (short)(nShort2) + " is ");
		System.out.println(product1);
		
		short divide1;
		divide1 = (short)(nShort1/nShort2);
		System.out.print("The integer case of" + " (" + (short)(nShort1) + " / " + (short)(nShort2) + ") " + "is ");
		System.out.println(divide1);
		
		short remainder1;
		remainder1 = (short)(nShort1%nShort2);
		System.out.print("The integer cast of" + " (" + (short)(nShort2) + " % " + (short)(nShort2) + ")" + " is ");
		System.out.println(remainder1);
		
		//end short
		
		System.out.print("Please enter the first float");
		float nFloat1 = input.nextFloat();
		
		System.out.print("Please enter the second float");
		float nFloat2 = input.nextFloat();
		
		float sum2;
		sum2 = (float)(nFloat1+nFloat2);
		System.out.print("the sum of " + (float)(nFloat1) + " and " + (float)(nFloat2) + " is ");
		System.out.println(sum2);
		
		float difference2;
		difference2 = (float)(nFloat1-nFloat2);
		System.out.print("The difference of " + (float)(nFloat1) + " and " + (float)(nFloat2) + " is ");
		System.out.println(difference2);
		
		float product2;
		product2 = (float)(nFloat1*nFloat2);
		System.out.print("The product of " + (float)(nFloat1) + " and " + (float)(nFloat2) + " is ");
		System.out.println(product2);
		
		float divide2;
		divide2 = (float)(nFloat1/nFloat2);
		System.out.print("The integer case of" + " (" + (float)(nFloat1) + " / " + (float)(nFloat2) + ") " + "is ");
		System.out.println(divide2);
		
		float remainder2;
		remainder2 = (float)(nFloat1%nFloat2);
		System.out.print("The integer cast of" + " (" + (float)(nFloat2) + " % " + (float)(nFloat2) + ")" + " is ");
		System.out.println(remainder2);
		
		//end float
		
		System.out.print("Please enter the first double");
		double nDouble1 = input.nextDouble();
		
		System.out.print("Please enter the second double");
		double nDouble2 = input.nextDouble();
		
		double sum3;
		sum3 = (double)(nDouble1+nDouble2);
		System.out.print("the sum of " + (double)(nDouble1) + " and " + (double)(nDouble2) + " is ");
		System.out.println(sum3);
		
		double difference3;
		difference3 = (double)(nDouble1-nDouble2);
		System.out.print("The difference of " + (double)(nDouble1) + " and " + (double)(nDouble2) + " is ");
		System.out.println(difference3);
		
		double product3;
		product3 = (double)(nDouble1*nDouble2);
		System.out.print("The product of " + (double)(nDouble1) + " and " + (double)(nDouble2) + " is ");
		System.out.println(product3);
		
		double divide3;
		divide3 = (double)(nDouble1/nDouble2);
		System.out.print("The integer case of" + " (" + (double)(nDouble1) + " / " + (double)(nDouble2) + ") " + "is ");
		System.out.println(divide3);
		
		double remainder3;
		remainder3 = (double)(nDouble1%nDouble2);
		System.out.print("The integer cast of" + " (" + (double)(nDouble2) + " % " + (double)(nDouble2) + ")" + " is ");
		System.out.println(remainder3);
		
		
	}

}
