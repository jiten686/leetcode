	package code;

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		for(int i : twoSum(nums,target)) {
			System.out.println(i);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i=0;i<nums.length;i++){
            if((i+1<nums.length)&&(nums[i]+nums[i+1]==target)){
                output[0]=i;
                output[1]=i+1;
            }
        }

        return output;
    }

}
