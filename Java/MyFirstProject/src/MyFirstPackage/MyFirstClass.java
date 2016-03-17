package MyFirstPackage;

import java.util.Scanner;

public class MyFirstClass {
	
	/* This is my first Java Program
	 * I mean it's really not, but it is this time around...
	 * I am rusty to bear with me.
	 * 
	 * Java Keywords
	 * 
	 * abstract assert boolean break byte case catch char
	 * class const continue default do double else enum
	 * extends final finally float for goto if implements
	 * import instanceof int interface long native new package
	 * private protected public return short static strictfp super
	 * switch synchronized this throw throws transient try void
	 * volatile while
	 *
	 * Comments look really nice in this theme
	 * I should probably use and define all of those keywords
	 */
	
	public static String userInput;
	
	static Scanner sc = new Scanner(System.in);

		public static void main(String[] args) {
			System.out.println("What is your name?");
			
			userInput = sc.nextLine();
						
			System.out.println("Hello " + userInput + "! Did you know I am a program?");
			
			
			boolean userChoice = false;
			
			// How can I check if input is string || string || string??
			// What about Yes YEs YES yES YeS yEs yeS or yes???
			
			//System.out.println(userInput);
			
			// lol making progress here
			// Perhaps we should capture the string, change it to a single case, then compare!
			
			//sc.reset();
			userInput = sc.nextLine();
			System.out.println("Before toLowerCase() " + userInput);
			System.out.println(userInput.toLowerCase());
			System.out.println("After toLowerCase() " + userInput);
			// I am guessing this does nothing
						
			for (int i = 0; i < 100; i++) {
				userInput = sc.nextLine();
				if (userInput.toLowerCase().contains("ye")) {
					System.out.println("Success!");
					System.out.println();
				}
					else {
						System.out.println("Failed!!!!!");
						System.out.println();
					}
				}
			
			if (userInput.toLowerCase().contains("ye")) {
				userChoice = true;
			} else if (userInput.equalsIgnoreCase("no")) {
				userChoice = false;
			} else {
				System.out.println("?");
			}
			// Why is output "?" & userChoice is false???
			// Because String == String is WRONG!!!
			// Correct is String.equals(String) !!!
			
			
			
			if (userChoice == true) {
				System.out.println("Of course you did, you wrote me!");
			}
				else if (userChoice == false) {
					System.out.println("Well, I'm not really sure how you came to that conclusion...");
				}
				else {
					System.out.println("I don't understand..");
				}
			
			
			
		
		
		}
}
