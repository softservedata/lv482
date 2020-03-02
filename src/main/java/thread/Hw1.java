package thread;

public class Hw1 implements Runnable {
	
	public static void main(String[] args) {
		 
		Runnable r1 = new Hw1("First thread");
		Runnable r2 = new Hw1("Second thread");
		Runnable r3 = new Hw1("Third thread");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		
		try {
			//t1.join();
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}
	
	String message;
	
	public Hw1(String message) {
		this.message = message;
	}

	@Override
	public void run() {
		for(int i = 0; i <5; i++) {
			System.out.println(message);
		}
		
	}

}
