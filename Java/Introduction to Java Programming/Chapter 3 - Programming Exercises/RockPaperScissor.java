

import java.util.Scanner;

/*
 * Chapter 3.17 (Game: Scissor, Rock, Paper)
 * by Clark Elliott | Last Updated: 3/7/2016
 * 
 * 
 * Instructions:
 * Randomly Generate a Number 0, 1, or 2 Representing Scissor, Rock, and Paper
 * Prompt User to Enter a Number 0, 1, or 2
 * Display a Message Indicating Whether User or Computer Wins, Loses, or Draws
 */

public class RockPaperScissor {

	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		int computerChoice = (int)(Math.random() * 3);
		String names[] = { "scissor", "rock", "paper" };
		
		// Collect Input
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userChoice = sc.nextInt();
			
		// Process Input & Display Result
		boolean userWin = ((userChoice == 0 & computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 3 && computerChoice == 1));
		
		// This String is Difficult to Read, but it Matches the Book's Output without a bunch of if statements...
		System.out.print("The computer is " + names[computerChoice] + ". You are " + names[userChoice] 
				+ ((computerChoice == userChoice) ? " too. It is a draw" : ((userWin) ? " you won" : " you lost")));	

		// Destroy Resources
		sc.close();

	}

}