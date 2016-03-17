package chapter1;

/*
 * Chapter 1.8 (Area and Perimeter of a Circle)
 * by Clark Elliott | Last Updated: 3/13/2016
 * 
 * 
 * Instructions:
 * Display the Area & Perimeter of a Circle with a Radius of 5.5
 * P = 2 * r * pi
 * A = r * r * pi
 * 
 */  

public class AreaPerimeterCircle {

	public static void main(String[] args) {

		// Math from Instructions
		double radius = 5.5;
		double perimeter = (2 * radius * Math.PI);
		double area = (radius * radius * Math.PI);
		
		// Display Results
		System.out.println("P = " + perimeter + " | A = " + area);

	}

}
