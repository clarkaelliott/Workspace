package com.clarkaelliott.space_empires.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Scrollbar;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

/**
  * PlanetsWindow.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  * 
  * Notes:
  * 	TODO
  */

// The Main Planets Window, Contains Sub-Windows for Planets
public class PlanetsWindow extends JPanel {

	Scrollbar planetScrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 1, 0, 10);
	PlanetListWindow planetListWindow = new PlanetListWindow();
	
	public PlanetsWindow() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		//this.setPreferredSize(new Dimension(280, 900));
		this.setToolTipText("Planets Window");
		this.setBackground(Color.cyan);
		this.add(planetListWindow);
		this.add(planetScrollbar);
		
	}
	
	
}
