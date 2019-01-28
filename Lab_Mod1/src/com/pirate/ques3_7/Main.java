package com.pirate.ques3_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String username = scan.nextLine();
		
		JobSeeker js = new JobSeeker(username);
		
		System.out.println(js.validate(username));
	}

}
