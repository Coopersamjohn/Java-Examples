package mysecondjavaproject;

import java.util.Scanner;

public class SwitchTester {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Do you prefer chocolate or vanilla?");
			String icecream=sc.nextLine();
			
			byte s = 0;
			
			if (icecream == chocolate) {
				s = 1;
			} else if (icecream == vanilla) {
				s = 2;
			} else {
				System.out.println("Coloring outside the coloring book, I see");
			}
			
			switch (s) {
			case 1:
				System.out.println("You're the kind of person to rake in the dough.");
			case 2:
				System.out.println("Think of all the people");				
			}
		} finally {
			sc.close();
		}

	}

}
