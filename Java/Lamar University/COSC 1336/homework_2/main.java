package homework_2;

/** Clark Elliott L20274677
 *  09/09/2014
 *  Homework #2 (Internet Surfer)  */

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {	
	static float timeSum = 0;
	static final float[] time = new float[7];	
	static final String[] weekDays = {"Sunday ", "Monday ", "Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday "};
	static String rank = null; 
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {	
		
		System.out.println("How many hours do you spend Surfing the Web?");
				
		getHours();	//Get Input from user for 7 days of the week	
				
		for (int i=0; i<7; i++) { //Sum
			timeSum = timeSum + time[i];
		}
		
		giveRank(); //Assigns Title based on yearly hours
		
		//Formatting for ####.# (1 Decimal Place)
		DecimalFormat format = new DecimalFormat("####.#");
		format.setRoundingMode(RoundingMode.CEILING);
		
		System.out.println("\nYou surf " + format.format(timeSum) + " hours per week!");
		System.out.println("You surf " + format.format(timeSum*52) + " hours per year!");
		System.out.println(rank);
	}

public static void getHours() {	
	for (int i=0; i<7; i++) {
		System.out.print("Enter # of hours for " + weekDays[i] + ": ");
		try {				
			time[i] = sc.nextFloat();
			if (time[i] < 0) {
				System.out.print("Please Enter a Positive Number!\n");
				i--; }	}
		catch(InputMismatchException exception) {
			System.out.print("Please Enter Numbers only!\n");
			i--;
			sc.next();
		}	}	}

public static void giveRank() {
	if (timeSum*52 < 100) {
		rank = "Random Surfer";
	} else if (timeSum*52 > 100 && timeSum*52 < 1000) {
		rank = "Serious Surfer";
	} else if (timeSum*52 > 1000) {
		rank = "Internet Addict!";
	}	}	}