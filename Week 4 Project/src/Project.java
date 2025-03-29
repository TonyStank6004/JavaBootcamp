public class Project {
	public static void main(String[] args) {
		
		// 1.
		// Array of integer ages
		int ages[] = {3, 9, 23, 64, 2, 8, 28, 93};
		// Programmatically subtract first element from last element
		int result = ages[ages.length - 1] - ages[0];
		// Print the result
		System.out.println("Result of subtraction: " + result);
		// Create a second, longer array
		int ages2[] = {8, 9, 10, 11, 12, 13, 14, 15, 16};
		// Subtract first element from last
		int result2 = ages2[ages2.length - 1] - ages2[0];
		// Print result
		System.out.println("Result of second subtraction: " + result2);
		// Calculate the sum
		int sum = 0;
		for (int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		// Calculate average
		int average = sum / 9;
		// Print result
		System.out.println("Result of average: " + average);
		
		// 2.
		// Array of string names
		String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		// Iterate through array and calculate avg # of letters per name
		int totalNumOfLetters = 0;
		for (int i = 0; i < names.length; i++) {
			totalNumOfLetters += names[i].length();
		}
		int averageNumOfLetters = totalNumOfLetters / names.length;
		// Print result
		System.out.println("Result of average number of letters per name: " + averageNumOfLetters);
		// Iterate through array & concatenate names together
		String concatenation = "";
		for (int i = 0; i < names.length; i++) {
			concatenation += names[i] + " ";
		}
		// Print result
		System.out.println("Result of concatenation: " + concatenation);
		
		// 3.
		// How do you access the last element of any array?
		// Answer: To access the last element of any array use: array[array.length - 1]. 
		
		// 4.
		// How do you access the first element of any array?
		// Answer: To access the first element of any array use: array[0].
		
		// 5.
		// New int array 
		int nameLengths[] = new int [names.length];
		// Iterate through names array and add length of each name to nameLengths
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] += names[i].length();
		}
		
		// 6. 
		// Iterate over nameLengths array and calculate sum
		int nameLengthsSum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengthsSum += nameLengths[i];
		}
		
		// Print result to console
		System.out.println("Result of nameLengths sum: " + nameLengthsSum);
		
		// 7.
		// Write a method that takes a String-word and an int-n as arguments and returns the word
		// concatenated to itself n number of  times
		String word = "Hi";
		int n = 3;
		System.out.println(concatenation(word, n));
		
		// 8. 
		// Write a method that takes two Strings firstName and lastName, then returns full name
		String firstName = "Jimmy", lastName = "Hopkins";
		System.out.println(makeFullName(firstName, lastName));
		
		// 9. 
		// Write a method that takes an array of int and returns true if sum of all ints in array is > 100
		int apple[] = {1, 20, 3, 4, 5}; // I didn't know what to name it, so I named it apple
		System.out.println(greaterThan100(apple));
		
		// 10. 
		// Write a method that takes array of double and returns average of all elements in array
		double banana[] = {10.0, 12.3, 20.4, 100.3}; // I'm going to be naming my arrays after fruits from now on
		System.out.println(findAverage(banana));
		
		// 11. 
		// Write method that takes two arrays of double and returns true if the average of the elements
		// in the first array is greater than the average of the elements in the second array
		double orange[] = {100.1, 2.3, 4.6, 300.3};
		double pineapple[] = {200.0, 3.1, 2.4, 20.5};
		System.out.println(findTrueOrFalse(orange, pineapple));
		
		// 12. 
		// Write a method called willBuyDrink that takes boolean isHotOutside and double moneyInPocket
		// returns true if it is hot outside and if moneyInPocket is greater than 10.50
		boolean isHotOutside = true;
		double moneyInPocket = 30.20;
		System.out.println(willBuyDrink(isHotOutside,  moneyInPocket));
		
		// 13.
		// This method determines whether or not my dog will get a treat. In order to be given a treat
		// he must have had less than 4 treats in a day and be a good boy. However, if he had more than 4 treats
		// in a day, but he's a good boy he can get pets. Otherwise, he gets nothing!
		int treatsEatenToday = 3;
		boolean isGoodBoy = true;
		System.out.println(giveMyDogTreat(isGoodBoy, treatsEatenToday));
		
	} // end of main
	
	
		// Method for 7.
		public static String concatenation(String word, int n) {
			String concatenatedWord = "";
			for (int i = 0; i < n; i++) {
				concatenatedWord += word;
			}
			return concatenatedWord;
		}
		
		// Method for 8.
		public static String makeFullName(String firstName, String lastName) {
			String fullName = firstName + " " + lastName;
			return fullName;
		}
		
		// Method for 9.
		public static boolean greaterThan100(int apple[]) {
			int sum = 0;
			for (int i = 0; i < apple.length; i++) {
				sum += apple[i];
			}
			if (sum > 100) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// Method for 10.
		public static double findAverage(double banana[]) {
			double sum = 0, average = 0;
			for (int i = 0; i < banana.length; i++) {
				sum += banana[i];
			}
			average = sum / banana.length;
			return average;
		}
		
		// Method for 11.
		public static boolean findTrueOrFalse(double orange[], double pineapple[]) {
			double avg1 = 0, avg2 = 0, sum1 = 0, sum2 = 0;
			// Find first avg
			for (int i = 0; i < orange.length; i++) {
				sum1 += orange[i];
			}
			avg1 = sum1 / orange.length;
			// Find second avg
			for (int i = 0; i < pineapple.length; i++) {
				sum2 += pineapple[i];
			}
			avg2 = sum2 / pineapple.length;
			// Return t or f
			if (avg1 > avg2) {
				return true;
			}
			else {
				return false;
			}
		}
		
		// Method for 12
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			if (isHotOutside == true && moneyInPocket > 10.50) {//check if it passes requirements
				return true;
			}
			else {//return false if not
				return false;
			}
		}
		
		// Method for 13
		public static boolean giveMyDogTreat(boolean isGoodBoy, int treatsEatenToday) {
			// In order to be given a treat he must be a good boy and have eaten less than 4 treats
			if (isGoodBoy == true && treatsEatenToday < 4) {
				System.out.println("Good boys get treats!");
				return true;
			}
			else if (isGoodBoy == true && treatsEatenToday >= 4) {
				System.out.println("You've had enough treats, but you can still get pets!");
				return false;
			}
			else {
				System.out.println("Bad boys don't get treats!");
				return false;
			}
		}
} // end of class
