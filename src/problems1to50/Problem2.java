/*
 * Problem 2:
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
 * find the sum of the even-valued terms.
 */

package problems1to50;

import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		int evenSum = 0;
		
		// retrieve AL of ints in Fibonnaci sequence < 4 mil.
		ArrayList<Integer> fibNums = genFibList();
		
		for (int num: fibNums){
			if (num % 2 == 0){
				evenSum += num;
			}
		}
		
		System.out.println(evenSum);
	}
	
	public static ArrayList<Integer> genFibList(){
		ArrayList<Integer> fibNums = new ArrayList<Integer>();
		int a = 0;
		int b = 1;
		int temp;
		
		while (b < 4000000){
			fibNums.add(b);
			
			temp = a + b;
			a = b;
			b = temp;
		}
		
		return fibNums;
	}

}
