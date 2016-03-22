package homework_5;

/** Clark Elliott L20274677
 *  10/15/2014
 *  Homework #5 (Poker)  */

import java.util.Random;
import java.util.Scanner;

public class Poker {	
	
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int deck[] = new int[52]; //contains card values 0-51
		int remainingCards = 52; //count to remove played cards
		
		for (int i=0;i<deck.length;i++) //Initializes deck 0-51
			deck[i] = i;		
		ShuffleDeck(deck);//Randomizes cards
		
		do { remainingCards=DealHands(remainingCards, deck); //Deals 2 Hands of 5 Cards each and reduces cards in deck.
			if (remainingCards<=10) { //Checks for shuffle
				remainingCards=52; //Deck size resets to 52/52
				ShuffleDeck(deck); //Shuffles for a new game
				System.out.println("\nThe deck has been shuffled.");
			}			
			System.out.println("\nWould you like another hand? (yes/no)");		
		} while (sc.next().equalsIgnoreCase("yes")); //Prompts the user to continue
		sc.close(); //end of main
	}	
	
	public static void ShuffleDeck(int deck[]) {
		Random rng = new Random();
		for (int i=0;i<deck.length;i++) {
			int newIndex = rng.nextInt(i+1);
			int oldValue = deck[newIndex];
			deck[newIndex] = deck[i];
			deck[i] = oldValue; 
			}		
	}
	
	public static void PrintCard(int card) {
		String[] cardSuits = {"Spades", "Hearts", "Clubs", "Diamonds"};
		String[] cardRanks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String cardSuit = cardSuits[card/13]; 
		String cardRank = cardRanks[card%13];
		System.out.println(cardRank + " of " + cardSuit);
	}
	
	public static int DealHands(int remainingCards, int deck[]) {
		for (int i=0;i<2;i++) {
			System.out.println("\n_____Hand " + (i+1) + "_____");	
			for (int j=(remainingCards-1);j>(remainingCards-6);j--)
				PrintCard(deck[j]);	
			remainingCards-=5;
		}	
		return remainingCards;
	}
}