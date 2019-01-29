package com.pirate.ques4_2;
	
public class SavingsAcc extends Account{

	final private double minBalance = 1000;
	
	public SavingsAcc(long accNo, double balance) {
		super(accNo, balance);
	}

	public void withdraw(double bal) {
		if(balance-bal >= minBalance) {
			balance -= bal;
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Insufficient Balance");
			System.out.println("You can withdraw only "+(balance-minBalance));
			System.out.println("Current Balance: "+balance);
		}
	}
}
