package com.pirate.ques3_1;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringOp s = new StringOp();
		
		System.out.print("String: ");

		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		System.out.println("1. Add the String to itself\r\n" + 
				"2. Replace odd positions with #\r\n" + 
				"3. Remove duplicate characters in the String\r\n" + 
				"4. Change odd characters to upper case");
		
	
		int ch = scan.nextInt();
		
		switch (ch) {
			case 1: System.out.println(s.concat(str));
			break;
			
			case 2: System.out.println(s.replace(str));
			break;
			
			case 3: System.out.println(s.remove(str));
			break;
			
			case 4: System.out.println(s.upper(str));
			break;
		
		}
	}

}
