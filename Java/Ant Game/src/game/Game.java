package game;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends Applet implements Runnable, KeyListener {	
	private static final long serialVersionUID = 1L;

	private int screenWidth = 450;
	private int screenHeight = screenWidth / 16 * 9;
	private int screenScale = 3;		
	private Image i;
	private Graphics buffer;	
	Ant playerAnt;
	
	@Override
	public void init() {
		setSize(screenWidth*screenScale, screenHeight*screenScale);
		addKeyListener(this);
	}
	
	@Override
	public void start() {
		Thread thread = new Thread(this);
		thread.start();	
		playerAnt = new Ant(50, 50); 
	}
	
	public void run() {
		while (true) {	
			playerAnt.update(this);
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
		playerAnt.paint(g);
	}

	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			//playerBall.moveLeft();
			break;
		case KeyEvent.VK_A:
			//playerBall.moveLeft();
			break;
		case KeyEvent.VK_RIGHT:
			//playerBall.moveRight();
			break;
		case KeyEvent.VK_D:
			//playerBall.moveRight();
			break;
		case KeyEvent.VK_SPACE:
			//playerBall.jump(playerBall.getJumpLevel());
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
