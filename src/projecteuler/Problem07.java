package projecteuler;

public class Problem07 {

	public static void main(String[] args) {
		System.out.print(primeNumberFinder(10001));
	}

	public static long primeNumberFinder(long prnfnumber){
	/* 
	 * By: Sinan Vanli
	 * 
	 * prime(n).method
	 * 
	 * Finds the nth prime number.
	 */
	if(prnfnumber >= 1){                                                                                            // if asked order# is applicable
		long prnforder = 0;                                                                                         // sets current order#
		long prnfcandidate = 2;                                                                                     // sets first candidate# to be tried
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
