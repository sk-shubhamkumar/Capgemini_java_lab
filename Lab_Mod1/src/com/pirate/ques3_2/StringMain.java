package com.pirate.ques3_2;

import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		
		PositiveStr ps = new PositiveStr();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("String: ");
		
		String str = scan.nextLine();
		
		System.out.println(ps.positive(str));
	}

}
