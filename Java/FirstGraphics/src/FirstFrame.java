import java.awt.BorderLayout;

import javax.swing.JFrame;

public class FirstFrame {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My First Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1024, 768);
		frame.setVisible(true);
		
		MyPanel panel = new MyPanel(); // Creates new MyPanel object. (Extends JPanel)
		frame.add(BorderLayout.CENTER, panel); // Adds panel to CENTER region of JFrame?
		
		
		
	}
	
}
