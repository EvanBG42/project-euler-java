/*
 * Problem 3: 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

package problems1to50;
import java.util.*;
import java.lang.Math;

public class Problem3 {

	public static void main(String[] args) {
		// Prime factorization is tough.
		System.out.println(primeFactorize(600851475143L));

	}
	
	// Method to return prime factors
	public static ArrayList<Long> primeFactorize(long n){
		ArrayList<Long> primeFactors = new ArrayList<Long>();
		
		
		while (n % 2 == 0){
			primeFactors.add((long) 2);
			n /= 2;
		}
		
		// This bit is really interesting
		for (long i = 3; i < Math.sqrt(n); i += 2){
			if (n % i == 0){
				primeFactors.add(i);
				n /= i;
			}
		}
		
		if (n > 2) {
			primeFactors.add(n);
		}
		
		return primeFactors;
	}

}
