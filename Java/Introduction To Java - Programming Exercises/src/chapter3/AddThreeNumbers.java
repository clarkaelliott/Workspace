package chapter3;

import java.util.Scanner;

//	Chapter 3.2
//	Game: Add Three Numbers

//	Last Update: 3/7/2016 by Clark Elliott

//	Generate 3 single-digit integers
//	Prompt user to enter the sum

//	*Demonstrates Math.random()

public class AddThreeNumbers {

	public static void main(String[] args) {

		// Create Resources
		Scanner sc = new Scanner(System.in);
		
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int n3 = (int)(Math.random() * 10);		
		int sum = n1 + n2 + n3;
		
		// Collect Input		
		System.out.print("What is " + n1 + " + " + n2 + " + " + n3 + "? ");		
		int userAnswer = sc.nextInt();		
		
		// Process Input				
		boolean isCorrect = (n1 + n2 + n3 == userAnswer);
		
		// Display Result		
		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + userAnswer + " is " + isCorrect);
		
		// Destroy Resources
		sc.close();	

	}

}