/*
 * Problem 4:
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package problems1to50;

import java.util.Arrays;

public class Problem4 {

	public static void main(String[] args) {
		// Largest product of two 3-digit nums is 6 digits
		// 999 * 999 == 998001
		System.out.println(isNumPalindrome(1234));

	}
	
	public static boolean isNumPalindrome(int n){
		boolean palindrome = true;
		char[] nChars = Integer.toString(n).toCharArray();
		
		// Palindrome checker
		for (int i = 0; i < nChars.length; i++){
			if (nChars[i] != nChars[nChars.length - (i+1)]){
				palindrome = false;
				break;
			}
		}
		return palindrome;
	}

}
