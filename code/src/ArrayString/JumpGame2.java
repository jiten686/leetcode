package ArrayString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JumpGame2 {

	// 2, 3, 1, 1, 4
	// 0 1 2 3 4

	public static void main(String[] args) {

		int[] nums = { 2, 4, 1, 2, 3, 1, 1, 2 };
		System.out.println("===");
		System.out.println(Arrays.toString(nums));
		System.out.println("===");
		Arrays.stream(nums).filter(e -> e>=3).map(e -> e*2).forEach(System.out::println);
		System.out.println("===");
		System.out.println(Arrays.toString(nums));
		System.out.println("===");
		System.out.println(minNoOfJumps(nums));
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Stream<Integer> stream = numbers.stream()
		                                .filter(n -> {
		                                    System.out.println("Filtering: " + n);
		                                    return n % 2 == 0;
		                                })
		                                .map(n -> {
		                                    System.out.println("Mapping: " + n);
		                                    return n * n;
		                                });
		// No output yet, as no terminal operation is invoked

		System.out.println("stream===");
		stream.forEach(System.out::println);
		
	}

	public static int minNoOfJumps(int[] nums) {

		if (nums.length ==1) {
			return 0;
		}
		
		int lastJumpIndex=0;
		int coverage=0;
		int totalJumps=0;
		int destination=nums.length-1;
		
		for(int i=0;i<nums.length;i++) {
			
			coverage=Math.max(coverage, i+nums[i]);
			
			if(i==lastJumpIndex) {
				lastJumpIndex=coverage;
				totalJumps++;
			
			if(coverage >= destination)
				return totalJumps;
			}
			
		}
		
		return totalJumps;


	}

}
