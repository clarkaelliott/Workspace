package engine;

import mob.Mob;

// Superclass for all Skills, Spells & Abilities

public class Skill {

	// What do ALL Skills, Spells, and Abilities Have?
	
	private String name = "Skill Name"; // Should be changed within sub-class
	
	private ToolTip tooltip = new ToolTip("Tooltip");
	// Icon
	
	private double coolDown = 5; // Time in Turns
	
	private boolean isUsuableBy(Mob user) {
		return false;
	}	
	
}
