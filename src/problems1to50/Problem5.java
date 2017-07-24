/*
 * Problem 5:
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

package problems1to50;

public class Problem5 {

	public static void main(String[] args) {
		int num = 1;
		
		while (!checkDivisible(num)){
			num++;
		}
		
		System.out.println(num);
	}
	
	public static boolean checkDivisible(int x){
		boolean divisible = false;
		
		for (int i = 20; i > 0; i--){
			if (x % i != 0){
				divisible = false;
				break;
			}
			else {
				divisible = true;
			}
		}
		
		return divisible;
	}
}
