package module_5;

/*Clark Elliott 10/8/2014
COSC 1173 - Module 5
"Loop Statements" */

import java.util.Scanner;

public class Main {		
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int grade = 0, studentCount = 0, highestGrade = 0, lowestGrade = 0, averageGrade = 0;
		
		System.out.print("Please input the total number of students: ");
		while (studentCount<=0) {
		if (sc.hasNextInt()) {
			studentCount = sc.nextInt();
		} else {
			System.out.print("Please Enter a valid Number of Students:");
		} String clearBuffer1 = sc.nextLine();
		}		
		
		System.out.print("Please input the students' grade: ");
		
		for (int i = 0; i < studentCount; i++) {
			//System.out.print("Grade is currently: " + grade + "\n");
			if(sc.hasNextInt()) {				
				grade = sc.nextInt();
				if (grade < 0 || grade > 100) {
					i--; String clearBuffer2 = sc.nextLine();
					System.out.println("Grade must be between 0 and 100.");
					System.out.print("Please input another score: ");					
					System.out.print("\n");
				} else {
					if (i==0) {
						lowestGrade = grade;
						highestGrade = grade;
						averageGrade = grade;
					} else if (grade < lowestGrade) 
						lowestGrade = grade;
					  else if (grade > highestGrade)
						highestGrade = grade;
					averageGrade = averageGrade + grade;
				}
			} else {	
				i--; String clearBuffer3 = sc.nextLine();
				System.out.println("Grade must be between 0 and 100.");
				System.out.print("Please input another score: ");				
				System.out.print("\n");
			}				 
		}
		
		System.out.println("The highest grade is: " + highestGrade);
		System.out.println("The lowest grade is: " + lowestGrade);
		System.out.println("The average grade is: " + (averageGrade/studentCount));
		sc.close();
	}
}