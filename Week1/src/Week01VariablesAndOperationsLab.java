//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int planeSeats = 3;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 10.23;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'W';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String custFirstName = "Norman";
		
		// 6. Create a variable to hold a street address
		String streetAddress = "11586 Sweet Nokia St.";

		// 7. Print all variables to the console
		System.out.println("There are: " + planeSeats + " plane seats left.");
		System.out.println(costOfGroceries + " is the price of groceries.");
		System.out.println(middleInitial + "is my middle initial.");
		System.out.println(isHotOutside + " - it's hot outside.");
		System.out.println("Customer's First name is: " + custFirstName);
		System.out.println("Random street address: " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		planeSeats -= 2;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries += 2.15;

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'K';

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = !isHotOutside;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = custFirstName + " " + middleInitial + " Blanchard";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("Hello, my name is " + fullName + " and I live at " + streetAddress);
		
		
	}
}