package superBall;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private int x = 100;
	private int y = 0;
	private double dx = 0;
	private double dy = 0;
	private int radius = 22;
	private double gravity = 20;
	private double energyLoss = 0;
	private double dt = 0.2;
	private double xFriction = 0.9;
	private int bounceCount = 0;
	private int jumpLevel = 20;
	
	public Ball(int i, int j) {
		x = i;
		y = j;
	}

	public Ball() {
		x = 0;
		y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public double getDx() {
		return dx;
	}
	
	public void setDx(double dx) {
		this.dx = dx;
	}
	
	public double getDy() {
		return dy;
	}
	
	public void setDy(double dy) {
		this.dy = dy;
	}
	
	public void moveRight() { 
		if (dx + 1 < 30) {
			dx += 3;
		}
	}
	
	public void moveLeft() { 
		if (dx - 1 > -30) {
			dx -= 3;
		}
	}

	public void update(Game game) {
		if (x+ dx > game.getWidth() - radius - 1) {
			x = game.getWidth() - radius - 1;
			dx = -dx;
		} else if (x + dx < 0 + radius) {
			x = 0+radius;
			dx = -dx;
		}
		else {
			x += dx;
		}
		
		if(y == game.getHeight() - radius - 1) {
			dx *= xFriction;
			if (Math.abs(dx) < 0.8) {
				dx = 0;
			}
		}
		
		if(y > game.getHeight() - radius - 1) {
			y = game.getHeight() - radius - 1;
			dy *= Math.random() * energyLoss + 0.7;
			dy = -dy;
			if (bounceCount < 5) {
			bounceCount++;
			System.out.println("Bounce Count: " + bounceCount);
			}
		} else {
			dy += gravity * dt;
			//position formula
			y += dy * dt + 0.5 * gravity * dt * dt;
		} 
	}
	
	public void jump(int jumpLevel) {	
		int j = jumpLevel;
		if (bounceCount >= 1) {
				//TODO FIGURE A JUMP FORMULA FOR PLAYER LEVEL
				//dy -= Math.abs(dy * 1.05);			
				// y -= bounceCount + bounceImpulse + levelMod
				y -= (10*bounceCount) + Math.abs(j*(dy * dt + 0.5 * gravity * dt * dt)*bounceCount);
				bounceCount -= bounceCount;
				System.out.println("Movement: " + y);
		} else {
			//TODO Jump on Cool Down
		}		
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(x-radius, y-radius, radius*2, radius*2);
	}
	
	public int getJumpLevel() {
		return jumpLevel;
	}
	
	public void setJumpLevel(int jumpLevel) {
		this.jumpLevel = jumpLevel;
	}
	
	public int getBounceCount() {
		return bounceCount;
	}
	
	public void setBounceCount(int bounceCount) {
		this.bounceCount = bounceCount;
	}
	
	public int getRadius() {
		return radius;
	}
}
