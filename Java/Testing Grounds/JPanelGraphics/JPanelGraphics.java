import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
  * JPanelGraphics.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  *
  * Instructions:
  * 	TODO
  * 
  * Notes:
  * 	TODO
  */

public class JPanelGraphics extends JPanel {
	
	public JPanelGraphics() {
		//setSize(new Dimension(800, 600));
	}
	
	
	
	@Override
	protected void paintComponent(Graphics g) {
		
		
		int x = 0, y = 500;
		
		g.fillRect(x, y, 200, 200);
		g.setColor(Color.black);
		
		g.fillRect(0, 0, 800, 600);
		g.setColor(Color.red);
		
		for (int i = 0; i < 111; i++)
			for (int j = 111; j > 0; j--) {
				x = i;
				y = j;
				g.fillRect(x, y, 2, 2);
				g.setColor(Color.black);
				repaint();
			}
		repaint();
		
		
	}
	
	private static void init() {
		JFrame mainWindow = new JFrame("JPanelGraphics");
		JPanelGraphics graphicsWindow = new JPanelGraphics();
		Graphics g;
		
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainWindow.setSize(800, 600);	
		mainWindow.setLocationRelativeTo(null);
		
		mainWindow.add(BorderLayout.CENTER, graphicsWindow);
		
		//mainWindow.pack();
		mainWindow.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		init();
		
		
	}

}
