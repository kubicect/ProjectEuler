package project.euler;

public class Problem3 {
//	The prime factors of 13195 are 5, 7, 13 and 29.
//
//	What is the largest prime factor of the number 600851475143 ?
	public static void main(String[] args) {
		long num = 600851475143l;
		boolean isPrime;
		for (long i = 1; i < num; i++) {
			isPrime = true;
			//is a factor
			if(num % i == 0) {
				for(long j = 2; j < i; j++) {
					if(i % j == 0) {
						
						isPrime = false;
					}
				}
				if(isPrime) {
					System.out.println(i);
				}
			}
		}
	}
}
