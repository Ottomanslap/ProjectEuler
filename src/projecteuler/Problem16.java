package projecteuler;

import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args){
		BigInteger number = new BigInteger("2");
		number = number.pow(1000);
		int sum = 0;
		for ( int x = 0 ; x < number.toString().length() ; x++ ){
			sum += Character.getNumericValue(number.toString().charAt(x));
		}
		System.out.println(sum);
	}

}
