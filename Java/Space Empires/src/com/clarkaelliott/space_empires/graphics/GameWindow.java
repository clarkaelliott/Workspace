package com.clarkaelliott.space_empires.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
  * GameWindow.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  * 
  * Notes:
  * 	TODO
  */

// The Main Game Window, Contains All Sub-Windows
public class GameWindow extends JPanel {

	private static final long serialVersionUID = -712526158719215626L;
	
	//JPanel planetsWindow = new JPanel();
	PlanetsWindow planetsWindow = new PlanetsWindow();
	ExploreWindow exploreWindow = new ExploreWindow();
	
	public GameWindow() {
		
		this.setLayout(new BorderLayout());
		this.setPreferredSize(new Dimension(1600, 900));
		this.setToolTipText("Game Window");
		this.setBackground(Color.black);
		
		//planetsWindow.setPreferredSize(new Dimension(300, 900));
		add(planetsWindow, BorderLayout.WEST);
		add(exploreWindow, BorderLayout.CENTER);
	}
	
}
