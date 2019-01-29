package com.pirate.ques4_2;

public class Account {
	private long accNo;
	protected double balance;
	
	public Account(long accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}

	public void withdraw(double bal) {
		balance -= bal;
		System.out.println(balance);
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
