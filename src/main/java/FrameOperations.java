package main.java;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameOperations {

	public static void createBasicFrame() {
		
		// create a frame
		JFrame frame = new JFrame("Basic Frame");
		
		// change what happens on close
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// add components
		// create basic label
		JLabel basicLabel = new JLabel("Basic Text");
		frame.getContentPane().add(basicLabel, BorderLayout.CENTER);
		
		// size the frame automatically
		frame.pack();
		
		// alternatively, specify the dimensions...
//		frame.setSize(int width, int height);
		// ... or specify the size and position
//		frame.setBounds(Rectangle r);
		
		//center the frame on screen
		frame.setLocationRelativeTo(null);
		
		// show the frame
		frame.setVisible(true);
		
	}
}
