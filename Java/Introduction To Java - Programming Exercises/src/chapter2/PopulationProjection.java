package chapter2;

import java.util.Scanner;

// 2.11
// Population Projection

// Prompt User to Enter Number of Years
// Display the Population after Number of Years

public class PopulationProjection {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of years: ");
		
		// Time in seconds
		double years = sc.nextDouble();
		double birth = 7.0;
		double death = 13.0;
		double immigrant = 45.0;
		
		double secondsPerDay = 86400.0;
		
		double currentPopulation = 312032486.0; // Starting population
		
		//System.out.println("Year 0 : Population = " + (int)currentPopulation);
		
		for (int i = 0; i < years; i++) {
			for (int days = 0; days < 365; days++) {
				currentPopulation += ((secondsPerDay / birth) + (secondsPerDay / immigrant) - (secondsPerDay / death));
			}
			//System.out.println("Year " + i + " : Population = " + (int)currentPopulation);			
		}
		
		System.out.println("The population in " + years + " years is " + currentPopulation);
		
		
		
	}
}
