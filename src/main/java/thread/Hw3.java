package thread;

/**
 * Create a thread «one», which would start the thread «two», 
 * which has to output its number («Thread number two») 3 times and create thread «three», 
 * which would to output message «Thread number three» 5 times.
 * @author Kristina
 *
 */

public class Hw3 implements Runnable {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Hw3("one", 1), "One");
		Thread t2 = new Thread(new Hw3("two", 3), "Two");
		Thread t3 = new Thread(new Hw3("three", 5), "Three");
		try {
			t1.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		t2.start();
		
		t3.start();

	}
	public String name;
	public int count;

	public Hw3(String name, int count) {
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		for(int i = 0; i<count; i++) {
			System.out.println("Thread number " + name);
		}
		
	}

}
