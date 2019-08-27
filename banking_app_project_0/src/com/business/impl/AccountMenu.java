package com.business.impl;

import java.util.Scanner;

import com.business.AccountBusiness;
import com.pojo.Account;

public class AccountMenu {

	public void accountMenu(String user) {
		
		AccountBusiness ab = new AccountBusinessImpl();
		Scanner sc = new Scanner(System.in);

		// insert test accounts here
		// Account account=new Account();

		int menu2 = 0;

		do {
			System.out.println("----------Benjamins Bank----------");
			System.out.println("Your Login was Successful");
			System.out.println("--------------------------------------------");
			System.out.println("1) View Account");
			System.out.println("2) Deposit Funds");
			System.out.println("3) Withdraw Funds");
			System.out.println("4) Go back");
			System.out.println("");
			System.out.println("--------------------------------------------");
			System.out.println("");
			System.out.println("> ");
			System.out.println("");
			menu2=sc.nextInt();

			switch (menu2) {
			case 1:
				System.out.println("Here is your account::");
				ab.accBalance(user);

				break;
			case 2:
				System.out.println("How much will you deposit today?");
				float dp = sc.nextFloat();

				ab.deposit(user, dp);

				System.out.println(account);
				break;
			case 3:
				System.out.println("How much will you deposit today?");
				float wd = sc.nextFloat();

				ab.withdrawal(user, wd);

				System.out.println(account);
				break;
			case 4:
				break;
			}

		} while (condition);

	}

}
