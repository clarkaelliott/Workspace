package mob;

// 2nd Monster

public class Goblin extends Player {

	public Goblin() {
	
		this.name = "Goblin";
		this.setLevel(2);
		this.setExperience(15);
		this.setMaxHealth(18);
		this.setHealth(this.getMaxHealth());
		this.setAttack(6);
		this.setSpeed(12);
		this.setDefense(2);
	}
	
}
