package question4;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Factorial f=new Factorial();
		
		try {
			System.out.println("Enter a number you'd like to calculate the factorial of : ");
			// max 170.6024-ish
			double n=sc.nextDouble();
			
			System.out.println(f.factorial(n));
			System.out.println("Thank you for calculting a factorial to the "+n+"th degree");
			
		} finally {
			sc.close();
		}


	}

}
