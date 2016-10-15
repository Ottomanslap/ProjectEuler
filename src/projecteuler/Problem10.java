package projecteuler;

public class Problem10 {

	public static void main(String[] args) {
		long lastprime = 2;
		long primeorder = 2;
		long sum = 2;
		while (lastprime < 2000000){
			lastprime = primeNumberFinder(primeorder, primeorder-2 , lastprime);
			sum += lastprime;
			primeorder++;
		}
		System.out.println(sum-lastprime);
	}


	public static long primeNumberFinder(long prnfnumber, long prnforder , long prnfcandidate){
		/* 
		 * By: Sinan Vanli
		 * 
		 * prime(n).method
		 * 
		 * Finds the nth prime number.
		 */
		if(prnfnumber >= 1){                                                                                            // if asked order# is applicable
			long prnfresult = 0;                                                                                        // assigns variable for result
			for ( long prnfdivisor = 2 ; prnfdivisor <= prnfcandidate ; ){                                              // loop until result is found
				if ( prnfcandidate % prnfdivisor == 0 ){                                                                // no remainder from division of candidate
					if ( prnfcandidate == prnfdivisor ){                                                                // candidate is prime
						prnforder++;                                                                                    // order# is increased because another prime has been found
						if ( prnforder == prnfnumber ){                                                                 // order# is the one asked for
							prnfresult = prnfcandidate ;                                                                // result is set as current candidate
							prnfdivisor++;                                                                              // loop is terminated
						}                                                                                               // 
						else{                                                                                           // order# is not the one asked for
							prnfcandidate++;                                                                            // candidate is increased to find another prime
							prnfdivisor = 2;                                                                            // divisor is set to default
						}}                                                                                              // 
					else{                                                                                               // number is not prime (divisible by other smaller number)
						prnfcandidate++;                                                                                // next candidate
						prnfdivisor = 2;                                                                                // divisor is set to default
					}}                                                                                                  // 
				else{                                                                                                   // there is remainder from division
					prnfdivisor++;                                                                                      // next divisor
				}}                                                                                                      // loop ended
			return prnfresult;                                                                                          // return with result
		}                                                                                                               // 
		else{                                                                                                           // asked order# is not applicable
			throw new IllegalArgumentException("Unaccepted number");                                                    // Error
		}}

}
