import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
  * Game.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  * 
  */

public class Game extends JFrame {
	
	public Game() {
		this.setSize(1920, 1080);
		this.setTitle("Baisc RPG");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.setVisible(true);
		this.requestFocus();
		this.setLayout(new BorderLayout());
		
		KeyListener keyboard = new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_ESCAPE)
					System.exit(0);
				
			}
		};
		this.addKeyListener(keyboard);
	}
	
	private static final Insets insets = new Insets(0, 0, 0, 0);
	
	private static void addComponent(Container container, Component component, int gridx, int gridy,
		      int gridwidth, int gridheight, int anchor, int fill) {
		    GridBagConstraints gbc = new GridBagConstraints(gridx, gridy, gridwidth, gridheight, 1.0, 1.0,
		        anchor, fill, insets, 0, 0);
		    container.add(component, gbc);
	}
	
	private static void init() {
		Game game = new Game();
		
		// First attempt at ui..
		JPanel actionScreen = new JPanel();
		actionScreen.setPreferredSize(new Dimension(800, 750));
		actionScreen.setBackground(Color.darkGray);
		//GridBagLayout actionScreenLayout = new GridBagLayout();
		//GridBagConstraints c = new GridBagConstraints();
		actionScreen.setLayout(new BorderLayout());
		//actionScreen.setBorder(new EmptyBorder(new Insets(100, 100, 100, 100)));
		
		FightScreen fightScreen = new FightScreen();
		//JPanel fightScreen = new JPanel();
		//fightScreen.setBackground(Color.black);
		//addComponent(actionScreen, fightScreen, 3, 3, 3, 7, c.NORTHWEST, c.SOUTHEAST);
		//JButton btn0 = new JButton();
		//addComponent(btn0, fightScreen, 0, 0, 1, 1, c.NORTHWEST, c.SOUTHEAST);
		//JButton btn1 = new JButton();
		//addComponent(btn1, fightScreen, 7, 7, 1, 1, c.SOUTHEAST, c.NORTHWEST);
		
		actionScreen.add(fightScreen, BorderLayout.CENTER);
		
		JPanel navMenu = new JPanel();
		navMenu.setPreferredSize(new Dimension(400, 750));
		navMenu.setBackground(Color.lightGray);
		
		JPanel actionBar = new JPanel();
		actionBar.setPreferredSize(new Dimension(1200, 150));
		actionBar.setBackground(Color.gray);
		
		JPanel rightBar = new JPanel();
		rightBar.setPreferredSize(new Dimension(200, 900));
		rightBar.setBackground(Color.green);
		
		game.add(navMenu, BorderLayout.WEST);
		game.add(actionScreen, BorderLayout.CENTER);
		game.add(actionBar, BorderLayout.SOUTH);
		game.add(rightBar, BorderLayout.EAST);
		
	}

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				init();
			}
		});

	}

}
