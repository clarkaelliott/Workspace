package basics;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Board extends JPanel {
	
	private Image myImage;
	
	public Board() {
		
		initBoard();
		
	}
	
	private void initBoard() {
		
		loadImage();
		
		int w = myImage.getWidth(this);
		int h = myImage.getHeight(this);
		setPreferredSize(new Dimension(w, h) );
		
	}
	
	private void loadImage() {
		
		ImageIcon ii = new ImageIcon("res/myImage.png");
		myImage = ii.getImage();
		//TODO Scale Outside of Java, Wasting Memory..
		myImage = myImage.getScaledInstance(64, 64, myImage.SCALE_SMOOTH);
		
	}
	
	@Override
	public void paintComponent(Graphics g) {
		
		g.drawImage(myImage, 0, 0, null);
		
	}
	
	
	    
}
