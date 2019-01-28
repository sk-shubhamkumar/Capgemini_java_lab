package com.pirate.ques3_6;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

public class Zone {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of(str));
		
		System.out.println(zdt);
	}
}
