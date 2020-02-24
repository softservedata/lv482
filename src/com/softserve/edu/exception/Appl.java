package com.softserve.edu.exception;

public class Appl {
	public final int A = 1111;
	
	public int m1(int k) throws InterruptedException {
//		try {
			Thread.sleep(100);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		if (k == 2) {
			throw new RuntimeException("Ha-Ha-Ha");
		}
		int[] arr = { 11, 12 };
		int result = -1;
		try {
			result = arr[k] / k;
		} catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("ArrayIndexOutOfBoundsException | ArithmeticException found");
			System.out.println(e.toString());
			//e.printStackTrace();
		/*-
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException found");
			//System.out.println(e.toString());
			//e.printStackTrace();
		} catch(ArithmeticException e) {
			System.out.println("ArithmeticException found");
			return -2;
			//System.exit(1);
 	    */
		} catch(Exception e) {
			System.out.println("Exception found");
		} finally {
			System.out.println("finally");
		}
		return result;
	}

	public static void main(String[] args) {
		Appl appl = new Appl();
		try {
			//System.out.println("appl(1): " + appl.m1(1));
			System.out.println("appl(1): " + appl.m1(5));
			//System.out.println("appl(0): " + appl.m1(0));
			//System.out.println("appl(1): " + appl.m1(-1));
			//System.out.println("appl(1): " + appl.m1(2));
		} catch (Exception e) {
		//} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("1.0/0.0 = " + 1.0/0.0);
	}

}
