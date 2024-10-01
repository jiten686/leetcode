package code;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindKthLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 20, 60, 50, 10, 30, 40 }; // 10 20 30 40 50 60 	4th largest => 30
		int k = 4;

		System.out.println("largest : " + findKthLargestElement(arr, k)); // 10 20 30 40 50 60 4th largest => 30
		System.out.println("smallest : " + findKthSmallestElement(arr, k)); // 10 20 30 40 50 60 4th smallest => 40

	}

	private static int findKthSmallestElement(int[] arr, int k) {
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder()); // create max heap

		for (int i = 0; i < k; i++) {
			q.add(arr[i]);
		}

		for (int j = k; j < arr.length; j++) {
			if (arr[j] < q.peek()) {
				q.poll();
				q.add(arr[j]);
			}
		}

		return q.peek();
	}

	private static int findKthLargestElement(int[] arr, int k) {

		PriorityQueue<Integer> q = new PriorityQueue<Integer>(); // create min heap

		for (int i = 0; i < k; i++) {
			q.add(arr[i]);
		}

		for (int j = k; j < arr.length; j++) {
			if (arr[j] > q.peek()) {
				q.poll();
				q.add(arr[j]);
			}
		}

		return q.peek();

	}

}
