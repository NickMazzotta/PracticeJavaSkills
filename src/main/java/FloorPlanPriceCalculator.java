package main.java;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class FloorPlanPriceCalculator extends JPanel implements ActionListener {

	public static void main(String[] args) {


		createAndShowGui();

	}
	
	
	
	// methods
	public static void createAndShowGui() {
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setContentPane(new FloorPlanPriceCalculator());
		
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public FloorPlanPriceCalculator() {
		
		super();
		
		// create padding for border of frame
		Border padding = 
				BorderFactory.createEmptyBorder(100, 100, 100, 100);
		this.setBorder(padding);
		
		
		// initialize ui elements
		
		// create box layout
		Box mainVerticalBox = Box.createVerticalBox();
//		Box mainHorizontalBox = Box.createHorizontalBox();
		JPanel inputPanel = new JPanel(new GridBagLayout());
		Box labelsBox = Box.createVerticalBox();
		Box textFieldsBox = Box.createVerticalBox();
		
		// labels
		JLabel descriptionLabel = new JLabel("Enter the width "
				+ "and length and the cost per square foot");
		JLabel widthLabel = new JLabel("Width");
		JLabel heightLabel = new JLabel("Height");
		JLabel costLabel = new JLabel("Cost");
		JLabel resultLabel = new JLabel("0");
		
		// user input text fields
		JTextField widthInput = new JTextField();
		JTextField heightInput = new JTextField();
		JTextField costInput = new JTextField();
		
		// buttons
		JButton calculateButton = new JButton("Calculate");
				
		
		// organize elements
		
		// add elements to boxes
		mainVerticalBox.add(descriptionLabel);
//		mainVerticalBox.add(mainHorizontalBox);
		mainVerticalBox.add(inputPanel);
		mainVerticalBox.add(resultLabel);
		mainVerticalBox.add(calculateButton);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		
//		mainHorizontalBox.add(labelsBox);
//		mainHorizontalBox.add(textFieldsBox);
		inputPanel.add(labelsBox);
		inputPanel.add(textFieldsBox);
		
		labelsBox.add(widthLabel);
		labelsBox.add(heightLabel);
		labelsBox.add(costLabel);
		
		textFieldsBox.add(widthInput);
		textFieldsBox.add(heightInput);
		textFieldsBox.add(costInput);
		
		
		// align elements
		descriptionLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
//		mainHorizontalBox.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		inputPanel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		resultLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		calculateButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		
		// set size constraints on text fields
//		widthInput.setMaximumSize(new Dimension(Double.valueOf(20), widthInput.getPreferredSize().getHeight()));
//		heightInput.setMaximumSize(heightInput.getPreferredSize());
//		costInput.setMaximumSize(costInput.getPreferredSize());
		
		// add box to content
		this.add(mainVerticalBox, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
