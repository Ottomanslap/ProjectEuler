package projecteuler;

public class Problem03 {
	public static void main(String[] args) {
		long a = 600851475143L;
		long b = 775147;
		for (; b > 0 ; b--){
			if(a % b == 0)
				if(checkPrime(b)){
					System.out.print(b);
					break;
				}
		}
	}
	public static boolean checkPrime(long cprnumber){
		/*
		 * By: Sinan Vanli
		 * 
		 * checkPrime(n).method
		 * 
		 * Checks whether n is prime, returns truth value.
		 */
		boolean cprresult = false;                                                                                      // assigns variable for result
		if ( cprnumber > 1 ){                                                                                           // if asked number is applicable
			for ( long cprdivisor = 2 ; cprdivisor <= cprnumber ;){                                                     // loop until result is found
				if ( cprnumber % cprdivisor == 0){                                                                      // no remainder from division of number
					if ( cprnumber == cprdivisor ){                                                                     // number is prime
						cprresult = true;                                                                               // sets truth value as 1
						cprdivisor++;                                                                                   // ends loop
					}                                                                                                   // 
					else{                                                                                               // number is not prime
						cprresult = false;                                                                              // sets truth value as 0
						cprdivisor = cprnumber + 1 ;                                                                    // ends loop
					}}                                                                                                  // 
				else{                                                                                                   // there was remainder from division of number
					cprdivisor++;                                                                                       // next divisor
				}}                                                                                                      // 
			return cprresult;                                                                                           // return truth value
		}                                                                                                               // 
		else{                                                                                                           // if asked number is not applicable
			System.out.println("checkPrime()ERROR: Number not non-one positive integer!");                              // ERROR message
			System.out.println("checkPrime()ERROR: \"0\" will be appointed as result!");                                // ERROR message
			return false;                                                                                               // 0 return is assigned so that the code works
		}}                                                                                                              // end of method

}
