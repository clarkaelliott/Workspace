package basics;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Application extends JFrame {
	
	private static final int WINDOW_RESOLUTION_WIDTH = 1024;
	private static final int WINDOW_RESOLUTION_HEIGHT = 768;
	
	public Application() {
		
		initUI(); // Creates User-Interface
		
	}
	
	private void initUI() {
		
		add(new Board()); // Adds Board to Center of JFrame
		
		setSize(WINDOW_RESOLUTION_WIDTH, WINDOW_RESOLUTION_HEIGHT); // Window Resolution
		
		setTitle("Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); // Centers Window on Screen
		
	}
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Application ex = new Application();
				ex.setVisible(true);
			}
			
		} );
		
	}

}
