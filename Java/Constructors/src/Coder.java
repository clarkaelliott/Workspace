
public class Coder {

	private String name;
	private int age;
	
	public Coder() {
		
	}
	
	public Coder(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void initialize(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void writeCode() {
		System.out.println(name + " is coding!");
	}
	
	public void describe() {
		System.out.println("I am a coder");
		System.out.println("My name is " + name);
		System.out.println("I am " + age + " years old");
	}
	
}
