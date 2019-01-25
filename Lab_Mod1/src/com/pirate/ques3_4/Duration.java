package com.pirate.ques3_4;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Duration {
	
	
	public static void main(String[] args) {
		

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Date 1(dd/mm/yyyy): ");
		String input1 = scan.nextLine();

		System.out.print("Date 2(dd/mm/yyyy): ");
		String input2 = scan.nextLine();
		
		scan.close();
		
		LocalDate inputDate1 = LocalDate.parse(input1,formatter);
		LocalDate inputDate2 = LocalDate.parse(input2,formatter);

		Period period = inputDate1.until(inputDate2);
		System.out.println("Duration: " + period.getDays() + " Days " + period.getMonths() + " Months " + period.getYears()+ " Years");

	}

}
