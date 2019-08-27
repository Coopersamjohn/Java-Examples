package com.business;

import com.pojo.Account;

public interface AccountBusiness {
	
	public Account createAccount(Account acc);
	
	// type: Account Menu?
	public Account login(String userNameEmail);
	
	public float accBalance(String userNameEmail);
	
	public float deposit(String userNameEmail, float deposit);
	
	public float withdrawal(String userNameEmail, float withdrawal);
	
}
