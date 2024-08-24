package code;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums1 = {0};
		int m=0;
		int [] nums2 = {1};
		int n=1;
		merge(nums1, m, nums2, n);
		System.out.println(Arrays.toString(nums1));
	}
	
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
        	
        	for(int j=0;j<nums2.length;j++) {
        		nums1[j] = nums2[j];
        	}
            
            return;
        }
        if (n == 0)
            return;

        int i = 0;
        while (m < nums1.length) {
        	if(i<n)
        		nums1[m] = nums2[i++];
            m++;
        }
        Arrays.sort(nums1);

    }

}
