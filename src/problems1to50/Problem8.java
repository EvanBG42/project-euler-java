/**
 * The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 * [snip]
 * Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 */

package problems1to50;

import java.util.Arrays;

public class Problem8 {

	public static void main(String[] args) {
		int greatestProd = 0;
		int runningProd = 1;
		int greatestProdStartPos = 0;
		//Integer[] consecNums = new Integer[13];
		
		// What can hold a 1000 digit num?
		String bigNum = "7316717653133062491922511967442657"
				+ "4742355349194934969835203127745063262395"
				+ "78318016984801869478851843858615607891129"
				+ "49495459501737958331952853208805511125406"
				+ "98747158523863050715693290963295227443043"
				+ "55766896648950445244523161731856403098711"
				+ "12172238311362229893423380308135336276614"
				+ "28280644448664523874930358907296290491560"
				+ "44077239071381051585930796086670172427121"
				+ "88399879790879227492190169972088809377665"
				+ "72733300105336788122023542180975125454059"
				+ "47522435258490771167055601360483958644670"
				+ "63244157221553975369781797784617406495514"
				+ "92908625693219784686224828397224137565705"
				+ "60574902614079729686524145351004748216637"
				+ "04844031998900088952434506585412275886668"
				+ "81164271714799244429282308634656748139191"
				+ "23162824586178664583591245665294765456828"
				+ "48912883142607690042242190226710556263211"
				+ "11109370544217506941658960408071984038509"
				+ "62455444362981230987879927244284909188845"
				+ "80156166097919133875499200524063689912560"
				+ "71760605886116467109405077541002256983155"
				+ "20005593572972571636269561882670428252483"
				+ "600823257530420752963450";
				
				//System.out.println(bigNum);
		
		// i is starting pos for consecutive numbers
		for (int i = 0; i < bigNum.length() - 14; i++) {
			runningProd = 1;
			
			for (int n = i; n < i + 13; n++) {
				runningProd = runningProd * Integer.valueOf(bigNum.substring(n, n + 1));
				if (runningProd == 0) break;
			}
			
			if (runningProd > greatestProd) {
				greatestProd = runningProd;
				greatestProdStartPos = i;
			}
		}
		
		// I realize this variable name is way too long. Oh well.
		for (int n = greatestProdStartPos; n < greatestProdStartPos + 13; n++) {
			System.out.print(bigNum.charAt(n) + " x ");
		}
		
		System.out.print("= ");
		System.out.println(greatestProd);
		
	}

}
