package projecteuler;

public class Problem01 {
	public static void main(String[] args){
		int sum = 0;
		int temp = 1;
		while ( temp < 1000 ){
			if (temp % 3 == 0)
				sum += temp;
			if (temp % 5 == 0) 
				sum += temp;
			if (temp % 15 == 0) 
				sum -= temp;
			temp++;
		}
		System.out.println(sum);
	}
}
