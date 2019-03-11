package project.euler;

public class Problem5 {
//	2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//	What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	public static void main(String[] args) {
		int max = 20;
		//bruteForce(max);
		scalingElimination(max);
	}
	
	public static void scalingElimination(int goal) {
		//start by incrementing by factors shared between 1 and 2, then 1 and 3, cont.
		int max = 2;
		boolean resultFound = false;
		boolean incrementFound = false;
		int increment = 1;
		while(!resultFound) {
			
			
			incrementFound = false;
			int num = increment;
			while(!incrementFound) {
				incrementFound = true;
				System.out.println("attempt: " + num);
				for(int i = 1; i <= max; i++) {
					System.out.println(num + " % " + i + " == " + num%i);
					if(num % i != 0) {
						incrementFound = false;
					}
				}
				if(!incrementFound) {
					num += increment;
				}
			}
			System.out.println("smallest shared factor for " + max+": "+num);
			increment = num;
			max++; 
			if(max > goal) {
				resultFound = true;
			}
		}
	}
	
	public static void bruteForce(int max) {
		int num = max;
		boolean found = false;
		while(!found) {
			found = true;
			System.out.println("attempt: " + num);
			for(int i = 1; i <= max; i++) {
				if(num % i != 0) {
					found = false;
				}
			}
			if(!found) {
				num++;
			}
		}
		System.out.println("result: " + num);
	
	}
}
