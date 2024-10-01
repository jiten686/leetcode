package heap;

import java.util.Arrays;

public class HeapifyAndSort {

	public static void main(String[] args) {
		int[] arr = { 10, 30, 50, 20, 35, 45 };

		buildHeapMax(arr, arr.length);
		System.out.println("MaxHeap : " + Arrays.toString(arr)); // O(n)
		heapSort(arr, arr.length); // create heap and then sort
		System.out.println("SortedHeap : " + Arrays.toString(arr)); // O(n logn)

	}

	private static void heapSort(int[] arr, int n) {
		// remove the element and then swap
		for (int i = n - 1; i >= 0; i--) {
			swap(arr, i, 0);
			heapify(arr, n, 0);
		}

	}

	private static void buildHeapMax(int[] arr, int n) {

		for (int i = (n / 2) - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}

	}

	// build max heap
	private static void heapify(int[] arr, int n, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && arr[left] > arr[largest])
			largest = left;
		if (right < n && arr[right] > arr[largest])
			largest = right;

		if (largest != i) {
			swap(arr, i, largest);
			heapify(arr, n, largest);
		}

	}

	private static void swap(int[] arr, int i, int largest) {
		int temp = arr[i];
		arr[i] = arr[largest];
		arr[largest] = temp;

	}

}
