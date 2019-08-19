package examples;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		int arr[]={123,124,125,126,44,55,66,33};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"]="+arr[i]);
		}
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int ar2[]=new int[size];
		System.out.println("Enter "+size+" no of element/s");
		for (int i = 0; i < ar2.length; i++) {
			ar2[i]=sc.nextInt();
		}
		System.out.println("The elements which you entered are ");
		for (int i = 0; i < ar2.length; i++) {
			System.out.print(ar2[i] + " ");
		}
	}

}
