package com.clarkaelliott.space_empires.graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;

import javax.swing.JPanel;

/**
  * PlanetBox.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  *
  * Notes:
  * 	Container class for Planet(s) information, populates PlanetListWindow
  */

public class PlanetBox extends JPanel implements EventListener {
	
	private boolean isVisible = true;
	
	public PlanetBox(String s) {
		
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				//setOpaque(false);
				//isVisible = true;
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				setToolTipText("Clicked!");
			}
		});
		
		setPreferredSize(new Dimension(280, 150));
		setMaximumSize(new Dimension(280, 150));
		this.setToolTipText(s);
		this.setBackground(Color.red);
		//setBorder(new EmptyBorder(new Insets(20, 0, 20, 0)));
		setVisible(isVisible);
		
	}

}
