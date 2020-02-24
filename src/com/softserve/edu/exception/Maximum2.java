package com.softserve.edu.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Maximum2 {
	
	public static double safeSqrt(double x) throws ClassNotFoundException {
		if (x < 0.0)
			throw new ClassNotFoundException();
		return Math.sqrt(x);
	}

	
	int doSomthing(int n) {
		try {
			// If n = 0, then causes ArithmeticException
			return 100 / n;
		} catch (ArithmeticException e) {
			// catch exception by class name
			System.out.println("Division by zero");
			return 0;
		}
		//return -1;
	}
	
	public static void main(String[] args) {
		try {
			safeSqrt(-2);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int x = 1, y = 1; // ???
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("x=");
			x = Integer.parseInt(br.readLine()); // =Float.parseFloat(…);
			System.out.print("y=");
			y = Integer.parseInt(br.readLine());
		} catch (Exception e) { // NumberFormatException
			System.out.println("I/O Error.");
		}
		if (x > y) {
			System.out.println("x is maximum, x=" + x);
		} else {
			System.out.println("y is maximum, y=" + y);
		}
	}
}
