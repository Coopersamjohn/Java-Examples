package demo;

import java.util.Scanner;

public class ReaderNewStyle {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter your name");
			String name=sc.nextLine();
			System.out.println("Enter your age");
			int age=sc.nextInt();
			System.out.println("Enter your phone number");
			float phone=sc.nextFloat();
			System.out.println("Enter your desired salary");
			double salary=sc.nextDouble();
			
			System.out.println("Enter Gender");
			char gender=sc.next().charAt(0);
			
			System.out.println("Name : "+name);
			System.out.println("Age : "+age);
			System.out.println("Phone : "+phone);
			System.out.println("Salary : "+salary);
			System.out.println("Gender :"+gender);
		} finally {
			sc.close();
		}

	}

}
