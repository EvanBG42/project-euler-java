/*
 * Problem 1:
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

package problems1to50;

public class Problem1 {

	public static void main(String[] args) {
		int sum = 0;
		
		// Counting!
		for (int x = 0; x < 1000; x++){
			if (divByThree(x) || divByFive(x)){
				sum = sum + x;
			}
		}
		
		System.out.println("The sum is " + sum);
		

	}
	
	public static boolean divByThree(int divisor){
		boolean divisible = false;
		
		if (divisor % 3 == 0) divisible = true;
		
		return divisible;
	}
	
	public static boolean divByFive(int divisor){
		boolean divisible = false;
		
		if (divisor % 5 == 0) divisible = true;
		
		return divisible;
	}

}
