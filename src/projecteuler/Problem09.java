package projecteuler;

public class Problem09 {

	public static void main(String[] args) {
		for (double a = 1 ; a < 500 ; a++){
			for (double b = 1 ; b < 500 ; b++){
				double c = Math.sqrt(a*a+b*b);
				if (a+b+c == 1000){
					int d = (int) (a*b*c);
					System.out.println(d);
					break;
				}
			}
		}
	}

}
