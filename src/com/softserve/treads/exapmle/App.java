package com.softserve.treads.exapmle;

class MyPlus implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("+");
		}
		System.out.println("MyPlus: Thread ID = " + Thread.currentThread().getId() + "  name = " + Thread.currentThread().getName());
	}
}

class MyMinus implements Runnable {
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("-");
		}
		System.out.println("MyMinus: Thread ID = " + Thread.currentThread().getId() + "  name = " + Thread.currentThread().getName());
	}
}

public class App {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyPlus(), "NAME:Thread+");
		t1.setPriority(Thread.MIN_PRIORITY);
		// t1.setPriority((Thread.MAX_PRIORITY + Thread.MIN_PRIORITY) / 2 - 1);
		Thread t2 = new Thread(new MyMinus(), "NAME:Thread-");
		t2.setPriority(Thread.MAX_PRIORITY);
		// t1.setPriority((Thread.MAX_PRIORITY + Thread.MIN_PRIORITY) / 2 + 1);
		t1.start();
		t2.start();
	}
}
