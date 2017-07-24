/*
 * Problem 4:
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package problems1to50;

import java.util.*;

public class Problem4 {

	public static void main(String[] args) {
		// Largest product of two 3-digit nums is 6 digits
		// 999 * 999 == 998001
		int product = 0;
		ArrayList<Integer> products = new ArrayList<Integer>();
		
		
		//System.out.println(x + " * " + y + " = " + x*y);
		
		for (int x = 999; x > 100; x--){
			for (int y = 999; y > 100; y--){
				if (isNumPalindrome(x * y)){
					//System.out.println(x * y);
					products.add(x * y);
					break;
				}
				else {
					continue;
				}
			}
		}
		
		Collections.sort(products);
		System.out.println(products.get(products.size()-1));
		

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
