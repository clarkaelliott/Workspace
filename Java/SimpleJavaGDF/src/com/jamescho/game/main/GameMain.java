package com.jamescho.game.main;

import javax.swing.JFrame;

public class GameMain {
	
	private static final String GAME_TITLE = "Java Game Development Framework (Chapter 4)";
	
	public static final int GAME_WIDTH = 800;
	public static final int GAME_HEIGHT = 450;
	public static Game sGame;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame(GAME_TITLE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Terminates program on exit button
		frame.setResizable(false); // Prevents manual resizing of window
		frame.setVisible(true); // Basically required, makes window visible
		frame.requestFocus();
		frame.setLocation(0, 0);
		
	}
	
}
