package second;

import java.util.Scanner;

// 2.2
// Compute the Volume of a Cylinder

// Read in radius and length of a cylinder
// Compute area and volume using
// area = radius * radius * pi
// volume = area * length

public class CylinderVolume {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the radius and length of a cylinder: ");
		
		double radius = sc.nextDouble();
		double length = sc.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		System.out.println("\nThe area is " + area + "\nThe volume is " + volume);
		
	}
	
}
