package com.pirate.ques4_1;

public class Main {

	public static void main(String[] args) {

		Account p1 = new Person(1234567,2000,"Smith",45);
		Account p2 = new Person(1234568,3000,"Kathy",57);
		
		p1.deposite(2000);
		p2.withdraw(2000);
		
		p1.deposite(2000);
		p2.withdraw(2000);
	}

}
