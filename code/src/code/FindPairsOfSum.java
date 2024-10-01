package code;

import java.util.ArrayList;
import java.util.List;

public class FindPairsOfSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 7, 9, 5, 3, 4, 5 };
		int sum = 10;

		findPairs(arr, sum);

	}

	private static void findPairs(int[] arr, int sum) {

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int ele = sum - arr[i];
			if (list.contains(ele)) {
				System.out.println(arr[i] + "," + ele);
			} else {
				list.add(arr[i]);
			}
		}
	}

}
