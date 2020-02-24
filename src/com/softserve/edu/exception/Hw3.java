package com.softserve.edu.exception;

import java.util.Arrays;

public class Hw3 {
	private final String EXCEPTION_MESSAGE = "Invalid Parameter(s): start = %d, end = %d";
	//
	private double[] arr = { 4.0, 7.1, 1.1, 9.2, 3.4, 2.2, 7.1, 5.0 };
	
	{
		// arr = {4.0,7.1,1.1,9.2,3.4,2.2,7.1,5.0}; // ERROR
		System.out.println("Init Block1");
	}

	public Hw3() {
		System.out.println("public Hw3()");
		// arr = {4.0,7.1,1.1,9.2,3.4,2.2,7.1,5.0}; // Error
	}

	{
		System.out.println("Init Block2");
	}

	public double[] readNumber(int start, int end) {
		// throw new java.lang.UnsupportedOperationException("Not supported yet.");
		if ((start < 0) || (end > arr.length) || (start >= end)) {
			throw new IllegalArgumentException(String.format(EXCEPTION_MESSAGE, start, end));
		}
		return Arrays.copyOfRange(arr, start, end);
	}

	public static void main(String[] args) {
		Hw3 hw = new Hw3();
		// hw.arr={4.0,7.1,1.1,9.2,3.4,2.2,7.1,5.0}; // Error
		//System.out.println("res = " + Arrays.toString(hw.readNumber(1, 4)));
		//System.out.println("res = " + Arrays.toString(hw.readNumber(1, 1)));
		//System.out.println("res = " + Arrays.toString(hw.readNumber(2, 1)));
		//System.out.println("res = " + Arrays.toString(hw.readNumber(-1, 1)));
		//System.out.println("res = " + Arrays.toString(hw.readNumber(0, 1)));
		System.out.println("res = " + Arrays.toString(hw.readNumber(0, 8)));
		double[] a2 = hw.readNumber(0, 8);
		a2[0] = 1111.1;
		System.out.println("a2 = " + Arrays.toString(a2));
		System.out.println("arr = " + Arrays.toString(hw.arr));
	}
}
