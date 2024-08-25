package ads;

public class LargestSubArraySum {

	public static void main(String[] args) {
		// Kadane's Algorithm
		
		int [] arr = {20,60,-90,10,-30,40};
		
		System.out.println(maxSubArray(arr));

	}

	private static int maxSubArray(int[] arr) {
		int currSum = 0;
		int maxSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			currSum = currSum +arr[i];
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			
			if(currSum < 0) {
				currSum = 0;
			}
			
		}
		return maxSum;
	}

}
