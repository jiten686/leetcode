package designPattern;

import java.util.ArrayList;
import java.util.List;

public class observerPattern {

	public static void main(String[] args) {
		NotificationMgr mgr = new NotificationMgr();
		mgr.addObserver(new MessagerNotifier());
		mgr.addObserver(new emailNotifier());

		mgr.notifyAll("Amount is credited");
	}

}

interface NotificationObeserver {
	void addObserver(Notifier observer);

	void notifyAll(String msg);
}

interface Notifier {
	void sendMessage(String msg);
}

class MessagerNotifier implements Notifier {

	@Override
	public void sendMessage(String msg) {
		System.out.println("sending " + msg + " by text messager");
	}

}

class emailNotifier implements Notifier {

	@Override
	public void sendMessage(String msg) {
		System.out.println("sending " + msg + " by email messager");
	}

}

class NotificationMgr implements NotificationObeserver {

	List<Notifier> obervers = new ArrayList<Notifier>();

	@Override
	public void addObserver(Notifier observer) {
		obervers.add(observer);

	}

	@Override
	public void notifyAll(String msg) {
		for (Notifier notifier : obervers) {
			notifier.sendMessage(msg);
		}

	}

}
