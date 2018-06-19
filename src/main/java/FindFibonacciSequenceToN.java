package main.java;

public class FindFibonacciSequenceToN {

	public static void main(String[] args) {

		try {
			
			int n = Integer.parseInt(args[0]);
			
			int firstSequenceNumber = 0;
			int secondSequenceNumber = 1;
			
			if (n == 0) {
				System.out.print(firstSequenceNumber);
			} else {
				
				System.out.print(firstSequenceNumber + " " + secondSequenceNumber);
				
				int currentNumber = secondSequenceNumber;
				int previousNumber = firstSequenceNumber;
				
				for (int i = 1; i < n; i++) {
					int newNumber = currentNumber + previousNumber;
					
					System.out.print(" " + newNumber);
					
					previousNumber = currentNumber;
					currentNumber = newNumber;
				}
			}
			
			
			
			
		} catch (NumberFormatException e) {
			System.out.print("argument is not a number\n");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("no arguments given\n");
		} 

	}

}
