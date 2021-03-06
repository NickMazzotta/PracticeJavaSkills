package main.java;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
	
	public static void main(String[] args) {
		
		try {
			
			int n = Integer.parseInt(args[0]);
			
			for (int factor : listPrimeFactors(n)) {
				System.out.print(factor + " ");
			}
			
		} catch (NumberFormatException e) {
			System.out.print("argument is not a number\n");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.print("no arguments given\n");
		}
		
		


	}
	
//	this implementation is inspired by the algorithm given at
//	http://www.vogella.com/tutorials/JavaAlgorithmsPrimeFactorization/article.html
	public static List<Integer> listPrimeFactors(int number) {
		
		int n = number;
		List<Integer> factorsList = new ArrayList<Integer>();
		
		
		// dividing n by i in the for loop 
		// and then adding n > 1 to the list optimizes
		for (int i = 2; i <= n / i; i++) {
			while (n % i == 0) {
				factorsList.add(i);
				n /= i;
			}
		}
		
		// no need to add factor if it is 1 now
		if (n > 1) {
			factorsList.add(n);
		}
		
		return factorsList;
		
	}

}
