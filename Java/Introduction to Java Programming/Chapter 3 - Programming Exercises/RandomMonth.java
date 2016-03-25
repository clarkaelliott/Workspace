/**
  * RandomMonth.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 24, 2016
  * 
  *
  * Chapter 3.4 - (Random Month)
  * 
  * Instructions:
  * 	Generate an Integer Between 1 and 12
  * 	Display the English Month Name for the Integer
  * 
  * Notes:
  * 	1 = January ... 12 = December
  */

public class RandomMonth {
	public static void main(String[] args) {
		// Generate Number Between 1 and 12
		int monthNumber = (int)(Math.random() * 12 + 1);
		
		// Store English Month Names
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August",
							   "September", "October", "November", "December"};
		
		// Display Results
		System.out.println("Month " + monthNumber + " is " + monthNames[monthNumber - 1]);
	}
}