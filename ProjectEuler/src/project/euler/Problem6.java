package project.euler;

public class Problem6 {
//	The sum of the squares of the first ten natural numbers is,
//
//	12 + 22 + ... + 102 = 385
//	The square of the sum of the first ten natural numbers is,
//
//	(1 + 2 + ... + 10)2 = 552 = 3025
//	Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
//
//	Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
	public static void main(String[] args) {
		System.out.println(sumOfSquares(10));
		System.out.println(squareOfSum(10));
		System.out.println();
		System.out.println(sumOfSquares(100));
		System.out.println(squareOfSum(100));
		System.out.println(squareOfSum(100) - sumOfSquares(100));
	}
	
	public static int sumOfSquares(int max) {
		int sum = 0;
		for(int i = 1; i <= max; i++) {
			sum += (i*i);
		}
		return sum;
	}
	
	public static int squareOfSum(int max) {
		int sum = 0;
		for(int i = 1; i <= max; i++) {
			sum += i;
		}
		return sum*sum;
	}
}
