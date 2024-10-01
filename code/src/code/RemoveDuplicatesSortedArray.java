package code;

import java.util.Arrays;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		int[] nums = { 0, 0, 0, 1, 1, 2, 3, 4, 5 };
		// 0 1 2 3 4 _ _ _
		System.out.println(removeDuplicates(nums));
		System.out.println(Arrays.toString(nums));

	}

	private static int removeDuplicates(int[] nums) {
		int current = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 < nums.length) {
				if (nums[i] != nums[i + 1]) {
					nums[current] = nums[i];
					current++;
				}
			} else {
				nums[current] = nums[i];
				current++;
			}

		}
		return current;
	}

}
