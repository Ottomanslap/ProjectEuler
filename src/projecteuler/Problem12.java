package projecteuler;

import java.util.ArrayList;

public class Problem12 {
	public static Integer[] primes;
	public static void main(String[] args){
		long start = System.currentTimeMillis();
		primes = erasto();
		method();
		long end = System.currentTimeMillis();
		System.out.println(end-start);
	}
	private static void method(){
		long number = 1; // The current number that the program is evaluating
		long addition = 2; // The number that is going to be added to the current number
		
		for (int MaxNumberofFactors = 0 ; MaxNumberofFactors <= 500 ;){ 
			// The loop only has to go as long as no number with a number of factors more than 500 is found.
			int currentNumberofFactors = betterNumberOfFactors(number); // Uses the other method to find number of factors
			if (currentNumberofFactors > MaxNumberofFactors)  // If the number is greater than the older ones, 
				MaxNumberofFactors = currentNumberofFactors;  // it goes up there.
			
			number += addition; // Current number is elevated to the next triangular number appropriately:
			addition++; // Every time the number is added, it should be 1 greater.
		}
		long answer = number - (addition - 1);
		System.out.println("The number " + answer + " has more than 500 factors.");		
	}
	public static Integer[] erasto(){
		boolean[] isItComposite = new boolean[13000];
		for (int x = 2; x < 6500 ; x++){
			if (!isItComposite[x]){
				int currentMultiple = 2;
				while (currentMultiple*x < 13000){
					isItComposite[currentMultiple*x] = true;
					currentMultiple++;
				}
			}
		}
		ArrayList<Integer> primes = new ArrayList<>();
		for (int a = 0 ; a < isItComposite.length ; a++){
			if (!isItComposite[a]){
				primes.add(a);
			}
		}
		return primes.toArray(new Integer[0]);
	}
	private static int betterNumberOfFactors(long current) {
		int currentPrime = 2;
		int currentPrimeExistsNTimes = 0;
		int numFactors = 1;
		
		while (current > 1) {
			if (current % primes[currentPrime] == 0) {
				current = current / primes[currentPrime];
				currentPrimeExistsNTimes++;
				//System.out.println("Found another " + currentPrime);
			}
			
			if (current % primes[currentPrime] != 0){
				numFactors *= currentPrimeExistsNTimes + 1;
				//System.out.println("You had " + currentPrimeExistsNTimes + " " + currentPrime + "s.");
				currentPrimeExistsNTimes = 0;
				currentPrime++;
			}
		}
		
		return numFactors;
	}
	
	
	@SuppressWarnings("unused")
	private static int numberOfFactors(long current){
		int factors = 1;
		boolean integerSqrt = true;
		double sqrt = Math.sqrt(current);
		long sqrtcurrent = 1 + (long) sqrt;
		for (long divisor = 2 ; divisor < sqrtcurrent ; divisor++){
			if (current % divisor == 0){
				factors++;
				if (divisor == sqrtcurrent)
					integerSqrt = true;
				else
					integerSqrt = false;
			}
		}
		if (integerSqrt){
			//System.out.println(current + "'s number of factors is: " + ((factors*2)-1));
			return (factors*2)-1; 
		}
			
		else{
			//System.out.println(current + "'s number of factors is: " + factors*2);
			return factors*2;
		}
			
	}
}