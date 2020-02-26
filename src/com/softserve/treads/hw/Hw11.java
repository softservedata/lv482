package com.softserve.treads.hw;

class MyRun implements Runnable {
	private String message;

	public MyRun(String message) {
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.print(message + "  ");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(message + "_DONE  ");
	}
}

public class Hw11 {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new MyRun("Winter"));
		Thread t2 = new Thread(new MyRun("Spring"));
		Thread t3 = new Thread(new MyRun("Summer"));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		t3.start();
	}
}
