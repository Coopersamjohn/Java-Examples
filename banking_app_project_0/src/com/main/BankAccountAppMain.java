package com.main;

import java.util.Scanner;

import com.business.AccountBusiness;
import com.business.impl.AccountBusinessImpl;

public class BankAccountAppMain {

	public static void main(String[] args) {
		
		AccountBusiness ab=new AccountBusinessImpl();
		Scanner sc=new Scanner(System.in);

		// initialize choice variable
		int menu1=0;
		
		// Benjamins Bank App V2.0
		do {
			System.out.println("");
			System.out.println("");
			System.out.println(" Welcome to the Benjamins Bank App V1.0 ");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println(" What would you like to do? Enter Your Choice (1-3)");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println("1) Sign Up for an account");
			System.out.println("2) Login");
			System.out.println("3) Exit");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println("> ");
			System.out.println("");
			menu1=sc.nextInt();
			
			switch (menu1) {
			case 1: 
				System.out.println("Okay, let's get you signed up :::");
				System.out.println("----------------------------");
				System.out.println("What's your email?");
				
				String email=sc.next();
				
				System.out.println("Set your password:");
				
				String pass=sc.next();
				
				ab.createAccount(email, pass);
				
				break;
			case 2:
				System.out.println("Enter your email");
				String email = sc.next();
				System.out.println("Enter your password");
				int pass = sc.nextInt();
				
				// create login main
				accountMenu(email, pass);
				
				break;
			case 3:
				System.out.println("Thanks for using the Bank Account App V2.0");
				System.out.println("Exiting.... Done!");
				System.out.println("Please close this console window.");
				break;
			default: 
				System.out.println("Try another option");
				break;
			}
		}while(menu1 !=3);

		sc.close();

	}

}
