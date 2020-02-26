package com.softserve.treads;

public class Appl {
	public static int sum = 0;
	public static Object monitor = new Object();

	// public synchronized static void go(long id) {
	public static void go(long id) {
		synchronized (monitor) {
			System.out.println("Current ID = " + id);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread ID = " + Thread.currentThread().getId());
		Runnable r1 = new Run1p();
		Thread t1 = new Thread(r1);
		Runnable r2 = new Run1m();
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		//
		while (t1.isAlive() || t2.isAlive()) {
			synchronized (monitor) {
				//monitor.notifyAll();
				System.out.print(".");
				if (t1.isAlive() || t2.isAlive()) {
					//monitor.wait();
				}
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// t1.join();
		// t2.join();
//        for (int i = 0; i < 1000; i++) {
//        	Thread.yield();
//        }
		// System.out.print("Main Thread ID = " + Thread.currentThread().getId());
		System.out.println(" Main DONE, sum=" + sum);
	}
}
