	package code;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {3,2,7,11,6,15};
		int target = 9;
		for(int i : twoSumOptimize(nums,target)) {
			System.out.println(i);
		}
	}
	
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                return new int[]{i,j};
                }
            }
        }

        return null;
    }
    
    //2,7,11,15  // 9
    
    public static int[] twoSumOptimize(int[] nums, int target) {
    	 Map<Integer, Integer> map = new HashMap<>();
         for(int i=0; i<nums.length; i++){
             if(map.containsKey(target - nums[i])){
                 return new int[]{map.get(target - nums[i]),i};
             }
             map.put(nums[i],i);
         }
         return null;
    }

}
