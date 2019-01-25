package com.pirate.ques3_5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ExpiryDate {
	
	
	public static void main(String[] args) {
		

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Purchase Date (dd/mm/yyyy): ");
		String input1 = scan.nextLine();

		System.out.print("Warrantee Period month and year: ");
		int mnth = scan.nextInt();
		int yr = scan.nextInt();
		
		scan.close();
		
		LocalDate inputDate1 = LocalDate.parse(input1,formatter);

		System.out.println((inputDate1.plusMonths(mnth)).plusYears(yr));
	}

}
