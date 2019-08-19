package selection_sort;

import java.util.Arrays;

public class InsertionSortDemo {
	public static void main(String[] args) {
		// worst case: decreasing
		int arr1[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		// best case: nondecreasing
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// average case: mixed
		int arr3[] = { 3, 5, 7, 8, 1, 9, 4, 6, 2 };

		System.out.println("Insertion Sort: ");
		System.out.println("Worst Case: n^2 ");
		System.out.println("Unsorted: "+Arrays.toString(arr1));
		insertionSort(arr1);
		System.out.println("Sorted: "+Arrays.toString(arr1));

		System.out.println("Best Case: n ");
		System.out.println("Unsorted: "+Arrays.toString(arr2));
		insertionSort(arr2);
		System.out.println("Sorted: "+Arrays.toString(arr2));
		
		System.out.println("Average Case: n^2 ");
		System.out.println("Unsorted: "+Arrays.toString(arr3));
		insertionSort(arr3);
		System.out.println("Sorted: "+Arrays.toString(arr3));
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int pos = i - 1;
			while (pos >= 0 && arr[pos] > key) {
				arr[pos + 1] = arr[pos];
				pos--;
			}
			arr[pos + 1] = key;
		}
	}
}
