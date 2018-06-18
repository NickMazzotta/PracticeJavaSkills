package main.java;

import java.text.DecimalFormat;
import java.util.Optional;

// FINDS VALUE OF PI WITH PRECISION UP TO 15 DIGITS
public class FindPiToNthDigit {
	
	public static void main(String[] args) {
		
		// instantiate class because class methods cannot be called
		// directly from static method
		FindPiToNthDigit currentClass = new FindPiToNthDigit();
		
		if (currentClass.isInteger(args[0])) {
			int places = Integer.parseInt(args[0]);
			DecimalFormat currentFormat = currentClass.getDecimalFormat(places);
			
			System.out.print(currentFormat.format(Math.PI) + "\n");
			
		} else {
			System.out.print("argument is not a number\n");
		}
		
		
		
		// try-catch implementation
		// advantage: does not require isInteger check
		try {
			int places = Integer.parseInt(args[0]);
			
			DecimalFormat currentFormat = currentClass.getDecimalFormat(places);
			System.out.print(currentFormat.format(Math.PI)  + "\n");
			
		} catch (NumberFormatException e) {
			System.out.print("argument is not a number\n");
		}
	}
	
	
//	METHODS
	
	// returns non-optional decimal format to n places after 0.
	DecimalFormat getDecimalFormat(int n) {
		String format = "0.";
		for (int i=0; i<n; i++) {
			format = format.concat("#");
		}
		return new DecimalFormat(format);
	}
	
	// boilerplate check for is numeric
	// otherwise, use NumberUtils.isNumber method
	boolean isInteger(String s) {
		int size = s.length();
		
		for (int i=0; i < size; i++) {
			if (!Character.isDigit(s.charAt(i))) {
				return false;
			}
		}
		
		return size > 0;
	}

}
