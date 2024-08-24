package PublishConsumer;

import java.util.Random;

public class Test {
	
	private static volatile boolean exit = false;

	public static void main(String[] args) throws Exception { 
		
		BlockingQueue q = new BlockingQueue(5);
		
		System.out.println("Main thread start");

		Thread prod = new Thread(() -> {
			while(!exit) {
				q.add(new Random().nextInt(10));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "producer"); 
		
		Thread cons = new Thread(() -> {
			while(!exit) {
				System.out.println("Removed element : "+ q.remove());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}, "consumer"); 
		
		prod.start();
		cons.start();
		
		System.out.println("press enter to stop");
		System.in.read();
		
		exit = true;
		prod.join();
		cons.join();
		
		System.out.println("Main Thread end");
		
	}

}
