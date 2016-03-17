package third;

import java.util.Scanner;

// 3.2
// Game: Add Three Numbers

// Revise Listing 3.1 AdditionQuiz.java to
// Generate 3 single-digit integers and
// Prompt the User to Enter the Sum of these three integers

public class AddThreeNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int n3 = (int)(Math.random() * 10);
		
		System.out.print("What is " + n1 + " + " + n2 + " + " + n3 + "? ");
		
		int answer = sc.nextInt();
		
		System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + answer + " is " + (n1 + n2 + n3 == answer));
	}
}
