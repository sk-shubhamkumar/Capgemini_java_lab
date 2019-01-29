package com.pirate.ques4_2;

public class Main {

	public static void main(String[] args) {
		Account a1 = new CurrentAcc(1234567,5000);
		Account a2 = new SavingsAcc(1234568,4000);
		
		a1.withdraw(10000);
		System.out.println("\n------------------------------\n");
		a2.withdraw(5000);
	}

}
