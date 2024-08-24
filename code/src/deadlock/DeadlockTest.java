package deadlock;

public class DeadlockTest {

	public static void main(String[] args) {

		System.out.println("main is started");

		String lock1 = "lock1";
		String lock2 = "lock2";

		Thread t1 = new Thread(() -> {
			synchronized (lock1) {
				try {
					Thread.sleep(1);
					synchronized (lock2) {
						System.out.println("Thread 1 is started the execution");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "thread1");

		Thread t2 = new Thread(() -> {
			synchronized (lock2) {
				try {
					Thread.sleep(1);
					synchronized (lock1) {
						System.out.println("Thread 2 is started the execution");
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "thread2");
		
		
		t1.start();
		t2.start();

	}

}
