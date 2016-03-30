import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
  * Keyboard.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 28, 2016
  * 
  */

public class Keyboard implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_ESCAPE)
			System.exit(0);		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}