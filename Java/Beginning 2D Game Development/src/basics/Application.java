package basics;

import java.awt.EventQueue;

import javax.swing.JFrame;

/*+----------------------------------------------------------------------
||
||  Class [Application.java] 
||
||         Author:  [Clark Elliott]
||
||        Purpose:  [A description of why this class exists.  For what
||                   reason was it written?  Which jobs does it perform?]
||
||  Inherits From:  [JPanel]
||
||     Interfaces:  [None]
||
|+-----------------------------------------------------------------------
||
||      Constants:  [Name all public class constants, and provide a very
||                   brief (but useful!) description of each.]
||
|+-----------------------------------------------------------------------
||
||   Constructors:  [List the names and arguments of all defined
||                   constructors.]
||
||  Class Methods:  [List the names, arguments, and return types of all
||                   public class methods.]
||
||  Inst. Methods:  [List the names, arguments, and return types of all
||                   public instance methods.]
||
++-----------------------------------------------------------------------*/

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
