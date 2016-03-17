
/**
  * AreaPerimeterCircle.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 17, 2016
  * 
  *
  * Chapter 1.8 - (Area and Perimeter of a Circle)
  * 
  * Instructions:
  * 	Display the Area & Perimeter of a Circle
  * 
  * 
  * Notes:
  * 	Radius = 5.5
  * 	Perimeter = 2 * Radius * Pi
  * 	Area = Radius * Radius * Pi
  */

public class AreaPerimeterCircle {

	public static void main(String[] args) {
		
		// Local Variables
		final double RADIUS = 5.5;
		double area = RADIUS * RADIUS * Math.PI;
		double perimeter = 2 * RADIUS * Math.PI;
		
		// Display Results
		System.out.println("Area: " + area + "\nPerimeter: " + perimeter);

	}

}
