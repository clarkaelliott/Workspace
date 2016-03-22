package homework_4;

/** Clark Elliott L20274677
 *  10/7/2014
 *  Homework #4 (Dealing Cards)  */

import java.util.Scanner;

public class Main {		
	public static void main(String[] args) {			
		boolean isRunning = false;
		Scanner sc = new Scanner(System.in);			
		do {
			for (int i=0;i<5;i++)
				PrintCard((int)(Math.random()*13),(int)(Math.random()*4));
			
			System.out.println("\nWould you like another hand? (yes/no)");			
			String response = sc.next();	
			
			if (response.equals("yes")) {
				isRunning = true;
			} else isRunning = false;
		} while (isRunning);		
		sc.close(); 
	}	
	public static void PrintCard(int number, int suit) {		
		switch (number) {		
		case 0: System.out.print("Ace ");   break;	case 1: System.out.print("2 ");	break;
		case 2: System.out.print("3 ");	    break;	case 3: System.out.print("4 ");	break;
		case 4: System.out.print("5 ");	    break;	case 5: System.out.print("6 ");	break;
		case 6: System.out.print("7 ");	    break;	case 7: System.out.print("8 ");	break;
		case 8: System.out.print("9 ");	    break;	case 9: System.out.print("10 "); break;
		case 10: System.out.print("Jack ");	break;	case 11: System.out.print("Queen "); break;
		case 12: System.out.print("King ");	break; 	
		}				
		switch (suit) {		
		case 0: System.out.print("of Spades\n"); break;	 case 1: System.out.print("of Hearts\n"); break;
		case 2: System.out.print("of Clubs\n"); break;	 case 3: System.out.print("of Diamonds\n"); break; 
		}
	}
}