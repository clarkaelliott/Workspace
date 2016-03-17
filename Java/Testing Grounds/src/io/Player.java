package io;

// Goal is to Fill Player Variables from a File

public class Player {
	
	public String name;
	private int level;
	private int exp;
	private int health;

	// Our Load Constructor
	public Player(String[] save) {
		this.name = save[0];
		this.level = Integer.parseInt(save[1]);
		this.exp = Integer.parseInt(save[2]);
		this.health = Integer.parseInt(save[3]);		
	}
	
	// A Method for Testing Purposes
	public void printStats() {
		System.out.println(this.name + "'s Stats");
		System.out.println("Level: " + this.level + "  Exp: " + this.exp);
		System.out.println("Health: " + this.health);
	}
}
