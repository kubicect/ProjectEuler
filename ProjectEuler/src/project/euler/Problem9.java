package project.euler;

public class Problem9 {
//	A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.
	
	public static void main(String[] args) {
		int a, b;
		double c;
		for(a = 1; a < 1000; a++) {
			for(b = a+1; b < 1000; b++) {
				c = Math.sqrt((a*a) + (b*b));
				if(a + b + c == 1000) {
					System.out.println("A: " +a+ " B: " +b+ " C: "+c);
					System.out.println(a*b*c);
				}
			}
		}
	}
}
