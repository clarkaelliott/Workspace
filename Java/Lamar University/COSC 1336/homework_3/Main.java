package homework_3;

/** Clark Elliott L20274677
 *  10/1/2014
 *  Homework #3 (Photographing an Alien)  */

public class Main {
	static double photoChance = 0.5;
	static int simulationCount, orbitCount, photoCount, minuteCount, totalSum, sum, alienCount;

	public static void main(String[] args) {		
		
	for (simulationCount=1;simulationCount<6;simulationCount++) {		
		for (int orbitCount=0;orbitCount<8;orbitCount++) {			
			for (minuteCount=0;minuteCount<3;minuteCount++) {
				switch (minuteCount) {
				case 0: photoChance = 0.5;
				break;
				case 1: photoChance = 0.75;
				break;
				case 2: photoChance = 0.25;
				break;	}				
				for (photoCount=0;photoCount<10;photoCount++) {
					if (Math.random() <= photoChance) {
						sum++;
						totalSum++;	}
					}
				}
			}		
		System.out.println("Simulation " + simulationCount + ": Photos of alien: " + sum + " of 240");
		sum = 0;	}
		System.out.println("\nAverage photos taken of alien: " + (totalSum/5) + " of 240");
	}
}
