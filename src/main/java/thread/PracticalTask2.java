package thread;

public class PracticalTask2 implements Runnable {

	public String message;
	public int n;
	public int k;

	public PracticalTask2(String message, int n, int k) {
		this.message = message;
		this.n = n;
		this.k = k;
	}

	public static void main(String[] args) {
		Runnable r1 = new PracticalTask2("Hello, world", 5, 2000);
		Thread t1 = new Thread(r1);
		Runnable r2 = new PracticalTask2("Peace in the peace", 5, 3000);
		Thread t2 = new Thread(r2);
		Runnable r3 = new PracticalTask2("My name is …", 1, 0);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		try {
			t2.join();
			t3.start();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void run() {
		for (int i = 0; i < n; i++) {
			try {
				Thread.sleep(k);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(message);
		}

	}
}
