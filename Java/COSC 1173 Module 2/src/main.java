/*Clark Elliott 9/3/2014
COSC 1173 - Module 2
"Favorite Websites" */

public class main {
	
	private static String[] StudentInfo = new String[6];
	
	public static void main(String[] args) {	
		populateStringArray();
		print(StudentInfo[0]);
	}
	
	private static void print(String string) {
		int i = -1;//-1 To Start from array[0]
		while (i < 5) {
			i++;
			System.out.println(StudentInfo[i]);
		}	
		
	}

	//Fills the Array with Student Info, Strings can be changed.
	public static void populateStringArray() { 
		StudentInfo[0] = "Name: Clark Elliott";
		StudentInfo[1] = "Major: B.S. Computer Science";
		StudentInfo[2] = "";//Intentionally Blank
		StudentInfo[3] = "Google: www.google.com";
		StudentInfo[4] = "YouTube: www.youtube.com";
		StudentInfo[5] = "Stack Overflow: www.stackoverflow.com";
	}
}
