package question1;

public class BubbleSortMain {

	public static void main(String[] args) {
		
		int arr[]= {1,0,5,6,3,2,3,7,9,8,4};

		// constructor
		BubbleSort bs=new BubbleSort();
		// call method on arr
		bs.bubbleSort(arr);
		
		// to print out the sorted array
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j]);
		}
	}

}
