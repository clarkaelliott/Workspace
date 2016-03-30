import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

/**
  * Game.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 28, 2016
  * 
  */

public class Game extends JFrame {
	
	public Game() {
		setupGUI();
		//setupPlayer();
		//setupMobs();
		//startGameLoop();
	}
	
	private static final int SCALE = 100;
	private static final int WIDTH = 16 * SCALE;
	private static final int HEIGHT = 9 * SCALE;
	
	private void setupGUI() {
		createMenuBar();

		setSize(WIDTH, HEIGHT);
		setTitle("Grind - RPG Simulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// Create Keyboard & TODO Mouse
		Keyboard key = new Keyboard();
		this.addKeyListener(key);
	}
	
	private void createMenuBar() {        
        JMenuBar menubar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");

        JMenuItem newMi = new JMenuItem("New");
        JMenuItem openMi = new JMenuItem("Open");
        JMenuItem saveMi = new JMenuItem("Save");
        JMenuItem exitMi = new JMenuItem("Exit");
        exitMi.setToolTipText("Quit the Game");

        exitMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        fileMenu.add(newMi);
        fileMenu.add(openMi);
        fileMenu.add(saveMi);
        fileMenu.addSeparator();
        fileMenu.add(exitMi);

        menubar.add(fileMenu);

        setJMenuBar(menubar);        
    }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				Game game = new Game();
				game.setVisible(true);
				
			}
			
		});
		
	}

}
