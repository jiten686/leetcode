package ads.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 45, 20, 12, 65, 24, 30 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

	private static void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && key < arr[j]) {
				arr[j + 1] = arr[j];
				j--;

			}

			arr[j + 1] = key;
		}

	}

}
