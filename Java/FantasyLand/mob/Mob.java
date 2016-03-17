package mob;

// SuperClass for all Monsters
// TODO Change Mob to an Abstract (Class? Inferface?)

public class Mob {
		
	public String name = "Monster";
	
	// Stats	
	
	private int level = 1;
	
	private int maxHealth = 20;
	private int currentHealth = maxHealth;
	
	private int attack = 5;
	private int defense = 0;
	private int dodge = 0;
	
	private int strength = 5;
	private int dexterity = 5;
	private int agility = 5;
	private int constitution = 5;
	private int intelligence = 5;
	private int wisdom = 5;
	private int luck = 5;
	
	private int speed = 15;
	private int ATB = 0;
			
	// Loots
	
	private int experience = 0;
	private int gold = 0;
	
	
	// Getters & Setters 
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxHealth() {
		return maxHealth;
	}
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	public int getCurrentHealth() {
		return currentHealth;
	}
	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getDexterity() {
		return dexterity;
	}
	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getConstitution() {
		return constitution;
	}
	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}
	public int getIntelligence() {
		return intelligence;
	}
	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	public int getWisdom() {
		return wisdom;
	}
	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}
	public int getLuck() {
		return luck;
	}
	public void setLuck(int luck) {
		this.luck = luck;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getGold() {
		return gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}
	
	// Functional Methods
	
	public void Taunt() {
		System.out.println(this.name + " is taunting you!");
	}
	public int getATB() {
		// TODO Auto-generated method stub
		return ATB;
	}
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}
	public void setATB(int i) {
		// TODO Auto-generated method stub
		this.ATB = i;
	}
	public int getAttack() {
		// TODO Auto-generated method stub
		return attack;
	}
	
	public int getDefense() {
		return defense;
	}
	

}
