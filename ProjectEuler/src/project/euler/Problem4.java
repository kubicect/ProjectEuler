package project.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
//	A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//			Find the largest palindrome made from the product of two 3-digit numbers.
	public static void main(String[] args) {
		
		
		int largest = 0;
		for(int i = 100; i < 1000; i++) {
			for(int j = 100; j < 1000; j++) {
				if(isPalindrome(i*j)) {
					
					if(largest < i*j) {
						largest = i*j;
					}
				}
			}
		}
		System.out.println(largest);
	}
	
	public static boolean isPalindrome(long n) {
		//break down number into a list of its digits
		List<Long> numbers = new ArrayList<Long>();
		double number = n;
		while(number > 1) {
			numbers.add(0, (long) (number%10));
			number = number/10;
		
		}

		//System.out.println(numbers);
		for(int i = 0; i < numbers.size()/2; i++) {
			long front = numbers.get(i);
			long back = numbers.get(numbers.size()-1 - i);
			if (front != back) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome2(long n) {
		long reverse = 0;
		long number = n;
		while(number > 1) {
			reverse = reverse * 10;
			reverse += number % 10;
			number = number/10;
		}
		if(reverse == n) {
			return true;
		} else {
			return false;
		}
	}
}
