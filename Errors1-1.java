import java.util.Scanner; //inserted statement

public class Errors1 
{
	public static void main(String[] args)
	{  //added curly braces 
		//public static void main(String[] args)                                 
		// TODO Auto-generated method stub
	
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);  //added a semicolon
		//Scanner keyboard = new Scanner(System.in)     
		System.out.println("Can you spot and fix the errors?"); //added a double quote string literal at the end
		//System.out.println("Can you spot and fix the errors?'); 
		                                                         
		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1 = keyboard.nextInt(); // added keyboard. before nextInt
		//n1 = nextInt(); 
        // moved these to the bottom so they wouldnt block the code
		int n2 = keyboard.nextInt();//added keyboard. before nextInt and capitalized Int
		//n2 = nextint(); 
        

		System.out.println("Enter the first number:  ");  
		System.out.println("Enter the second number:  ");
		   
		double sum;   	 
		sum = (n1-n2);
		System.out.print("The sum of the numbers is " + n1 + " and " + n2 + " is "); //added out. after System. and before println and removed the ln
		//System.println("The sum of the numbers is");
		System.out.println(sum);
	
	}
	
}