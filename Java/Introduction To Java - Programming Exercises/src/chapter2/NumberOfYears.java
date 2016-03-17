package chapter2;

import java.util.Scanner;

// 2.7
// Find the Number of Years

// Prompt User to Enter Number of Minutes
// Display Number of Years and Days for the Minutes Entered
// 1 Year = 365 Days

public class NumberOfYears {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long minutes;
		
		System.out.print("Enter the number of minutes: ");
		minutes = sc.nextLong();
		
		long years = minutes / 60 / 24 / 365;
		long days = (minutes / 60 / 24) % 365;
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
		
	}
	
}
