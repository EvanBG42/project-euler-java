/*
 * Problem 6:
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
package problems1to50;

public class Problem6 {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSums = 0;
		
		for (int i = 1; i <= 100; i++){
			sumOfSquares += (i*i);
			squareOfSums += i;
		}
		
		squareOfSums = (squareOfSums * squareOfSums);
		
		//int diff = sumOfSquares - squareOfSums;
		int diff = squareOfSums - sumOfSquares;
		
		System.out.println(diff);
	}

}
