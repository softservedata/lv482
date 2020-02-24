package com.softserve.edu.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = 1, y = 1; // ???
		try {
			System.out.print("x=");
			x = Integer.parseInt(br.readLine()); // =Float.parseFloat(…);
			System.out.print("y=");
			y = Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) { // NumberFormatException
			System.out.println("NumberFormatException.");
		} catch (Exception e) { // NumberFormatException
			System.out.println("I/O Error.");
		}
		if (x > y) {
			System.out.println("x is maximum, x=" + x);
		} else {
			System.out.println("y is maximum, y=" + y);
		}
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
