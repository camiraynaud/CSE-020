import java.util.Scanner;

public class BobcatHotel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int guest,meal; //u
		double room, nights, AAA, club; //using larger values so a double is appropriate 
		@SuppressWarnings("unused")
		boolean AAA1 = false; //boolean statement needed
		@SuppressWarnings("unused")
		boolean club1 = false; //matching boolean statement
		System.out.println("ROOM OPTIONS"); //room options list
		System.out.println("1. Single @ $50.50 per night");
		System.out.println("Double @ $75.00 per night");
		System.out.println("Queen @ $100.75 per night");
		System.out.println("King @ $150.25 per night");
		System.out.println("Master Suite @ $225.50 per night");
		System.out.println("");
		
		System.out.print("Please specify the number of guests: ");  
		guest = in.nextInt(); //number of guests signified 
		
		System.out.print("Please select your room choice (enter 1/2/3/4/5 corresponding to the options shown above): ");
		room = in.nextInt();
		if (room == 1) //room selection 1-5
			room = 50.5;
		else if (room == 2) 
			room = 75;      
		else if (room == 3) 
			room = 100.75;
		else if (room == 4)
			room = 150.25;
		else if (room == 5)
			room = 225.5;
		System.out.print("Please enter the number of nights: ");
		nights = in.nextInt(); //
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		AAA = in.nextInt(); //allows user to answer prompt with 1 or 0 
		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		club = in.nextInt();

		if (club == 1 && nights>=4) { 
			System.out.print("\nCongratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\"");
			System.out.println("Discount will be applied during checkout depending on the number of days\n");}

		else if(club ==1 && nights<4) { 
			System.out.println("Unfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\". ");
			System.out.println("Better luck next time!");}
		else {
			System.out.print("");}


		if (room == 225.50) { 
			System.out.print("\nMEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\r\n" + "0. Complementary @ $0 per guest\r\n" + "1. Standard @ $30 per guest\r\n" + "2. Deluxe @ $50 per guest\r\n" + "3. Indulgence @ $85 per guest\n\n");
			System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown\r\n" + "above):");
			meal = in.nextInt();}

		else { 
			System.out.print("\nMEAL PACKAGES (PRICES SHOWN ARE PER NIGHT)\r\n" + "0. Complementary @ $0 per guest\r\n" + "1. Standard @ $30 per guest\r\n" + "2. Deluxe @ $50 per guest\n\n");
			System.out.print("\nPlease select your desired meal package (enter 0/1/2 corresponding to the options shown\r\n" + "above):");
			meal = in.nextInt();}

		switch (meal) { //switch needed for project completion
		case 0: //the variable meal being switched on is checked for each case
			meal = 0;
			break;
		case 1:
			meal = 30;
			break;
		case 2:
			meal = 50;
			break;
		case 3:
			meal = 85;
			break;
		}
		double baseCost = (nights * room); 
		double mealCost = (guest * nights * meal);
		double preliminaryTotalcost = (baseCost + mealCost);
		double AAAdiscount = (preliminaryTotalcost * 0.10);
		double clubDiscount = ((nights/4)*room); 

		System.out.print("\nCHECKOUT\n" + "Room Cost:\t\t" + " $" + baseCost + "\nMeal Cost:\t\t" + "+$" + mealCost + 
				"\nPreliminary Total Cost:\t" + " $" + preliminaryTotalcost );

		if (AAA==0 && club == 0) { //&& boolean
			System.out.print("\nNo Discounts Applied");
			System.out.print("\nTotal Cost of Booking:\t $" + preliminaryTotalcost);}

		else if (AAA == 1 && club == 1) {
			double totalCost =(preliminaryTotalcost-AAAdiscount-clubDiscount);
			System.out.print("\nAAA Discount:\t\t" + "-$" + AAAdiscount +"\nClub Discount:\t\t" + "-$" + clubDiscount + "\nTotal Cost of Booking:\t $"+ totalCost );}
		else if(club == 1 && AAA == 0) {
			double totalCost =(preliminaryTotalcost-clubDiscount);
			System.out.println("");
			System.out.println("No Discounts Applied");
			System.out.println("Total Cost of Booking:\t" + " $" + totalCost );
		}
		else if(AAA == 1 && club == 0) {
			double totalCost =(preliminaryTotalcost-AAAdiscount);
			System.out.print("\nAAA Discount:\t\t" + "-$" + AAAdiscount + "\nTotal Cost of Booking:\t $"+ totalCost );}
		}
		}

