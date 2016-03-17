package basics;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Player {
	
	private int dx, dy, x, y;
	private Image image;
	
	public Player() {
		
		initPlayer();
		
	}
	
	private void initPlayer() {
		
		ImageIcon ii = new ImageIcon("res/player.png");
		image = ii.getImage();
		x = 40;
		y = 60;
		
	}
	
	// TODO http://zetcode.com/tutorials/javagamestutorial/movingsprites/
	
	
	

}
