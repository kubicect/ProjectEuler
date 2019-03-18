package project.euler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem8 {
//	The four adjacent digits in the 1000-digit number that have the greatest product are 9 � 9 � 8 � 9 = 5832.
//	
//	73167176531330624919225119674426574742355349194934
//	96983520312774506326239578318016984801869478851843
//	85861560789112949495459501737958331952853208805511
//	12540698747158523863050715693290963295227443043557
//	66896648950445244523161731856403098711121722383113
//	62229893423380308135336276614282806444486645238749
//	30358907296290491560440772390713810515859307960866
//	70172427121883998797908792274921901699720888093776
//	65727333001053367881220235421809751254540594752243
//	52584907711670556013604839586446706324415722155397
//	53697817977846174064955149290862569321978468622482
//	83972241375657056057490261407972968652414535100474
//	82166370484403199890008895243450658541227588666881
//	16427171479924442928230863465674813919123162824586
//	17866458359124566529476545682848912883142607690042
//	24219022671055626321111109370544217506941658960408
//	07198403850962455444362981230987879927244284909188
//	84580156166097919133875499200524063689912560717606
//	05886116467109405077541002256983155200055935729725
//	71636269561882670428252483600823257530420752963450
	
//	Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?


	public static void main(String[] args) {
		String foo = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843" +
				"85861560789112949495459501737958331952853208805511" +
				"12540698747158523863050715693290963295227443043557" +
				"66896648950445244523161731856403098711121722383113" +
				"62229893423380308135336276614282806444486645238749" +
				"30358907296290491560440772390713810515859307960866" +
				"70172427121883998797908792274921901699720888093776" +
				"65727333001053367881220235421809751254540594752243" +
				"52584907711670556013604839586446706324415722155397" +
				"53697817977846174064955149290862569321978468622482" +
				"83972241375657056057490261407972968652414535100474" +
				"82166370484403199890008895243450658541227588666881" +
				"16427171479924442928230863465674813919123162824586" +
				"17866458359124566529476545682848912883142607690042" +
				"24219022671055626321111109370544217506941658960408" +
				"07198403850962455444362981230987879927244284909188" +
				"84580156166097919133875499200524063689912560717606" +
				"05886116467109405077541002256983155200055935729725" +
				"71636269561882670428252483600823257530420752963450";
		List<Integer> result;
		result = findLargestConsecutive(4, foo);
		System.out.println(listProduct(result));
		result = findLargestConsecutive(13, foo);
		System.out.println(listProduct(result));
	}
	
	public static List<Integer> findLargestConsecutive(int n, String source) {
		List<Integer> currLargest = new ArrayList<Integer>();
		
		//grab unsorted list so it can be searched for within the source number
		List<Integer> unsorted = new ArrayList<Integer>();
		List<Integer> sortedCurr = new ArrayList<Integer>();
		
		currLargest.add(0);
		int cursor = 0;
		while(cursor+n < source.length()) {
			String currListStr = source.substring(cursor, cursor+n);
			//convert curr list to list of ints
			List<Integer> currList = new ArrayList<Integer>();
			for(int i = 0; i < currListStr.length(); i++) {
				currList.add(Integer.parseInt(""+currListStr.charAt(i)));
			}
			sortedCurr = new ArrayList<Integer>(currList);
			sortedCurr.sort((o1, o2) -> o2.compareTo(o1));
			
			if(!sortedCurr.contains(0)) {
				for(int i = 0; i < n; i++) {
					//compare curr largest list to curr list
					if(currLargest.get(i) < sortedCurr.get(i)) {
						unsorted = currList;
						currLargest = sortedCurr;
						break;
					}
				}
			}
			cursor++;
		}
		System.out.println("largest consecutive: " + unsorted);
		return unsorted;
	}
	
	public static int listProduct(List<Integer> source) {
		int result = 0;
		result += source.get(0);
		for(int i = 1; i < source.size(); i++) {
			result*=source.get(i);
		}
		return result;
	}
}
