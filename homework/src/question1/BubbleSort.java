package question1;

public class BubbleSort {

	// create bubble sort method using public instead of static
	// to conserve memory
	public void bubbleSort(int arr[]) {
		// initialize array length
		int arrLen = arr.length;
		// temporary placeholder variable
		int x = 0;
		//select left-hand value
		for (int i = 0; i < arrLen; i++) {
			// select right-hand value
			for (int q = 1; q < (arrLen - i); q++) {
				// compare left-hand to right-hand value
				if (arr[q - 1] > arr[q]) {
					// assign larger value to placeholder
					x = arr[q - 1];
					// assign smaller value to left-hand position
					arr[q - 1] = arr[q];
					// assign larger value to right-hand position
					arr[q] = x;
				}
			}
		}
	}

}
