package thread;

public class PracticalTask1  {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("I study Java");
		}

	}
}
