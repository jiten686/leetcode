package ads.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 45, 20, 12, 65, 24, 30 };
		System.out.println("Before Sorting : " + Arrays.toString(arr));
		
		quickSort(arr, 0, arr.length-1);
		System.out.println("After Sorting : " + Arrays.toString(arr));
        
	}
	
	
	public static void quickSort(int[] arr, int startPos, int endPos) {
		int countElement = endPos - startPos + 1;
		if (countElement <= 1)
			return;

		int leftPos = startPos + 1;
		int rightPos = endPos;
		int pivotPos = startPos;
		
		while (leftPos <= rightPos) {
			while (leftPos <= rightPos && arr[leftPos] < arr[pivotPos])
				++leftPos;
			while(arr[rightPos]>arr[pivotPos])
				--rightPos;
			if(leftPos>rightPos) 
				break;
			
			//Swap the leftPos and rightPos element
			int temp=arr[leftPos];
			arr[leftPos]=arr[rightPos];
			arr[rightPos]=temp;
		}
		
		int temp=arr[rightPos];
		arr[rightPos]=arr[pivotPos];
		arr[pivotPos]=temp;
		
		quickSort(arr, startPos, rightPos-1);
		quickSort(arr, rightPos+1, endPos);
	}
	
}
