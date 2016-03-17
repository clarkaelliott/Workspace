package superBall;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends Applet implements Runnable, KeyListener {
	
	private int screenWidth = 450;
	private int screenHeight = screenWidth / 16 * 9;
	private int screenScale = 3;		
	private Image i;
	private Graphics buffer;
	Ball playerBall;
	Platform p1, p2, p3, p4, p5;
	
	
	@Override
	public void init() {
		setSize(screenWidth*screenScale, screenHeight*screenScale);
		addKeyListener(this);
	}
	
	@Override
	public void start() {
		playerBall = new Ball();
		p1 = new Platform(50, 200);
		p2 = new Platform(200, 250);
		p3 = new Platform(350, 300);
		p4 = new Platform(600, 350);
		p5 = new Platform(750, 500);
		Thread thread = new Thread(this);
		thread.start();	
	}
	
	public void run() {
		while (true) {		
			playerBall.update(this);
			p1.update(this, playerBall);
			p2.update(this, playerBall);
			p3.update(this, playerBall);
			p4.update(this, playerBall);
			p5.update(this, playerBall);
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
	}
	
	@Override
	public void stop() {
		
	}
	
	@Override
	public void destroy() {
		
	}
	
	@Override
	public void update(Graphics g) {
		//Double Buffer Loop
		if(i == null) {
			i = createImage(this.getSize().width, this.getSize().height);
			buffer = i.getGraphics();
		}
		
		buffer.setColor(getBackground());
		buffer.fillRect(0, 0, this.getSize().width, this.getSize().height);
		buffer.setColor(getForeground());
		paint(buffer);
		g.drawImage(i, 0, 0, this);
	}
	
	@Override
	public void paint(Graphics g) {
		playerBall.paint(g);
		p1.paint(g);
		p2.paint(g);
		p3.paint(g);
		p4.paint(g);
		p5.paint(g);
		
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			playerBall.moveLeft();
			break;
		case KeyEvent.VK_A:
			playerBall.moveLeft();
			break;
		case KeyEvent.VK_RIGHT:
			playerBall.moveRight();
			break;
		case KeyEvent.VK_D:
			playerBall.moveRight();
			break;
		case KeyEvent.VK_SPACE:
			playerBall.jump(playerBall.getJumpLevel());
			break;
		}
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

	
}
