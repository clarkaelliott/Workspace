import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
  * HelloWorld.java
  *  
  * Author: Clark Elliott  |  Last Updated: Mar 25, 2016
  * 
  *
  * My Introduction to Swing - (HelloWorld)
  * 
  * Instructions:
  * 	Create a Swing Application that
  * 	- Displays a Hello World message
  * 	- Has a clickable button to duplicate the message
  * 	- Has another button to quit with
  * 
  * Notes:
  * 	
  */

public class HelloWorld {	
	// Our Custom JFrame
	private static class Window extends JFrame {
		
		public Window() {
			init();
		}
		
		private void init() {
			// Window Setup
			setTitle("Hello World 1.0");
			setSize(1024, 768);
			setLocationRelativeTo(null); // Open in Center of Display
			setDefaultCloseOperation(EXIT_ON_CLOSE); // X on Window decoration
			
			// Message
			JTextArea helloWorldText = new JTextArea();
			helloWorldText.setEditable(false);
			helloWorldText.append("Hello World\n");
			
			// Buttons
			JButton duplicateMessageButtonEast = new JButton("Say it Again!");
			JButton duplicateMessageButtonWest = new JButton("Say it Again!");
			JButton quitButton = new JButton("That's Enough");
		
			duplicateMessageButtonEast.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					
					helloWorldText.append("Hello World\n");					
				}				
			});
			duplicateMessageButtonWest.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					helloWorldText.append("Hello World\n");					
				}				
			});
			quitButton.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);					
				}
			});
			
			// Layout
			JPanel screen = new JPanel();
			screen.setLayout(new BorderLayout());
			
			screen.add(helloWorldText, BorderLayout.CENTER);
			screen.add(duplicateMessageButtonEast, BorderLayout.EAST);
			screen.add(duplicateMessageButtonWest, BorderLayout.WEST);
			screen.add(quitButton, BorderLayout.SOUTH);
			this.add(screen);
			
		}
				
	}

	public static void main(String[] args) {
		// Good Practice
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Window window = new Window();
				window.setVisible(true);			
			}				
		});		

	}

}
