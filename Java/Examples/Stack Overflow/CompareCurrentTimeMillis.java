
/**
  * CompareCurrentTimeMillis.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 21, 2016
  * 
  * 
  */

public class CompareCurrentTimeMillis {
	
	// Returns true if the difference between now and then is < 30
	static boolean isLessThanThirtySeconds(long currentTime, long startTime) {
		return (currentTime - startTime) < 30000;
	}
	
	// Prints Lap# While Elapsed Time < 30
	static void printLapWhileLessThanThirty(int lapCount, long currentTime, long startTime) {
		if (currentTime - startTime < 30000)
			System.out.printf("lap# %d\n", lapCount);
		else
			return;
	}
	
	public static void main(String[] args) {		
		long now; // Used to Store Current Time
		long then = System.currentTimeMillis(); // Get Start Time
		
		for (int i = 1; i < 32; i++) {
			now = System.currentTimeMillis() + (1000 * i); // simulate time elapsing
			System.out.println(isLessThanThirtySeconds(now, then) + " at " + (now - then) / 1000 + " seconds");
		}
		
		System.out.println();
		
		// Note that 30 & 31 do not print
		for (int i = 1; i < 32; i++) {
			now = System.currentTimeMillis() + (1000 * i); // simulate time elapsing
			printLapWhileLessThanThirty(i, now, then);
		}
	}
}
