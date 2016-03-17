package chapter1;

/*
 * Chapter 1.4 (Print a Table)
 * by Clark Elliott | Last Updated: 3/13/2016
 * 
 * 
 * Instructions:
 * Display "a  a^2  a^3" from a=1 to a=4 to console as a table.
 */

public class PrintATable {

	public static void main(String[] args) {

		System.out.println("a    a^2   a^3");
		for (int i = 1; i < 5; i++) {
			System.out.println(i + "    " + (int)Math.pow(i, 2) + 
					((int)Math.pow(i, 2) >= 10 ? "    " : "     ") + // Formatting for ## vs # to match Book's Example
					(int)Math.pow(i, 3) );
		}

	}

}
