package code;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MoveZeros {

	public static void main(String[] args) {
		int [] nums = {0,1,0,3,12};
		int a = 100;
		int b = 100;
		Integer i = 10;
		Integer j = 10;
		if(a==b)
			System.out.println("true");
		if(i==j)
			System.out.println("false");
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}

	private static void moveZeros(int[] nums) {
		boolean found = false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				found = true;
				break;
			}
		}
		
		if(!found)
			return;
		
		Arrays.sort(nums);
		int start = 0;
		int end = nums.length-1;
		
		reverse(start,end,nums);
		
		int index =0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				index=i;
				break;
			}
		}
		
		reverse(start,index-1,nums);
		
		
	}

	private static void reverse(int start, int end, int[] nums) {
		while(start < end) {
			int temp = nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
		
	}

}
