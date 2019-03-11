package project.euler;

import java.util.ArrayList;
import java.util.List;

public class Problem7 {
//	By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//	What is the 10 001st prime number?
	
	public static void main(String[] args) {
		//brute force
		int goal = 10001;
		List<Integer> primes = new ArrayList<Integer>();
		
		int num = 2;
		while(primes.size() < goal) {
			boolean isPrime = true;
			for(int i = 2; i < num; i++) {
				if(num%i == 0) {
					isPrime = false;
				}
			}
			if(isPrime) {
				System.out.println("Add: "+num);
				primes.add(num);
			}
			num++;
		}
		System.out.println(primes.get(primes.size()-1));
		
	}
}
