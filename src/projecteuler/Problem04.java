package projecteuler;

public class Problem04 {
	public static void main(String[] args) {
		int store = 0;
		for (int a = 999 ; a >= 100 ; a--){
			for (int b = a ; b >= 100 ; b--){
				if (checkPalindromeNumber(a*b)){
					if ( a * b > store ){
						store = a * b;
					}
				}
			}
		}
		System.out.println(store);
	}
	public static boolean checkPalindromeNumber(int a){
		String number = new Integer(a).toString();
		return (number.equals(new StringBuilder(number).reverse().toString()));
	}
}