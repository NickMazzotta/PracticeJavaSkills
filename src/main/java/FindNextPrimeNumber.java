package main.java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class FindNextPrimeNumber extends JPanel implements ActionListener  {
	
	
	private int currentPrime = 1;
	private JButton nextPrimeButton;
	private JLabel descriptionLabel;
	private JLabel primeLabel;
	
	public static void createAndShowGui() {
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane(new FindNextPrimeNumber());
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	
	// constructor
	public FindNextPrimeNumber() {
		super();
		
		// set JPanel with padding as content pane of main frame
		Border padding = BorderFactory.createEmptyBorder(100, 100, 100, 100);
		this.setBorder(padding);
		
		// create box for UI elements
		Box box = Box.createVerticalBox();
		
		
		// labels
		this.descriptionLabel = 
				new JLabel("Click the button to find the next number");
		this.primeLabel = 
				new JLabel(Integer.toString(getCurrentPrime()));
		
		
		
		// buttons
		this.nextPrimeButton = new JButton("Next Prime");
		this.nextPrimeButton.addActionListener(this);
		
		// set alignment of elements to center
		// MUST SET ALL TO CENTER FOR CORRECT ALIGNTMENT
		this.descriptionLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		this.primeLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		this.nextPrimeButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		// add elements to box
		box.add(descriptionLabel);
		box.add(this.primeLabel);
		box.add(this.nextPrimeButton);
		
		// add box to content panel
		this.add(box, BorderLayout.CENTER);
	}

	
	// found optimized algorithm at:
	// https://stackoverflow.com/questions/47407251/optimal-way-to-find-next-prime-number-java
	int calculateNextPrime() {
		
		int possiblePrime = getCurrentPrime() + 1;
		int counter;
		
		while(true) {
			counter = 0;
			
			// checking against square root of prime reduces the cost
			// by half since a prime will not have a integer sqrt
			for (int i = 2; i <= Math.sqrt(possiblePrime); i++) {
				if (possiblePrime % i == 0) {
					counter++;
				}
				
			}
			
			if (counter == 0) {
				return possiblePrime;
			} else {
				possiblePrime += 1;
				continue;
			}
		}
	}
	
	void updateLabels() {
		this.primeLabel.setText(Integer.toString(getCurrentPrime()));
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		// find next prime and update value
		if (e.getSource() == nextPrimeButton) {
			setCurrentPrime(calculateNextPrime());
		}
		
		updateLabels();
		
	}

	// getters and setters
	public int getCurrentPrime() {
		return currentPrime;
	}

	public void setCurrentPrime(int currentPrime) {
		this.currentPrime = currentPrime;
	}
	
	
	
	// main
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGui();
			}
		});
	}
	
	

}
