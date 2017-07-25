/*
 * Problem 7:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
package problems1to50;
import java.util.Arrays;

public class Problem7 {
	public static void main(String[] args) {
		// Ya boi is gonna implement the Sieve of Eratosthenes
		//boolean[] nums;
		
		sieveOfEratosthenes(10001);
		
	}
	
	public static boolean[] sieveOfEratosthenes(int n){
		boolean[] nums = new boolean[n + 1];
		
		// Set all but the zero and one element to true
		Arrays.fill(nums, true);
		nums[0] = false;
		nums[1] = false;
		
		for (int i = 2; i < (10001 / 2); i++) {
			
		}
		
		return nums;
	}
}