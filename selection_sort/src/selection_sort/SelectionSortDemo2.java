package selection_sort;

import java.util.Arrays;

public class SelectionSortDemo2 {

	public static void main(String[] args) {
		// worst case: decreasing
		int arr1[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		// best case: nondecreasing
		 int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// average case: mixed
		int arr3[] = { 3, 5, 7, 8, 1, 9, 4, 6, 2 };

		System.out.println("Selection Sort: ");
		System.out.println("Worst Case: n^2 ");
		System.out.println("Unsorted: "+Arrays.toString(arr1));
		selectionSort(arr1);
		System.out.println("Sorted: "+Arrays.toString(arr1));
		System.out.println();
		
		System.out.println("Best Case: n^2");
		System.out.println("Unsorted: "+Arrays.toString(arr2));
		selectionSort(arr2);
		System.out.println("Sorted: "+Arrays.toString(arr2));
		System.out.println();
		
		System.out.println("Mixed Case: n^2");
		System.out.println("Unsorted: "+Arrays.toString(arr3));
		selectionSort(arr3);
		System.out.println("Sorted: "+Arrays.toString(arr3));

	}

	/*
	 * public static void printArray(int arr[]) {
	 * System.out.println("Here is your array:: "); for (int i = 0; i < arr.length;
	 * i++) {
	 * 
	 * System.out.print(arr[i] + ", "); if (i == arr.length) {
	 * System.out.print(arr[i] + " "); } } System.out.println(" "); }
	 */

	public static void selectionSort(int arr[]) {
		// selection sort
		for (int i = 0; i < (arr.length - 1); i++) {
			int pos = i;
			System.out.println("Position = "+pos);
			for (int j = i + 1; j < (arr.length); j++) {
				
				System.out.println("Key = "+j);
				if (arr[j] < arr[pos]) {
					System.out.println("");
					System.out.println("arr[key] "+arr[j]+" is not larger than arr[pos] "+arr[pos]);
					
					pos = j;
					
					System.out.println("Compare Next Pair");
				}
				
			}
			System.out.println("Found the smallest one");
			int smaller = arr[pos];
			arr[pos] = arr[i];
			System.out.println("Swap");
			System.out.println("");
			arr[i] = smaller;
			System.out.println(Arrays.toString(arr));
			System.out.println("");
		}
	}

}
