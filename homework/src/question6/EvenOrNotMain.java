package question6;

import java.util.Scanner;

public class EvenOrNotMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
		
			System.out.println("Check if an interger is Even or Odd.");
			System.out.println("Which interger would you like to check?");
			int y=sc.nextInt();
			
			
			EvenOrNot eo=new EvenOrNot();
			System.out.println(eo.evenOrNot(y));
			System.out.println("Thanks for using Even Or Not");
		} finally {
			sc.close();
		}
		
	}

}
