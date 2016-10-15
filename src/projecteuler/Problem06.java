package projecteuler;

public class Problem06 {

	public static void main(String[] args) {
		int sumofsquares = 0;
		int squareofsum = 0;
		for ( int a = 1 ; a <= 100 ; a++){
			sumofsquares += a*a;
			squareofsum += a;
			System.out.println(sumofsquares);
			System.out.println(squareofsum*squareofsum);
		}
		System.out.println(sumofsquares - squareofsum*squareofsum);
		System.out.println(sumofsquares);
		System.out.println(squareofsum*squareofsum);
	}

}
