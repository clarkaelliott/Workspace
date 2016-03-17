package first;

// 1.11 This program will project population growth over 5 years

public class PopulationProjection {

	public static void main(String[] args) {
		
		// Time in seconds
		double birth = 7.0;
		double death = 13.0;
		double immigrant = 45.0;
		
		double secondsPerDay = 86400.0;
		
		double currentPopulation = 312032486.0; // Starting population
		
		System.out.println("Year 0 : Population = " + (int)currentPopulation);
		
		for (int years = 1; years < 6; years++) {
			for (int days = 0; days < 365; days++) {
				currentPopulation += ((secondsPerDay / birth) + (secondsPerDay / immigrant) - (secondsPerDay / death));
			}
			System.out.println("Year " + years + " : Population = " + (int)currentPopulation);			
		}
		
	}
	
}
