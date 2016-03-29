

import java.util.Scanner;

/*
 * Chapter 3.24 (Game: Pick a Card)
 * by Clark Elliott | Last Updated: 3/8/2016
 * 
 * 
 * Instructions:
 * Simulate Picking a Card From a Deck of 52 Cards
 * Display the Rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
 * and Suit (Clubs, Diamonds, Hearts, Spades)
 */

public class PickACard {
	
	public static void main(String[] args) {
		
		// Create Resources
		Scanner sc = new Scanner(System.in);
		String rankNames[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String suitNames[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		int rank = (int) (Math.random() * rankNames.length);
		int suit = (int) (Math.random() * suitNames.length);
		
		// Display Card Chosen
		System.out.print("The card you picked is " + rankNames[rank] + " of " + suitNames[suit]);
		
		// Destroy Resources
		sc.close();
		
	}

}