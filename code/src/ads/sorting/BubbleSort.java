package ads.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 45, 20, 12, 65, 24, 30 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		BubbleSortAsec(arr);
		System.out.println("After Sorting : " + Arrays.toString(arr));

	}

	// Move the largest number towards the end
	public static void BubbleSortAsec(int[] arr) {

		for (int element_Pos = arr.length - 1; element_Pos > 0; element_Pos--) {
			for (int i = 0; i < element_Pos; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

		}
	}

	// Move the smallest number towards the front
	public static void BubbleSortAsec2(int[] arr) {

		int element_pos = 0;

		while (element_pos < arr.length - 1) {
			for (int i = arr.length - 1; i > element_pos; i--) {
				if (arr[i] < arr[i - 1]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}

			}
			++element_pos;
		}
	}

	// Move the Largest number towards the front
	public static void BubbleSortDesc(int[] arr) {
		int element_pos = 0;

		while (element_pos < arr.length - 1) {
			for (int i = arr.length - 1; i > element_pos; i--) {
				if (arr[i] > arr[i - 1]) {
					int temp = arr[i];
					arr[i] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
			++element_pos;
		}
	}

	// Move the Smallest number towards the end
	public static void BubbleSortDesc2(int[] arr) {
		int element_Pos = arr.length - 1;

		while (element_Pos > 0) {
			for (int i = 0; i < element_Pos; i++) {
				if (arr[i] < arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}

			--element_Pos;
		}
	}

}
