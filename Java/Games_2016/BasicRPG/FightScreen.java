import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
  * FightScreen.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 19, 2016
  * 
  */

public class FightScreen extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		int x = 500;
		int y = 700;
		g.fillRect(getWidth() / 2 - (x/2), getHeight() / 2 - (y/2), x, y);
		g.setColor(Color.white);
		g.fillRect(getWidth() / 2 - (x/2), getHeight() / 2 - 20, 500, 20);
		g.setColor(Color.yellow);
		g.fillRect(getWidth() / 2 - (x/4), getHeight() / 2 + (y/4), x/3, y/3);
	
	
	
	}

}
