package chapter1;

/*
 * Chapter 1.11 (Population Projection)
 * by Clark Elliott | Last Updated: 3/15/2016
 * 
 * 
 * Instructions:
 * Display the Population for Each of the Next 5 Years
 * Current Population = 312,032,486
 * Year = 365 Days
 * 1 Birth every 7 Seconds
 * 1 Death every 13 Seconds
 * 1 New Immigrant every 45 Seconds
 */

public class PopulationProjection {
	
	public static void main(String[] args) {
		
		// Time in seconds
		final double BIRTH_RATE = 7.0;
		final double DEATH_RATE = 13.0;
		final double IMMIGRANT_RATE = 45.0;		
		final double SECONDS_PER_DAY = 86400.0;
		
		// Starting population
		double currentPopulation = 312032486.0; 
		
		System.out.println("Year 0 : Population = " + (int)currentPopulation);
		
		// Project Next 5 Years
		for (int years = 1; years < 6; years++) {
			for (int days = 0; days < 365; days++) {
				currentPopulation += ((SECONDS_PER_DAY / BIRTH_RATE) + (SECONDS_PER_DAY / IMMIGRANT_RATE) - (SECONDS_PER_DAY / DEATH_RATE));
			}
			System.out.println("Year " + years + " : Population = " + (int)currentPopulation);			
		}
		
	}

}
