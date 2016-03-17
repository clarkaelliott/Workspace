package chapter1;

/*
 * Chapter 1.2 (Display Five Messages)
 * by Clark Elliott | Last Updated: 3/13/2016
 * 
 * 
 * Instructions:
 * Display "Welcome to Java" five times..
 */

public class DisplayFiveMessages {
	
	// Literal message to be displayed
	private final static String MESSAGE = ("Welcome to Java");

	public static void main(String[] args) {

		// Loop to display message 5 times to console
		for (int i = 0; i < 5; i++) {
			System.out.println(MESSAGE);
		}

	}

}
