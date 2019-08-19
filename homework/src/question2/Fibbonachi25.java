package question2;

public class Fibbonachi25 {
	
	public void fib(int arr[]) {
		for (int i = 2; i < arr.length; i++) {
			if (i==25) {
				break;
			} else {
				arr[i] = arr[i-1] + arr[i-2];	
			}
		};
	}
}
