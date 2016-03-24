package chapter3;

//	Chapter 3.4
//	Random Month

//	Last Update: 3/7/2016 by Clark Elliott

//	Randomly Generate an Integer between 1 and 12
//	Display English Month Name according to Number Generated
//  1 = January & 12 = December

public class RandomMonth {

	public static void main(String[] args) {
		
		// Create Resources
		String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August",
							   "September", "October", "November", "December"};
		int monthNumber = (int)(Math.random() * 12 + 1);

		// Display Result
		System.out.println("Month " + monthNumber + " is " + monthNames[monthNumber - 1]);
	}

}