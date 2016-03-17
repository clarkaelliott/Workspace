package superBall;

import java.awt.Color;
import java.awt.Graphics;

public class Platform {
	int dx;
	int x, y, width, height;
	
	public Platform() {
		dx = -10;
		x = 300;
		y = 300;
		width = 120;
		height = 40;
		
	}
	
	public Platform(int xPos, int yPos) {
		x = xPos;
		y = yPos;
		dx = -10;
		width = 120;
		height = 40;
	}
	
	public void update(Game game, Ball b) {
		checkForCollision(b);
	}
	
	private void checkForCollision(Ball b) {
		int ballX = b.getX();
		int ballY = b.getY();
		int radius = b.getRadius();
		
		if(ballY + radius > y && ballY + radius < y + height && ballX - radius < x + width && ballX + radius > x) {
			double newDy = b.getDy() * -1;
			b.setDy(newDy);
			b.setBounceCount(+1);
		}
	}
	
	public void update(Game game) {
		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.PINK);
		g.drawRect(x, y, width, height);
		g.fillRect(x, y, width, height);
	}
}
