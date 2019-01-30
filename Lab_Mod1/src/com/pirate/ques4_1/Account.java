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
		balance += bal;
	}
	
	public void withdraw(double bal) {
		if(balance >= 500 && bal <= balance) {
			balance -= bal;					
		}
		else {
			System.out.println("Insufficient Balance\n");
		}
	}
	
	@Override
	public String toString() {
		return "Account No: " + accNo + "\nbalance: " + balance + "Rs.\n";
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
