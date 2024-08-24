package ArrayString;

public class JumpGame {

	// 2, 3, 1, 1, 4
	// 0 1 2 3 4

	public static void main(String[] args) {

		int[] nums = { 2, 3, 1, 1, 4};

		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {

		if (nums.length == 0 || nums[0] == 0) {
			return false;
		}

		int reachable = 0;

		for (int i = 0; i < nums.length; i++) {

			if (i > reachable) {
				return false;
			}

			if (i + nums[i] > reachable)
				reachable = i + nums[i];

		}

		return true;

	}

}
