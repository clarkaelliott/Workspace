
/**
  * PrintTable.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 1.4 - (Print a Table)
  * 
  * Instructions:
  * 	Display "a   a^2   a^3" in a Table
  * 	From a=1 to a=4 Inclusive
  * 
  * Notes:
  * 	
  */

public class PrintTable {

	public static void main(String[] args) {

		// Display a Fancy Table
		System.out.printf("%-5s %-5s %-5s\n", "a", "a^2", "a^3");
		for (int i = 1; i < 5; i++)
			System.out.printf("%-5d %-5d %-5d\n", 
					i, (int)Math.pow(i, 2), (int)Math.pow(i, 3));

	}

}
