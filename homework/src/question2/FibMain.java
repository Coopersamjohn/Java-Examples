package question2;

public class FibMain {

	public static void main(String[] args) {
		
		int arr[]=new int[25];
		
		arr[0]=0;
		arr[1]=1;
		
		Fibbonachi25 fb=new Fibbonachi25();
		fb.fib(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
