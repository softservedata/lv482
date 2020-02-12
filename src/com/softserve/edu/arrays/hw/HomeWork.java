package com.softserve.edu.arrays.hw;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		double[] arr = new double[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Input Element arr[" + i + "]= ");
			arr[i] = scanner.nextInt();
		}
		//
		int countPosition = -1;
		double elementValue = Double.NaN;
		int countPositive = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				countPositive++;
				if (countPositive == 2) {
					countPosition = i;
					elementValue = arr[i];
				}
			}
		}
		//
		System.out.println("elementValue = " + elementValue);
		System.out.println("countPosition = " + (countPosition + 1));
		//
		//double min = Double.POSITIVE_INFINITY;
		double minValue = arr[0];
		int minPosition = 0;
		for (int i = 0; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
				minPosition = i;
			}
		}
		//
		System.out.println("minValue = " + minValue);
		System.out.println("minPosition = " + minPosition);

	}
}
