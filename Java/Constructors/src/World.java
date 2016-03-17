
public class World {

	public static void main(String[] args) {
		
		Coder c = new Coder();
		c.describe();
		System.out.println();
		c.initialize("Clark",  27);
		c.describe();
		System.out.println();
		Coder c2 = new Coder("Clark", 28);
		c2.describe();
		System.out.println();
		
		Human h1 = new King();
		King h2 = new King();
		
		h1.eat();
		h1.walk();
		System.out.println();
		h2.eat();
		h2.walk();
		
		
	}
	
}
