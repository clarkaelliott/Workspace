
/**
  * Listing 1.6 - (ShowLogicErrors.java)
  * 
  * Notes:
  * 	Logic errors occur when a program does not perform the way it was intended to.
  * 	(9 / 5) = 1 vs (9.0 / 5) = 1.8 is the Logic Error.
  * 	The integer divison truncates the .8 yielding the wrong result.
  */

public class ShowLogicErrors {
	public static void main(String[] args) {
		System.out.println("Celsius 35 is Fahrenheit degree ");
		System.out.println((9 / 5) * 35 + 32); 
	}
}
