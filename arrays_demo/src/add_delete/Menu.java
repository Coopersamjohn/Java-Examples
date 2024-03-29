package add_delete;

import java.util.Scanner;

public class Menu {
	
public void printArr(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+" "+arr[i]);
		}
	};

	public static void main(String[] args) {


		int currentSize=23;
		int pos=0;
		
		
		int arr[] = {2,3,1,45,2,3,43,6,56,12,43,45,76,4,5,6,9,1,3,2,41,5,6,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		
		Scanner sc=new Scanner(System.in);
		
		//initialize choice field
		int ch=0;
		
		// Menu Start		
		do {
			System.out.println("Type your selection below:: ");
			System.out.println(" 1)  Add a number to a position in an array");
			System.out.println(" 2)  Delete a number from a position in an array");
			
			// loading user selection
			ch=sc.nextInt();			
			
			switch (ch) {
			case 1:
				System.out.println("What number would you like to add to the current array?");
				int insertNum = sc.nextInt();
				
				System.out.println("At what position (1-50) would you like to add that number?");
				pos= sc.nextInt();
				
				if (pos<=0) {
					System.out.println("Please enter a number between 1-50");
					continue;
				};
				
				for (int i=currentSize; i>pos; i--) {
					arr[i] = arr[i-1];
				};
				
				arr[pos-1] = insertNum;
				Menu m=new Menu();
				m.printArr(arr);
				currentSize++;
				
			break;
				
			case 2:
				
				System.out.println("What position (1-50) would you like to delete?");
				pos= sc.nextInt();
				
				for (int i=pos; i<currentSize; i++) {
					arr[i-1] = arr[i];
				};
				
				Menu m1=new Menu();
				m1.printArr(arr);
				currentSize--;
				
			break;
			};			
		} while (ch != 3);	
		sc.close();
	}

}
