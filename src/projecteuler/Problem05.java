package projecteuler;

public class Problem05 {
	public static void main(String[] args) {
		int product = 1;
		for (int a = 1 ; a <= 20 ; a++){
			if ( product % a != 0){
				for (int c = 1 ; c <= a ; c++){
					if ( (product * c) % a == 0 ){
						product = product * c;
						break;
					}
				}
			}
		}
		System.out.println(product);
	}
}