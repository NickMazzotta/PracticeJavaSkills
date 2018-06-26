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
import javax.swing.JTextField;
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
		
		
		// configure placement of ui elements
		
		// create box layout
		Box mainVerticalBox = Box.createVerticalBox();
		Box mainHorizontalBox = Box.createHorizontalBox();
		Box labelsBox = Box.createVerticalBox();
		Box textFieldsBox = Box.createVerticalBox();
		
		
		// add elements to boxes
		mainVerticalBox.add(descriptionLabel);
		mainVerticalBox.add(mainHorizontalBox);
		mainVerticalBox.add(resultLabel);
		mainVerticalBox.add(calculateButton);
		
		mainHorizontalBox.add(labelsBox);
		mainHorizontalBox.add(textFieldsBox);
		
		labelsBox.add(widthLabel);
		labelsBox.add(heightLabel);
		labelsBox.add(costLabel);
		
		textFieldsBox.add(widthInput);
		textFieldsBox.add(heightInput);
		textFieldsBox.add(costInput);
		
		
		// align elements
		descriptionLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		mainHorizontalBox.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		resultLabel.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		calculateButton.setAlignmentX(JComponent.CENTER_ALIGNMENT);
		
		
		// add box to content
		this.add(mainVerticalBox, BorderLayout.CENTER);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
