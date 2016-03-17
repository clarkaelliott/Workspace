
/**
  * PopulationProjection.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 1.11 - (Population Projection)
  * 
  * Instructions:
  * 	Display the Population for Each of the Next 5 Years
  * 
  * Notes:
  * 	Current Population = 312,032,486
  * 	1 Year = 365 Days
  * 	1 Birth every 7 Seconds
  * 	1 Death every 13 Seconds
  * 	1 New Immigrant every 45 Seconds
  */

public class PopulationProjection {

	public static void main(String[] args) {

		// Time in Seconds
		final byte BIRTH_RATE = 7;
		final byte DEATH_RATE = 13;
		final byte IMMIGRANT_RATE = 45;		
		final double SECONDS_PER_DAY = 86400.0;
		
		// Starting Population
		double currentPopulation = 312032486; 
		
		// Display Next 5 Years
		for (int years = 1; years < 6; years++) {
			for (int days = 0; days < 365; days++) {
				currentPopulation += ((SECONDS_PER_DAY / BIRTH_RATE) + (SECONDS_PER_DAY / IMMIGRANT_RATE) - (SECONDS_PER_DAY / DEATH_RATE));
			}
			System.out.println("Year " + years + " : Population = " + (int)currentPopulation);			
		}

	}

}
