package com.service;

public class ServiceProvider {

	public boolean isPrime(int value) {
		boolean b=false;
		int c=0;
		for (int i=1; i <=value; i++) {
			if(value%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}
	
	// is valid social security number
	public boolean isValidSocial(String s) {
		return s.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	};
	
}
