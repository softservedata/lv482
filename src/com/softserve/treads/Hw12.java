package com.softserve.treads;

public class Hw12 {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					System.out.println("Lock first");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (second) {
						System.out.println("Lock second");
						System.out.println("Success_1 !");
						//second.notifyAll();
					}
				}
			}
		};
		//
		Thread t2 = new Thread() {
			public void run() {
				synchronized (second) {
					System.out.println("Lock second");
					try {
						Thread.sleep(10);
						second.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (first) {
						System.out.println("Lock first");
						System.out.println("Success_2 !");
					}
				}
			}
		};
		//
		t1.start();
		t2.start();
		//Thread.sleep(1000);
		t1.join();
		synchronized (second) {
			second.notifyAll();
		}
		t2.join();
		System.out.println("Main done");
	}
}
