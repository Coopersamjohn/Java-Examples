package selection_sort;

import java.util.Arrays;

public class BubbleSortDemo2 {
	public static void main(String[] args) {
		// worst case: decreasing
		int arr1[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		// best case: nondecreasing
		int arr2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// average case: mixed
		int arr3[] = { 3, 5, 7, 8, 1, 9, 4, 6, 2 };

		System.out.println("Bubble Sort: ");
		System.out.println("Worst Case: n^2 ");
		System.out.println(Arrays.toString(arr1));
		bubbleSort(arr1);
		System.out.println(Arrays.toString(arr1));

		System.out.println("Best Case: n ");
		System.out.println("Unsorted: "+Arrays.toString(arr2));
		bubbleSort(arr2);
		System.out.println("Sorted: "+Arrays.toString(arr2));
		
		System.out.println("Average Case: n^2 ");
		System.out.println("Unsorted: "+Arrays.toString(arr3));
		bubbleSort(arr3);
		System.out.println("Sorted: "+Arrays.toString(arr3));
	}

	private static void bubbleSort(int[] arr) {
		int temp = 0;
		if (arr.length > 1) {
			for (int x = 0; x < arr.length - 1; x++) {
				System.out.println("Position = "+x);
				for (int y = 0; y < arr.length - x - 1; y++) {
					
					if (arr[y] > arr[y + 1]) {
						System.out.println("Key = "+(y+1));
						temp = arr[y];
						arr[y] = arr[y + 1];
						arr[y + 1] = temp;
						
					} System.out.println("Swap larger & smaller");
					System.out.println(Arrays.toString(arr));
				}
			}
		}
	}
}
