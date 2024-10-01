package code;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindow {

	public static void main(String[] args) {
		// 0 1 2 3 4 5 6 7
		int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int k = 5;
		System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
		System.out.println(maxSlidingWindowWithPriorityQue(nums, k));
		System.out.println(Arrays.toString(maxSlidingWindowWithDeque(nums, k)));

	}

	private static int[] maxSlidingWindowWithDeque(int[] nums, int k) {
		int arraySize = nums.length - k + 1;
		int[] maxArray = new int[arraySize];
		int idx=0;
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		for(int i=0; i<k; i++) {
			while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);				
		}
		
		for(int i=k;i<nums.length;i++) {
			maxArray[idx++]=nums[deque.peekFirst()];
			
			while(!deque.isEmpty() && deque.peekFirst() <= i-k) {
				deque.removeFirst();
			}
			
			while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
				deque.removeLast();
			}
			deque.addLast(i);
		}
		
		maxArray[idx++]=nums[deque.peekFirst()];
		
		return maxArray;
	}

	private static List<Integer> maxSlidingWindowWithPriorityQue(int[] nums, int k) {
		// by default priority queue use min heap
		PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < k; i++) {
			que.add(nums[i]);
		}

		list.add(que.peek());

		que.remove(nums[0]);

		for (int i = k; i < nums.length; i++) {
			que.add(nums[i]);
			list.add(que.peek());
			que.remove(nums[i - k + 1]);
		}

		return list;

	}

	private static int[] maxSlidingWindow(int[] nums, int k) {

		int arraySize = nums.length - k + 1;

		int[] maxArray = new int[arraySize];

//		for (int i = 0; i <= nums.length - k; i++) {
//			int maxInt = Integer.MIN_VALUE;
//			for (int j = i; j < i + k; j++) {
//				if (nums[j] > maxInt)
//					maxInt = nums[j];
//			}
//
//			maxArray[i] = maxInt;
//		}

		PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
		int idx = 0;

		for (int i = 0; i < k; i++) {
			que.add(nums[i]);
		}

		maxArray[idx++] = que.peek();

		que.remove(nums[0]);

		for (int i = k; i < nums.length; i++) {
			que.add(nums[i]);
			maxArray[idx++] = que.peek();
			que.remove(nums[i - k + 1]);
		}

		return maxArray;
	}

}
