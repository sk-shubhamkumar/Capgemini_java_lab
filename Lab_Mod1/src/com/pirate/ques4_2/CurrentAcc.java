package com.pirate.ques4_2;

public class CurrentAcc extends Account{

	public CurrentAcc(long accNo, double balance) {
		super(accNo, balance);
	}
	
	private double overdraft = -5000;
	
	public void withdraw(double bal) {
		if(balance-bal >= overdraft ) {
			balance -= bal; 
			System.out.println("Current Balance: "+balance);
		}
		else {
			System.out.println("Overdraft not possible");
			System.out.println("You can withdraw only "+(balance-overdraft));
			System.out.println("Current Balance: "+balance);
		}
	}
}
