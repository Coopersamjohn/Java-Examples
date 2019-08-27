package com.business.impl;

import com.business.AccountBusiness;
import com.pojo.Account;

public class AccountBusinessImpl implements AccountBusiness {
	
	AccountBusiness ab=new AccountBusinessImpl();
	

	// This will end up being a database
	// private HashMap<String, Account> accounts=new HashMap<>();
	
	// put your test accounts here
	

	@Override
	public Account createAccount(Account acc) {
		// TODO Auto-generated method stub
		return null;
	}

	// return type: AccountMenu ???
	@Override
	public Account login(String userNameEmail) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public float accBalance(String userNameEmail) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float deposit(String userNameEmail, float deposit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float withdrawal(String userNameEmail, float withdrawal) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
