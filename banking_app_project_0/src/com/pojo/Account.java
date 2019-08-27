package com.pojo;

public class Account {

	private float accNum; // from database
	private float accBal;
	private float accId;
	
	public float getAccNum() {
		return accNum;
	}
	public void setAccNum(float accNum) {
		this.accNum = accNum;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	public float getAccId() {
		return accId;
	}
	public void setAccId(float accId) {
		this.accId = accId;
	}
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accBal=" + accBal + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(accBal);
		result = prime * result + Float.floatToIntBits(accNum);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Float.floatToIntBits(accBal) != Float.floatToIntBits(other.accBal))
			return false;
		if (Float.floatToIntBits(accNum) != Float.floatToIntBits(other.accNum))
			return false;
		return true;
	}
	public Account(float accNum, float accBal) {
		super();
		this.accNum = accNum;
		this.accBal = accBal;
	}
	
	
	
}
