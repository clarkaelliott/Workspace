package com.clarkaelliott.space_empires.graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
  * ExploreWindow.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  * 
  * Notes:
  * 	The Primary Action Area, Where the Fun Happens!
  */

public class ExploreWindow extends JPanel {
	private static final Insets insets = new Insets(0, 0, 0, 0);

	  private static void addComponent(Container container, Component component, int gridx, int gridy,
	      int gridwidth, int gridheight, int anchor, int fill) {
	    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
	        anchor, fill, insets, 0, 0);
	    container.add(component, gbc);
	  }
	
	JButton exploreButton = new JButton();
	JButton exploreButton2 = new JButton();
	JButton exploreButton3 = new JButton();
	
	//BigInteger explorationProgress;
	//explorationProgress = new BigInteger("1");
	
	BigInteger explorationProgress = BigInteger.valueOf(0);
	long explorationPower = 1;
	//BigInteger explorationTotal = BigInteger.valueOf(0);

	
	
	public ExploreWindow() {
		
		//double gameTimer = System.nanoTime();
		GridBagLayout gbag = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		setLayout(gbag);
		setPreferredSize(new Dimension(1300, 900));
		setToolTipText("Explore Window");
		setBackground(Color.black);
		JButton button;
		JTextField gameTime, explorationTotal;
		
	    // Row One - Three Buttons
		gameTime = new JTextField("Future Clock");
	    addComponent(this, gameTime, 0, 0, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.EAST);
	    gameTime.setEditable(false);
	    gameTime.setFocusable(false);
	    explorationTotal = new JTextField("Explored: " + explorationProgress);
	    addComponent(this, explorationTotal, 1, 0, 2, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL);
	    explorationTotal.setEditable(false);
	    explorationTotal.setFocusable(false);
	    /*
	    button = new JButton("Three");
	    addComponent(this, button, 2, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    // Row Two - Two Buttons
	    button = new JButton("Four");
	    addComponent(this, button, 0, 1, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    button = new JButton("Five");
	    addComponent(this, button, 2, 1, 1, 2, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    // Row Three - Two Buttons
	    button = new JButton("Six");
	    addComponent(this, button, 0, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
	    */
	    button = new JButton("Seven");
	    addComponent(this, button, 5, 5, 1, 1, GridBagConstraints.SOUTHEAST, GridBagConstraints.SOUTHEAST);
	    		
		
		
		//c.weightx = 1.0;
		//c.weighty = 1.0;
		//gbag.setConstraints(exploreButton2, c);
		//c.fill = GridBagConstraints.BOTH;
		//add(exploreButton2);
	    addComponent(this, exploreButton, 2, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.BOTH);
		//add(exploreButton);
		exploreButton.setPreferredSize(new Dimension(200, 200));
		exploreButton.setText("Explore the Galaxy");
		exploreButton.setFocusable(false);
		exploreButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//BigInteger newNumber = newNumber.add(BigInteger.valueOf(1));
				explorationProgress = explorationProgress.add(BigInteger.valueOf(explorationPower));
				explorationPower++;
				explorationTotal.setText("Exploration: " + explorationProgress);
				 //explorationTotal.repaint();
				
				
			}	
		});
		
		//this.add(exploreButton2, BorderLayout.WEST);
		//this.add(exploreButton3, BorderLayout.WEST);
	}

}
