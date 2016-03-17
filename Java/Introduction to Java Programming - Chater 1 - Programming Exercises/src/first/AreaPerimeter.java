package first;

// This program will display the area and perimeter of a circle to console

public class AreaPerimeter {

	public static void main(String[] args) {
		
		double radius = 5.5;
		double perimeter = (2 * radius * Math.PI);
		double area = (radius * radius * Math.PI);
		
		System.out.println("P = " + perimeter + " | A = " + area);
		
	}
}
