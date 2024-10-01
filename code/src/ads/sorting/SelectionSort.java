package ads.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 45, 20, 12, 65, 24, 30 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		
		selectionSort(arr);
		
		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

	private static void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			int minElePos = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minElePos] > arr[j]) {
					minElePos = j;

				}
			}

			int temp = arr[minElePos];
			arr[minElePos] = arr[i];
			arr[i] = temp;

		}

	}

}
