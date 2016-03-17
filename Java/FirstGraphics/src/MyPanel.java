import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 100, 100);
		
		g.setColor(Color.GREEN);
		g.drawRect(50, 50, 100, 100);
		
		g.setColor(Color.RED);
		g.drawString("Hello, World of GUI", 200, 200);
		
		g.setColor(Color.BLACK);
		g.fillOval(250, 40, 100, 30);
		
		g.drawString("Apple Jacks", 500, 400);
		
	}

}
