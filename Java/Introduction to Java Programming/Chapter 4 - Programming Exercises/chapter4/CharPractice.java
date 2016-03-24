package chapter4;

import java.util.Objects;

// Testing Grounds for Character Class

public class CharPractice {

	public static void main(String[] args) {

		int A = (int)'A', B = (int)'B', a = (int)'a', b = (int)'b';
		
		System.out.println((char)40 + " " + (char)59 + " " + (char)79 + " " + (char)85 + " " + (char)90);
		System.out.println((int)'1');
		System.out.println(" A = " + A + " B = " + B + " a = " + a + " b = " + b);
		
		getASCII();
		
		System.out.println('\u0040' + " " + '\u005A' + " " + '\u0071' + " " + '\u0072' + " " + '\u007A');
		
		for (int i = 0; i < 2<<8; i++) {
			System.out.println((char)('\u0000'+i));
		}
		
		System.out.println('\"' + " " + '\\');
		
		int i = '1';
		int j = '1' + '2' * ('4' - '3') + 'b' / 'a';
		int k = 'a';
		char c = 90;
		
		System.out.println("i = " + i + " j = " + j + " k = " + k + " c = " + c);
		
		float f = 1000.34f;
		double d = 1000.34;
		int p = (int) f;
		int q = (int) d;
		
		System.out.println(p);
		System.out.println(q);
		
		System.out.println((char)97);
		
		System.out.println((char)('b' - 'c'));
		char x = 'a';
		char y = 'c';
		System.out.println(++x);
		System.out.println(y++);
		System.out.println(x - y);
		
		System.out.println((char)(97 + Math.random() * 128 ) );
		
		for (int o = 0; o < 100; o++) {
			System.out.println((char)(int)(97 + Math.random() * 26) );
		}
		
		System.out.println('a' == 'a');
		System.out.println('a' != 'a');
		System.out.println("A" == "A");
		System.out.println("A".equals("A"));
		
		char z = 'z';
		String zz = "zz";
		String xx = "zz";
		
		System.out.println(z == z);
		System.out.println(zz == "zz");
		System.out.println(zz == xx);
		System.out.println(zz.equals("zz"));
		System.out.println(zz.equals(xx));
		
		String fooString1 = new String("foo");
		String fooString2 = new String("foo");

		// Evaluates to false
		System.out.println(fooString1 == fooString2);

		// Evaluates to true
		fooString1.equals(fooString2);
		
		String foo = "foo";
		String bar = new String("bar");
		
		System.out.println(foo == "foo"); // true
		System.out.println(bar == "bar"); // false
		System.out.println(foo.equals("foo")); // true
		System.out.println(bar.equals("bar")); // true
		System.out.println(Objects.equals(foo, "foo")); // true
		System.out.println(Objects.equals(bar, "bar")); // true		
		
		System.out.println();
		
		System.out.println(Character.getName('a'));
		System.out.println(Character.getNumericValue('\u216C'));
		System.out.println(Character.getNumericValue(50));
		System.out.println(Character.getType('a'));
		System.out.println(Character.getType(95));
		System.out.println(Character.getDirectionality('a'));
		System.out.println(Character.getDirectionality(95));
		
		

	}
	
	private static void getASCII() {
		for (int i = 1; i <= Byte.MAX_VALUE; i++)
			System.out.println(i + " is " + Character.getName(i));
	}
	
	private static void getAllChars() {
		for (int i = Character.MIN_VALUE; i <= Character.MAX_VALUE; i++)
			System.out.println(i + " is " + Character.getName(i));
	}

}
