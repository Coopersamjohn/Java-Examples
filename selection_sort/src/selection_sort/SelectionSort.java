package selection_sort;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		
		printArray(arr);

		selectionSort(arr);
		
		printArray(arr);

	}
	
	public static void printArray(int arr[]) {
		System.out.println("Here is your array:: ");
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+", ");
			if (i == arr.length) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println(" ");
	}
	
	public static void selectionSort(int arr[]) {
		// selection sort
		for (int i = 0; i < (arr.length - 1); i++) {
			int tmp = i;
			for (int j = i + 1; j < (arr.length); j++) {
				// the comparison
				if (arr[j] < arr[tmp]) {
					tmp = j;
				}
			}
			// the swap
			int smaller = arr[tmp];
			arr[tmp] = arr[i];
			arr[i] = smaller;
		}
	}

}
