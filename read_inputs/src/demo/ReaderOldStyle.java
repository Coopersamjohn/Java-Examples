package demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderOldStyle {

	public static void main(String[] args) throws IOException{
		
		//Buffered Image reader
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name");
		String s=br.readLine();
		
		System.out.println("Enter your age:");
		int age=Integer.parseInt(br.readLine());
		
		System.out.println("Enter your current salary");
		double salary=Double.parseDouble(br.readLine());
		
		System.out.println("Enter your fucking phone number");
		long phone=Long.parseLong(br.readLine());
		
		System.out.println("Enter gender (m/f)");
		char gender=br.readLine().charAt(0);
		
		System.out.println("Hello "+ s);
		System.out.println("Age = "+ age);
		System.out.println("Salary = "+ salary);
		System.out.println("Phone: "+ phone);
		System.out.println("Gender: "+ gender);
	}

}
