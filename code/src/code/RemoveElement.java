package code;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int [] nums = {2,2,3,3,4};
		System.out.println(removeElement(nums,3));
		System.out.println(Arrays.toString(nums));

	}

	private static int removeElement(int[] nums, int val) {
		int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

	}

}
