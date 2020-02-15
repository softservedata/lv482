package com.softserve.educonditionalStatements;

import java.util.Random;
import java.util.Scanner;

public class PracticalTask1 {
	
	/**Conditional Statements. Practical task1 
	 * 
	 * Enter three numbers. Find out how many of them are odd.
	 * @return 
	 */

	public static void main(String[] args) {
		
		System.out.println("Enter quantiti of numbers");
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int quantity = Integer.parseInt(sc.nextLine());
		int[] arr = new int[quantity];
		
		for(int i = 0 ; i<arr.length; i++ ) {
			arr[i] = rd.nextInt(1000);
		System.out.println(arr[i]);	 //check how to work random
		}
		
		int countOdd = 0;
		for(int i = 0 ; i<arr.length; i++ ) {
			if(arr[i]%2 == 1) {
				countOdd++;
			}
		}
		System.out.println("the quantity of odd numbers is " + countOdd);
		
	}

}
