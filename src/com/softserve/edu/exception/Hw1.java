package com.softserve.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidParameterException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InvalidParameterException() {
		super();
	}

	public InvalidParameterException(String message) {
		super(message);
	}

	public InvalidParameterException(String message, Exception e) {
		super(message, e);
	}

}

public class Hw1 {
	private final String EXCEPTION_MESSAGE = "Invalid Parameter(s): a = %d, b = %d";

	public int squareRectangle(int a, int b) {
		int result = 0;
		if ((a < 0) || (b < 0)) {
			throw new InvalidParameterException(String.format(EXCEPTION_MESSAGE, a, b));
		}
		result = a * b;
		return result;
	}

	public static void main(String[] args) {
		Hw1 hw = new Hw1();
		int a = 0;
		int b = 0;
		int result = 0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("a = ");
			a = sc.nextInt();
			System.out.print("b = ");
			b = sc.nextInt();
			result = hw.squareRectangle(a, b);
		} catch (InputMismatchException e) {
			System.out.println("LOG: InputMismatchException found, e:\n" + e);
			// throw new InvalidParameterException("Error");
		} catch (InvalidParameterException e) {
			System.out.println("LOG: InvalidParameterException found, e:\n" + e);
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println("LOG: Exception found, e = " + e);
		}
		System.out.println("result = " + result);
		//long res = 0x0FFFFFFFFFFFFFFFL & result;
		//System.out.println("res = " + res);
	}

}
