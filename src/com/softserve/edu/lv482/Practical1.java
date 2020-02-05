package com.softserve.edu.lv482;

public class Practical1 {

	public static void main(String[] args) {
		System.out.println("hello");
		int[] a = { 0, 1, 2, 3, 4, 5, 50, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		//
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		System.out.println("max= " + max);
	}
}
