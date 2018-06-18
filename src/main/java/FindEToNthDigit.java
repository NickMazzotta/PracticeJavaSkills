package main.java;

import java.text.DecimalFormat;

public class FindEToNthDigit {

	public static void main(String[] args) {
		
		try {
			int places = Integer.parseInt(args[0]);
			
			String format = "0.";
			for (int i=0; i<places; i++) {
				format = format.concat("#");
			}
			
			DecimalFormat currentFormat = new DecimalFormat(format);
			String formattedNumber = currentFormat.format(Math.E);
			
			System.out.print(formattedNumber + "\n");
			
		} catch (NumberFormatException e) {
			System.out.print("argument is not a number\n");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("no arguments given\n");
		}
		
		

	}

}
