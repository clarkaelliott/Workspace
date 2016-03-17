package mob;

/* This is the Player class.
 * Players are for now the base of all mobs in the game, for simplicity sake.
 * Currently we are working on the basics of combat, this will require.
 * Life/MaxLife Attack/Defense & SPEED*
 * 
 * I have to come up with a system for determining who attacks first, it is not fair to have the player always striking first.
 * Similar to ATB in FFX
 * 
 * I suppose we could say when a Turn passes each mob generates some ATB based on Speed, the system will continue to progress forward until
 * the ATB is full and then the player can choose an action.
 * Could go with the traditional 100/100 ATB to attack... not a bad start I suppose
 * Speed would default at what, 20?  So 5 turns = Attack, leaves room for Speed increase and Haste and what not.
 * Maybe 50 would be a better starting place, so 50/100 then 100/100 ATTACK 0/100 .. 50/100 .. 100/100 ATTACK .. 0/100 ETC....
 *
 * Then something such as Haste could give Speed*1.5 = 75?
 * 
 * What happens to rollover?  75/100 150/100 - 100 = 50/100 ??  Is that fair??
 * Or would be it 75/100, 150/100 -> 0/100 -> 75/100
 * 
 * Lets see
 * 
 *
 *
 */

public class Player {
	
	// New Game Constructor
	public Player() {
		this.level = 0;
		this.experience = 0;
		this.toNextLevel = 2;
		this.currentHealth = 20; 
		this.maxHealth = 20;
		this.attack = 4;
		this.defense = 1; 
		this.speed = 20;
		this.ATB = 0;
	}

	// Load Game Constructor
	public Player(String string) {
		String[] save1 = string.split(" ");
		
		this.name = save1[0];
		this.level = Integer.parseInt(save1[1]);
		this.experience = Integer.parseInt(save1[2]);
		this.toNextLevel = Integer.parseInt(save1[3]);	
		this.currentHealth = Integer.parseInt(save1[4]);	
		this.maxHealth = Integer.parseInt(save1[5]);	
		this.attack = Integer.parseInt(save1[6]);	
		this.defense = Integer.parseInt(save1[7]);	
		this.speed = Integer.parseInt(save1[8]);	
		this.ATB = Integer.parseInt(save1[9]);	
	}

	// Player Stats

	public String name;
			
	private int level, experience, toNextLevel, currentHealth, maxHealth, attack, defense, speed, ATB;		
	
	public String getName() {
		return name;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return currentHealth;
	}
	public void setHealth(int health) {
		currentHealth = health;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void setMaxHealth(int health) {
		this.maxHealth = health;
	}
	
	public void Attack(Player target) {
		System.out.println("You attack " + target.getName() + " for " + (this.getAttack() - target.getDefense()) + " damage!");
		target.setHealth(target.getHealth() - this.getAttack() - target.getDefense());
		System.out.println();
		System.out.println("You: " + this.getHealth() + "/" + this.getMaxHealth());
		System.out.println("Rat: " + target.getHealth() + "/" + target.getMaxHealth());
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getATB() {
		return ATB;
	}

	public void setATB(int aTB) {
		ATB = aTB;
	}
	
	public int getExperience() {
		return this.experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getToNextLevel() {
		return toNextLevel;
	}

	public void setToNextLevel(int toNextLevel) {
		this.toNextLevel = toNextLevel;
	}
	
	public void levelUp() {
		System.out.println("\n-------------------------------------\nLevel Up!!!\n-------------------------------------");
		this.level++;
		this.experience = 0;
		this.toNextLevel *= 2;
		this.attack += this.level;
		this.maxHealth += (this.level * 5);
		this.currentHealth = this.maxHealth;
		this.speed++;
	}
	
	@Override
	public String toString() {
		// Formatted String for save.txt
		String toReturn = this.name;		
		toReturn += " " + this.level;
		toReturn += " " + this.experience;
		toReturn += " " + this.toNextLevel;
		toReturn += " " + this.currentHealth;
		toReturn += " " + this.maxHealth;
		toReturn += " " + this.attack;
		toReturn += " " + this.defense;
		toReturn += " " + this.speed;
		toReturn += " " + this.ATB;
		
		return toReturn;
	}
			
}
