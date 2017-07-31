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
		// boolean[] nums;
		
		sieveOfEratosthenes(10001);
		
	}
	
	public static boolean[] sieveOfEratosthenes(int n){
		// n + 1 to account for arrays starting at 0
		boolean[] nums = new boolean[n + 1];
		int numOfPrimes = 0;
		int currentNum = 2;
		int flipper;
		
		// Set all but the zero and one element to true
		Arrays.fill(nums, true);
		nums[0] = false;
		nums[1] = false;
		
		// Var for running total of primes, subtract when num is flipped in while loop
		for (boolean num: nums) {
			if (num) {
				numOfPrimes += 1;
			}
		}
		
		/*
		for (int i = 2; i < (10001 / 2); i++) {
			if (nums[i] == false) continue;
			else {
				for (int x = i; x < 10001; x=x*i) {
					
				}
			}
		}
		*/
		
		// Just do a while loop ya doofus
		while (currentNum < (10001 / 2)) {
			if (nums[currentNum] == false) {
				currentNum += 1;
				continue;
			}
			else {
				//
			}
			
			currentNum += 1;
		}
		return nums;
	}
}
