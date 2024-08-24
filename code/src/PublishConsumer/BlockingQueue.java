package PublishConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {

	private Queue<Integer> q;
	private int size;

	public BlockingQueue(int size) {
		this.q = new LinkedList<Integer>();
		this.size = size;
	}

	public boolean add(int element) {
		synchronized (q) {
			while (q.size() == size) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
 
			System.out.println("adding element : "+ element);
			q.add(element);
			q.notifyAll();
			return true;
		}
	}

	public int remove() {
		synchronized (q) {
			while (q.isEmpty()) {
				try {
					q.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			int ele = q.poll();
			q.notifyAll();
			return ele;

		}

	}
}
