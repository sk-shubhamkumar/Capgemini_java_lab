package com.pirate.ques3_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {
	
	
	public static void main(String[] args) {
		
		LocalDate current = java.time.LocalDate.now();

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Date(dd/mm/yyyy): ");
		
		String input = scan.nextLine();
		
		scan.close();
		
		LocalDate inputDate = LocalDate.parse(input,formatter);

		Period period = inputDate.until(current);
		System.out.println("Duration: " + period.getDays() + " Days-" + period.getMonths() + " Months-" + period.getYears()+ " Years");

	}

}
