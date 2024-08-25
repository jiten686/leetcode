package ads.sorting;

import java.util.Arrays;


public class MergeSortMainProg {

	public static void main(String[] args) {
		int[] arr = { 45, 20, 12, 65, 24, 30 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		
		AscSortingByMergeSort obj= new AscSortingByMergeSort();
		obj.mergeSort(arr);
		System.out.println("Ascending Order : " + Arrays.toString(arr));


	}

	
	

}
