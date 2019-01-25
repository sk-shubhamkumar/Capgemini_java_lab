package com.pirate.ques4_1;

public class Account {
	private long accNo;
	private double balance;
	
	public Account(long accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}

	public void deposite(double bal) {
		double newBal = 0;
		newBal += getBalance();
	}
	
	public void withdraw(double bal) {
		
	}
	
	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
