/*
 * Problem 7:
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */

// 10,001st PRIME, NOT PRIME CLOSEST TO 10,001!!!

// I present to you: the least efficient way to do this
package problems1to50;
import java.util.Arrays;

public class Problem7 {
	public static void main(String[] args) {
		// Ya boi is gonna implement the Sieve of Eratosthenes
		
		boolean primes[] = sieveOfEratosthenes(1000000);
		int numOfPrimes = 0;
		
		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == true) {
				System.out.println(i);
				numOfPrimes++;
				
				if (numOfPrimes == 10001) {
					System.out.println(i);
					break;
				}
			}
		}
	}
	
	public static boolean[] sieveOfEratosthenes(int n){
		// n + 1 to account for arrays starting at 0
		boolean[] nums = new boolean[n + 1];
		int currentNum = 2;
		
		// Set all but the zero and one element to true
		Arrays.fill(nums, true);
		nums[0] = false;
		nums[1] = false;
		
		// Just do a while loop ya doofus
		while (currentNum < (nums.length / 2)) {
			if (nums[currentNum] == false) {
				currentNum += 1;
				continue;
			}
			else {
				// i is gonna be the number to multiply currentNum by
				for (int i = 2; i < nums.length; i++) {
					if (currentNum * i > nums.length-1) {
						break;
					}
					else {
						nums[currentNum * i] = false;
					}
				}
			}
			
			currentNum += 1;
		}
		return nums;
	}
}
