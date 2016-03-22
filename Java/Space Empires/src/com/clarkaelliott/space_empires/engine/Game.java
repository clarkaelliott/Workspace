package com.clarkaelliott.space_empires.engine;

import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

import com.clarkaelliott.space_empires.graphics.GameWindow;

/**
  * Game.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  * Main Class, Entry Point, Game Loop
  * 	TODO
  * 
  * Notes:
  * 	TODO
  */

public class Game extends JFrame implements KeyListener {
	
	
	public Game() {
		
		initUI();
		
	}

	static Game game = new Game();
	
	boolean isFullscreen = false;
	static boolean isRunning = false;
	static String title = "Space Empires - v0.01a";
	
	
	
	// Initilization
	private void initUI() {
			
		setTitle(title);
		setSize(1600, 900);
		/*
		 * TODO Resolutions - 16:10 aspect ratio resolutions: - 1280×800, 1440×900, 1680×1050, 1920×1200 and 2560×1600. 16:9 aspect ratio resolutions: 1024×576, 1152×648, 1280×720, 1366×768, 1600×900, 1920×1080, 2560×1440 and 3840×2160
		 */
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		addKeyListener(this);
		
		// Quit Button Example & Tooltip Example
		JButton quitButton = new JButton("Quit");
		JButton btn = new JButton("Button");
		btn.setToolTipText("I'm a button!");
		
		quitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		createLayout(quitButton, btn);
		
		
	}
	
	private void createLayout(JComponent... arg) {
		
		// TODO FIRST
		/*
		 * Game Window (BorderLayout)
		 * 	Planet Menu (Box Layout X_AXIS)
		 * 		Planet List (Box Layout Y_AXIS, 280, 900+(scrollable))
		 * 			Planet Container (Box Layout X_AXIS, 280, 75)
		 * 				Planet Picture
		 * 				Planet Info Container (Box Layout Y_AXIS, 75, 205)
		 * 					Planet Info (Box Layout X_AXIS, 37, 205)
		 * 						Text - Name Rank Class Etc...
		 * 					Planet Info (Box Layout X_AXIS, 37, 205)
		 * 						Text - Name Rank Class Etc...
		 * 					Planet Info (Box Layout X_AXIS, 37, 205)			
		 * 			Planet Container (Box Layout X_AXIS, 280, 75)
		 * 				...
		 * 					...
		 * 						...
		 * 			...
		 * 				...
		 * 					...
		 * 		Scrollbar (Verticle, 20, 900)
		 * 	
		 * TODO Create Seperate Panel classes
		 * GamePanel extends JPanel
		 * see FirstGraphics example..
		 */
		
		/*
		Scrollbar planetScrollbar = new Scrollbar(Scrollbar.VERTICAL, 0, 50, 0, 500);
		planetScrollbar.setSize(20, 900);
		// Game Panel, Contains All Other Panels
		JPanel gamePanel = new JPanel();
		
		
		// Planets Panel, Contains Planets
		JPanel planetsPanel = new JPanel();
		planetsPanel.setToolTipText("Planets Panel");
		planetsPanel.setLayout(new BoxLayout(planetsPanel, BoxLayout.Y_AXIS));
		planetsPanel.setPreferredSize(new Dimension(300, this.HEIGHT));
		//planetsPanel.add(planetScrollbar);
		//planetsPanel.add(new Scrollbar(Scrollbar.VERTICAL, 0, 50, 0, 500));		
		// Planet Panel, Individual Panel for each Planet
		JPanel planetPanel = new JPanel();
		planetPanel.setToolTipText("A Planet");
		planetPanel.setLayout(new BoxLayout(planetPanel, BoxLayout.Y_AXIS));
		planetPanel.setBackground(Color.green);
		//planetPanel.setSize(new Dimension(280, 555));
		planetPanel.setBorder(new EmptyBorder(new Insets(0, 0, 75, 280)));
		
		// Planet Boxes
		planetsPanel.add(planetPanel);
		
		
		
		
		
		//planetsPanel.setBounds(90, 50, 250, 75);
		
		JPanel panel = new JPanel();
		
		gamePanel.setToolTipText("Game Panel");
		
		//panel.setToolTipText("Explore");
		
		
		
		gamePanel.setLayout(new BorderLayout());
		gamePanel.setBackground(Color.black);
		//gamePanel.add(planetsPanel);
		//gamePanel.add(panel);
		
		
		gamePanel.setBorder(new EmptyBorder(new Insets(50, 50, 50, 50)));
		
		//panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));		
		//panel.setBorder(new EmptyBorder(new Insets(0, 0, 0, 300)));
		
		//panel.add(arg[0]);
		//panel.add(Box.createRigidArea(new Dimension(0, 0)));
		
		//panel.add(arg[1]);
		//panel.add(Box.createRigidArea(new Dimension(0, 0)));
		
		add(gamePanel);
		add(planetScrollbar, BorderLayout.WEST);
		add(planetsPanel, BorderLayout.WEST);
		
		
		
		//add(planetsPanel, BorderLayout.WEST);
		//add(panel, BorderLayout.WEST);
		//panel.setPreferredSize(new Dimension(200, 0));
		//add(panel);
	
		//pack();
		 */
	
		GameWindow gameWindow = new GameWindow();
		add(gameWindow);
	}
	
	public static void update() {
		
	}
	
	public static void render() {
		game.repaint();
	}

	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				
				game.setVisible(true);
				game.requestFocus();
				
				// TIMER
		        long lastTime = System.nanoTime();
		        long timer = System.currentTimeMillis();
		        final double ns = 1000000000.0 / 60.0;
		        double delta = 0;
		        int frames = 0;
		        int updates = 0;
		        game.requestFocus();
		        // Game Loop
		        while (isRunning) {
		            long now = System.nanoTime();
		            delta += (now - lastTime) / ns;
		            lastTime = now;
		            while (delta >= 1) {
		                update();
		                updates++;
		                delta--;
		            }
		            render();
		            frames++;

		            if (System.currentTimeMillis() - timer > 1000) {
		                timer += 1000;
		                game.setTitle(title + "     |   UPS: " + updates + "    FPS:" + frames);
		                updates = 0;
		                frames = 0;
		            }

		        }
				
			}
			
			
			
		});
		
		

		// TODO init()
		// Window Initialization
		
		
		// TODO Window
		// TODO Timer
		// TODO Game Loop
		// TODO Mouse Input
		// TODO Render
		// TODO Update

		
		
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
			isRunning = false;
			System.exit(0);
		}
		if(e.getKeyCode() == KeyEvent.VK_ENTER && e.isAltDown()) {
			
			if(isFullscreen) {
				//setVisible(false);
				dispose();
				setSize(1600, 900);
				setUndecorated(false);
				setLocationRelativeTo(null);
				setVisible(true);
				isFullscreen = false;
			} else {
				//setVisible(false);
				dispose();
				setUndecorated(true);
				setExtendedState(JFrame.MAXIMIZED_BOTH);
				setVisible(true);
				isFullscreen = true;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
