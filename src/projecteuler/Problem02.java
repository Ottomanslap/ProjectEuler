package projecteuler;

public class Problem02 {

	public static void main(String[] args) {
		int one = 1;
		int two = 1;
		int temp = 0;
		int sum = 0;
		while (two < 4000000){
			temp = one + two;
			one = two;
			two = temp;
			if (two % 2 == 0)
				sum += two;
		}
		System.out.print(sum);
	}

}
