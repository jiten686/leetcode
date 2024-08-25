package ads.sorting;

public class AscSortingByMergeSort {
	private int[] mergedArray;

	public void mergeSort(int[] arr) {
		mergedArray = new int[arr.length];
		MergedSort(arr, 0, arr.length - 1);

	}

	private void MergedSort(int[] arr, int startPos, int endPos) {
		int elementCount = endPos - startPos + 1;
		if (elementCount <= 1)
			return;

		int midPos = (endPos + startPos) / 2;

		MergedSort(arr, startPos, midPos);
		MergedSort(arr, midPos + 1, endPos);

		Merge(arr, startPos, midPos, midPos + 1, endPos);
	}

	private void Merge(int[] arr, int startPos1, int endPos1, int startPos2, int endPos2) {
		int i = startPos1;
		int j = startPos2;
		int k = 0;

		while (i <= endPos1 && j <= endPos2) {
			if (arr[i] < arr[j]) {
				mergedArray[k] = arr[i];
				++i;
			} else {
				mergedArray[k] = arr[j];
				++j;
			}
			++k;
		}

		while (i <= endPos1) {
			mergedArray[k] = arr[i];
			++i;
			++k;
		}

		while (j <= endPos2) {
			mergedArray[k] = arr[j];
			++j;
			++k;
		}

		i = startPos1;
		j = 0;

		while (j < k) {
			arr[i]=mergedArray[j];
			++j;
			++i;
		}
		
	}
}
