/*
 * Problem 4:
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */

package problems1to50;

public class Problem4 {

	public static void main(String[] args) {
		// Largest product of two 3-digit nums is 6 digits
		// 999 * 999 == 998001
		System.out.println(isNumPalindrome(3002));

	}
	
	public static boolean isNumPalindrome(int n){
		boolean palindrome = true;
		String nStr = Integer.toString(n);
		
		// FIXME: palindrome checker
		for (int i = nStr.length()-1; i <= 0; i--){
			if (nStr.charAt(i) != nStr.charAt(i - nStr.length())){
				palindrome = false;
			}
		}
		return palindrome;
	}

}
