package com.softserve.educonditionalStatements;

/** 
 * Homework Task 1 conditionalStatements
 * 
* read 3 float numbers and check: are they all belong to the range [-5,5];
* read 3 float numbers and write max and min of them;
*
*
*/
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		ArrayList<Float> list = new ArrayList<Float>();
		System.out.println("Enter guantity of numbers ");
		int q = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < q; i++) {
			list.add(rd.nextFloat());
		}
		int count = 0;
		for (Float current : list) {
			System.out.println(current);
			if ((current >= -5) && (current <= 5)) {
				count++;
			}
		}

		if (count == q) {
			System.out.println("All numbers belong to the range [-5,5]");
		} else {
			System.out.println("Just " + count + " numbers belong to thr range [-5,5]");
		}
		
		Float max = list.get(0);
		Float min = list.get(0);
		for  (int i = 0; i < q; i++) {
			if (max > list.get(i)) {
				max = list.get(i);
			}
			if (min < list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("Maximum " + max);
		System.out.println("Minimum " + min);

	}
}
