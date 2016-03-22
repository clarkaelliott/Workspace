package com.clarkaelliott.space_empires.graphics;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
  * PlanetListWindow.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  *
  * Notes:
  * 	TODO
  */

public class PlanetListWindow extends JPanel {
	
	PlanetBox planetBox = new PlanetBox("Planet 1");
	PlanetBox planetBox2 = new PlanetBox("Planet 2");
	PlanetBox planetBox3 = new PlanetBox("Planet 3");
	PlanetBox planetBox4 = new PlanetBox("Planet 4");
	PlanetBox planetBox5 = new PlanetBox("Planet 5");
	
	public PlanetListWindow() {
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.setPreferredSize(new Dimension(280, 900));
		this.setBackground(Color.green);
		this.setToolTipText("Planet List");
		
		add(planetBox);
		add(planetBox2);
		add(planetBox3);
		add(planetBox4);
		add(planetBox5);
		
		
		//this.setBorder(new EmptyBorder(20, 0, 0, 0));
		
	}

}
