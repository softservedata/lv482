package com.softserve.edu.java8;

interface MyAn {
	double f(double x);
}

public class AppAn {

	public static void main(String[] args) {
		/*-
		MyAn my = new MyAn() {
			@Override
			public double f(double x) {
				return x + 1;
			}
		};
		System.out.println("res = " + my.f(2));
		*/
		//
		/*-
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.print(" " + i);
				}
			}
		});
		thread1.start();
		*/
		//
		/*-
		Runnable r1 = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.print("a ");
			}
		};
		new Thread(r1).start();
		*/
		//
		new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.print("a ");
			}
		}).start();
	}
}
