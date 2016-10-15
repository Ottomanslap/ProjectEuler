package projecteuler;

import java.util.HashMap;

public class Problem14 {

	private static HashMap<Long,Long> list = new HashMap<>();

	public static void main(String[] args){
		long start = System.currentTimeMillis();
		newMethod();
		System.out.println("The first method took " + (System.currentTimeMillis()-start) + " miliseconds.");

		long start2 = System.currentTimeMillis();
		oldMethod();
		System.out.println("The second method took " + (System.currentTimeMillis()-start2) + " miliseconds.");
	}
	public static void newMethod() {
		// works but is for some weird reason slower
		list.put(1L, 1L);
		long largestCollatzNumber = 0;
		long hasLargestCollatzNumber = 0;
		for (long currentNumber = 1 ; currentNumber < 1000000 ; currentNumber++){
			long currentCollatzNumber = findCollatzHash(currentNumber);
			if (currentCollatzNumber > largestCollatzNumber){
				largestCollatzNumber = currentCollatzNumber;
				hasLargestCollatzNumber = currentNumber;
			}
		}
		System.out.println(hasLargestCollatzNumber);
	}
	private static long findCollatzHash(long currentNumber) {
		Long readyResult = list.get(currentNumber);
		if (readyResult == null){
			if (Functions.isEvenLong(currentNumber)){
				long nextCollatzNumber = 1 + findCollatzHash(currentNumber/ 2);
				list.put(currentNumber, nextCollatzNumber);
				return nextCollatzNumber;
			}
			else {
				long nextCollatzNumber = 1 + findCollatzHash(1 + (currentNumber * 3));
				list.put(currentNumber, nextCollatzNumber);
				return nextCollatzNumber;
			}
		}
		else{
			return readyResult;
		}
	}

	final static void oldMethod() {
		// works and is surprisingly faster than the other method
		long largestCollatzNumber = 0;
		long hasLargestCollatzNumber = 0;
		for (long currentNumber = 1 ; currentNumber < 1000000 ; currentNumber++){
			long currentCollatzNumber = findCollatz(currentNumber);
			if (currentCollatzNumber > largestCollatzNumber){
				largestCollatzNumber = currentCollatzNumber;
				hasLargestCollatzNumber = currentNumber;
			}
		}
		System.out.println(hasLargestCollatzNumber);
	}

	final static long findCollatz(long currentNumber) {
		//works
		long answer = 1;
		while (currentNumber > 1){
			if (Functions.isEvenLong(currentNumber)){
				currentNumber = currentNumber / 2;
				answer++;
			}
			else {
				currentNumber = (currentNumber * 3) + 1;
				answer++;
			}
		}
		return answer;
	}
}
