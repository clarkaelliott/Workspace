package chapter4;

// Just messing with Strings

public class StringPractice {

	public static void main(String[] args) {
		
		String foo = "foo"; // This is Correct
		String bar = new String("bar"); // This is Incorrect String.String.bar
		
		System.out.println();
		
		char[] myCharacters = new char[] {'a', 'b', 'c'};
		String myString = "abc";
		
		// String Static Methods
		// String.copyValueOf(data)
		System.out.println("String.copyValueOf(data) | " + String.copyValueOf(myCharacters));
		System.out.println(String.valueOf(new String( "abc" ) ) );
		System.out.println(String.valueOf(0.1d).concat("3") + '3' + Integer.parseInt("7") );
		System.out.println( ("1" + 3) + (3 + "7") );
		System.out.println( '1' + '3' + '3' + '7' );
		// String.copyValueOf(data, offset, count)
		System.out.println(String.copyValueOf(myCharacters, 0, 2));
		System.out.println(String.copyValueOf(myCharacters, 2, 1));
		// String.format(format, args)
		// String.format(l, format, args)
		// String.join(delimiter, elements)
		// String.join(delimiter, elements)
		// String.valueOf(b)
		// String.valueOf(c)
		// String.valueOf(data)
		// String.valueOf(d)
		// String.valueOf(f)
		// String.valueOf(i)
		// String.valueOf(l)
		// String.valueOf(obj)
		// String.valueOf(data, offset, count)
		
		
		// Formatting Strings
		System.out.println("\n\nFormatting Strings\n");
		// System.out.printf(format, item1, item2, ..., itemk)
		// System.out.printf(format, args))
		// System.out.printf(l, format, args)
		// %b %c %d %f %e %s
		// %5c %6b %5d %10.2f %10.2e %12s
		System.out.printf("%d", 1337);
		System.out.printf("\nDid you know that %2.2f * %1.2f is %2.0f?", 13.37, Math.PI, 13.37 * Math.PI);
		System.out.printf("\n%s", "See, 42 is the Secret to the Universe");
		System.out.printf("\nHowever, %2.2f * %1.2f isn't really %2.0f, but rather %2.14f", 13.37, Math.PI, 13.37 * Math.PI, 13.37 * Math.PI);
		double leet = 13.37;
		double secretOfEverything = Math.PI * leet;
		System.out.printf("%cWe could say that %f / %f = %2.3f", '\n', secretOfEverything, Math.PI, secretOfEverything / Math.PI);
		System.out.printf("%sOr could say that %f / %f = %2.15f", "\n", secretOfEverything, leet, secretOfEverything / leet);
		System.out.printf("%c%s %f %c %f %c %2.2f %s %b", '\n', "Even the Compiler will tell us that ", 
				secretOfEverything, '/', Math.PI, '=', secretOfEverything / Math.PI, " is ", secretOfEverything / Math.PI == leet);
		System.out.printf("%c%2.15e", '\n', secretOfEverything);
		System.out.printf(" %c %2.14f %c %s", '=', secretOfEverything, '=', secretOfEverything + "");
		System.out.println();
		System.out.printf("%s %10d %s", "Notice that", 42, "is justified right");
		System.out.printf("%s %-10d %s", "\nWe can make it left by", 42, "preceding the %10d with a - as %-10d");
		System.out.printf("%1000s %-509s", "\nBut for some reason...", "This doesn't apply to Strings?\n\n");
		System.out.printf("%10s", "\nIt has something to do with the new line\n");
		System.out.printf("%25s", "As seen here");
		System.out.printf("%25s", "\nBut not here");
		System.out.printf("\n%25s", "But this works?");
		
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("\n%"+j+"d", i);
				System.out.printf("%"+j*2+"d", i);
				System.out.printf("%"+j*4+"d", i);
				System.out.printf("%"+j*8+"d", i);
				System.out.printf("%"+j*16+"d", i);
			}
		}
		
		

	}

}
