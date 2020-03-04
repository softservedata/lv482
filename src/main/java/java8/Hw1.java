package java8;

import java.util.Random;

/**
 * 
 * Print n random numbers on console using Java 8
 * Print n random numbers on console using Java 8 in a sorted order
 *	Using Java 8 show the biggest number from n random numbers
 */



public class Hw1 {

	public static void main(String[] args) {

		Random rd = new Random();
		int n = rd.nextInt(20);
		 System.out.println("n = " + n);
		if (n <= 0) {
			throw new NullPointerException("Try again!");
		}
		
			rd.ints().limit(n).forEach(System.out::println );
		
		
		System.out.println("In sorted order");
		rd.ints().limit(n).sorted().forEach(System.out::println );
		
		System.out.println("The biggest number");
		System.out.println(rd.ints().limit(n).max());
		 
	}

}
