package mob;

import engine.Game;

public class Bat extends Mob {

	public Bat() {
		System.out.println("\nYou encounted a " + this.name);
		for (int i = 0; i < this.level; i++) {
			this.maxHealth += (this.constitution * (i + 1));
		}
		this.currentHealth = this.maxHealth;
		System.out.println(getStats());
		System.out.println();
	}
	
	// Stats	
	
		public String name = "Bat";
	
		private int level = 1;
		
		private int maxHealth = 10;
		private int currentHealth = maxHealth;
		
		private int attack = 3;
		private int defense = 0;
		private int accuracy = 0;
		private int dodge = 0;
		
		private int strength = 2;
		private int dexterity = 4;
		private int agility = 6;
		private int constitution = 2;
		private int intelligence = 5;
		private int wisdom = 5;
		private int luck = 5;
				
		// Loots
		
		private int experience = 1;
		private int gold = 0;
		
		public String getName() {
			return this.name;
		}
		
		public String getStats() {
			return ("Level " + this.level + " " + this.name + "\nHealth: " + this.currentHealth + "/" + this.maxHealth + "\nAtk: " + this.attack +
					"  Def: " + this.defense + "\nStr: " + this.strength + "  Con: " + this.constitution);
		}
		
		@Override
		public int getExperience() {
			return this.experience;
		}
		
		@Override
		public int getCurrentHealth() {
			return this.currentHealth;
		}
		
		@Override
		public void setCurrentHealth(int health) {
			System.out.println(this.name + "'s Health Before: " + this.currentHealth);
			this.currentHealth = health;
			System.out.println(this.name + "'s Health After: " + this.currentHealth);
			System.out.println();
		}
	
}
