package engine;

/*==================================================================
 *= KNOWN BUGS
 *=-=-=-=-=-=-===-=-=-=
 *= FIXME Combat Math is Broken TODO Re-Write Entire Combat Class
 *=
 *=
 *=
 *=
 *=
 *=
 *=
 *=
 *=
 *
 */

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;

/*============================================
 *	The Principles of Good Programming
 *	DRY - Don't Repeat Yourself, Avoid Repetition.
 *	
 * 
 * 
 */

import java.util.Scanner;

import mob.Bat;
import mob.Goblin;
import mob.Mob;
import mob.Player;
import mob.Rat;

public class Game {
	
	public static void main(String[] args) {
		
		// Setup & Initialization
		Scanner sc = new Scanner(System.in);
		String choice = null;
		
		Player player = null;
		
		// Try to Load a Saved File
		if (new File("res/save.txt").exists()) {
			try {
				player = new Player(loadGame()); // Load Saved Player
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		} else
			player = new Player(); // Create a New Player		
		
		// Attempt to Ask Player for Name	
		
		if (player.getName() == null) {
			System.out.print("What is your name? ");
			player.setName(sc.nextLine());
		} else
			System.out.println("Welcome back " + player.getName());
		
		// Game Loop Conditional
		boolean isPlaying = true;
		
		// Game Loop
		
		/*
		 * Display Options 
		 * Receive Choice
		 * (Explore)-> Monster or NPC or Item?
		 * Monster -> Which Monster -> Create Monster -> Fight Monster
		 * Repeat
		 * NPC -> Friend or Foe? -> Which NPC? -> Interact with NPC
		 * Repeat
		 * Item -> Equip Consumable or Unique? -> Which Item
		 * Repeat
		 */
		
		// Primary Game Loop
		while (isPlaying) {
			// Alive Game Loop
			while (player.getHealth() > 0 && isPlaying) {
				System.out.println("\n\n" + "So... what now?");
				System.out.println();
				System.out.println("Explore!" + "\n" + "Battle!");
				System.out.print("I want to ");
				
				choice = sc.nextLine();
				if (choice.toLowerCase().contains("exp")) {
					//System.out.println("\nExploring...");
					Explore(player);
					// Exploring -> Chance to find a Monster, NPC, or Item
					// Explore();
					// if Explore() Boolean..... no... booleans inside maybe, like 3 of them
					// Explore(player) should perform the respective event based on random*level
					// 
					
					
					
				} else if (choice.toLowerCase().contains("bat")) {
					System.out.println("\nBattles...");
				} else if (choice.toLowerCase().contains("exit")) {
					System.out.println("See you next time!");
					isPlaying = false;
				} else if (choice.toLowerCase().contains("check")) {
					// Figure out a way to get mobs to print up stats from my string... check bat
				}
				
				
					else {
					System.out.println("\n--------------------------------------\nSorry, " + choice + " is not a valid command..\n--------------------------------------");
				}
				
				// Players Info
				System.out.println("_____________________________________\n" + player.getName() + " - Level " + player.getLevel() + " Adventurer"); // TODO Replace "adventurer" with player.getClass();
				System.out.println("\nHealth: " + player.getHealth() + "/" + player.getMaxHealth());
				System.out.println("Experience: " + player.getExperience() + "/" + player.getToNextLevel() + "\n_____________________________________");
			}
			
			// Dead Game Loop
			while (player.getHealth() <= 0 && isPlaying) {
				System.out.println("Oh no!\nYou seem to be dead...");
				System.out.println("Hold on... I'll rez you");
				player.setHealth(player.getMaxHealth());
				System.out.println("There you go, just be careful next time would ya.");
			}					
			
		}
		
		
		// Save Game & Exit
		try {
			saveGame(player.toString());
			System.exit(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}
	
	public void fight(Player player, Player m1) {
		// How to pass objects, and use their variables??
		
		
		
	}
	
	
	// This version of Fight will take variable as arguements instead of the object itself
	public void simpleFight(int pAtk, int mAtk) {
		
	}
	
	public static void Combat(Player player, Mob monster) {
		System.out.println(player.getName() + " encountered a " + monster.getName() + "!");
		while (player.getHealth() >= 1 && monster.getCurrentHealth() >= 1) {
			Turn(player, monster);
			if (player.getHealth() <= 0) {
				System.out.println("You were slain by the " + monster.getName());
			} else if (monster.getCurrentHealth() <= 0) {
				System.out.println("You killed the " + monster.getName() + "\n\n\n");
				if (player.getExperience() + monster.getExperience() >= player.getToNextLevel()) {
					player.levelUp();
				} else if (player.getExperience() + monster.getExperience() < player.getToNextLevel()) {
					player.setExperience(player.getExperience() + monster.getExperience());
				}
				// TODO Introduce Mob Drops aka LOOT!!!
								
			}
		}
		
	}
	
	public static void Turn(Player player, Mob monster) {
		Scanner sc = new Scanner(System.in);
		// Check for Player's Turn && Check for Monster's Turn
		// Determine who would go first?? I guess highest ATB in the event of a tie??
		if (player.getATB() + player.getSpeed() >= 100 && monster.getATB() + monster.getSpeed() < 100) {
			player.setATB(player.getATB() - (100 - player.getSpeed()));
			monster.setATB(monster.getATB() + monster.getSpeed());
			System.out.println(player.getName() + "'s Turn!");	
			// Player Attacks Monster
			System.out.println(player.getName() + " hits " + monster.getName() + " for " + ((int)((player.getAttack() / 2) + Math.random() * (player.getAttack() * 2) - monster.getDefense())) + " damage!");
			monster.setCurrentHealth(monster.getCurrentHealth() - ((int)((player.getAttack() / 2) + Math.random() * (player.getAttack() * 2) - monster.getDefense())));
			
		} else if (monster.getATB() + monster.getSpeed() >= 100 && player.getATB() + player.getSpeed() < 100) {
			monster.setATB(monster.getATB() - (100 - monster.getSpeed()));
			player.setATB(player.getATB() + player.getSpeed());
			System.out.println(monster.getName() + "'s Turn!");
			// Monster Attacks Player
			System.out.println(monster.getName() + " hits " + player.getName() + " for " + (monster.getAttack() - player.getDefense()) + " damage!");
			player.setHealth(player.getHealth() - (monster.getAttack() - player.getDefense()));
			
		} else if (player.getATB() + player.getSpeed() >= 100 && monster.getATB() + monster.getSpeed() >= 100) {
			player.setATB(player.getATB() - (100 - player.getSpeed()));
			monster.setATB(monster.getATB() - (100 - monster.getSpeed()));
			System.out.println("Tie!!");
			// Both Attack Each Other
			System.out.println(player.getName() + " hits " + monster.getName() + " for " + (player.getAttack() - monster.getDefense()) + " damage!");
			monster.setCurrentHealth(monster.getCurrentHealth() - (player.getAttack() - monster.getDefense()));
			System.out.println(monster.getName() + " hits " + player.getName() + " for " + (monster.getAttack() - player.getDefense()) + " damage!");
			player.setHealth(player.getHealth() - (monster.getAttack() - player.getDefense()));
			
		} else {
			player.setATB(player.getATB() + player.getSpeed());
			monster.setATB(monster.getATB() + monster.getSpeed());
			// No Attacks
			
		}
			//TESTING
		//System.out.println(player.getName() + "'s ATB: " + player.getATB() + "/100" + "  |  " + monster.getName() + "'s ATB: " + monster.getATB() + "/100");
		//String bs = sc.nextLine();
		
	}
	
	public static void Explore(Player player) {
		int chance = (int)(Math.random() * 2);
		
		// TODO Create more monsters
		// Slime, Rat, Imp, Goblin, Orc, Etc
		// 0-3 Noob Mobs
		// 3 & 4 = NPC & Loot
		// 5-10 Easy Mobs
		// 11-14 Loot
		// 15-18 NPCs
		// 19-30 Medium Mobs etcccc
		
		// There has to be a better way to do these monsters.  This switch statement is problematic as the player will soon forget about lower level monsters
		// as they will become more rare, and just as well higher level players will randomly encounter low level trash unessecarily...
		
		// Perhaps an array list, or weighted rolls based on level through if branches
		// ie: if(level<5) roll1, if (level<10) roll2, so forth...
		// Not to mention this switch statement is tedious...
		
		switch (chance + (player.getLevel() - 1)) {
		case 0: System.out.println("Easy Monster");
			Bat bat1 = new Bat();
			Combat(player, bat1);
		break;
		case 1: Bat goblin1 = new Bat();
			Combat(player, goblin1);
			break;
		case 2: System.out.println("Difficult Monster");
		// TODO Add More Monsters!!!
		break;
		case 3: System.out.println("NPC");
		// TODO Introduce NPCs!!!
		break;
		case 4: System.out.println("Item");
		// TODO Introduce Items & Treasure!!!
		break;
		
		default: System.out.println("Default!!!!!!");
		break;
		}
	}
	
	public static boolean Explore2(Player player) {
		return false;
		
	}
	
	// Saving & Loading
	
	// Save Game
	private static void saveGame(String saveInfo) throws IOException {			
			
		File saveFile = new File("res/save.txt");
		
		if (!saveFile.exists())
			saveFile.createNewFile();
		
		FileWriter outputStream = null;
		
		try {
			outputStream = new FileWriter("res/save.txt");			
			outputStream.write(saveInfo);
		} finally {
			if (outputStream != null) {
				outputStream.close();
			}
		}		
	}
	
	// Load Game
	private static String loadGame() throws IOException {
		String loadInfo = new String();
		File saveFile = new File("res/save.txt");
		Scanner saveReader = new Scanner(saveFile);
		
		if (!saveFile.exists())
			saveFile.createNewFile();
		
		return saveReader.nextLine();
	}

}
