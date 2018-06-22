package main.java;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class FindNextPrimeNumber implements ActionListener {
	
	// main
	public static void main(String[] args) {
		
		FindNextPrimeNumber window = new FindNextPrimeNumber();
	}
	
	private int currentPrime = 1;
	private JButton nextPrimeButton;
	private JLabel primeLabel;
	
	
	
	// constructor
	public FindNextPrimeNumber() {
		super();
		
		// create main frame
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// set JPanel with padding as content pane of main frame
		JPanel contentPanel = new JPanel();
		Border padding = BorderFactory.createEmptyBorder(100, 100, 100, 100);
		contentPanel.setBorder(padding);
		frame.setContentPane(contentPanel);
		
		
		
		// create box for UI elements
		Box box = Box.createVerticalBox();
		contentPanel.add(box, BorderLayout.CENTER);
		
		// labels
		JLabel descriptionLabel = new JLabel("Click the button to find the next number");
		box.add(descriptionLabel, BorderLayout.CENTER);
		
		this.primeLabel = 
				new JLabel(Integer.toString(getCurrentPrime()));
		box.add(this.primeLabel, BorderLayout.CENTER);
		
		
		// buttons
		this.nextPrimeButton = new JButton("Next Prime");
		this.nextPrimeButton.addActionListener(this);
		box.add(this.nextPrimeButton, BorderLayout.CENTER);
		
		
		
		
		// size the frame automatically
		frame.pack();
		
		//center the frame on screen
		frame.setLocationRelativeTo(null);
				
		// show the frame
		frame.setVisible(true);
	}

	
	// found optimized algorithm at:
	// https://stackoverflow.com/questions/47407251/optimal-way-to-find-next-prime-number-java
	int findNextPrime() {
		
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
	
	void updateUI() {
		this.primeLabel.setText(Integer.toString(getCurrentPrime()));
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("Action Event triggered");
		
		// find next prime and update value
		if (e.getSource() == nextPrimeButton) {
			System.out.println("nextPrimeButton pressed");
			setCurrentPrime(findNextPrime());
		}
		
		updateUI();
		
	}

	// getters and setters
	public int getCurrentPrime() {
		return currentPrime;
	}

	public void setCurrentPrime(int currentPrime) {
		this.currentPrime = currentPrime;
	}
	
	

}
