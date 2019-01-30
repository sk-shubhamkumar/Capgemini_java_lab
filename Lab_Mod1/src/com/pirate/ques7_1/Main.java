package com.pirate.ques7_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("num: ");
		int num = scan.nextInt();
		int []arr = new int[num];
		String str = "";
		int i;
		
		ArrayList<String> alist = new ArrayList<>();
		
		for(i=0;i<num;i++) {
			arr[i] = scan.nextInt();
		}
		
		for(int j=0;j<arr.length;j++) {
			str = Integer.toString(arr[j]);
			StringBuffer sb = new StringBuffer(str);
			sb.reverse();
			String s = sb.toString();
			alist.add(s);
		}
		Collections.sort(alist);

		String c[] = alist.toArray(new String[0]);
		for(i=0;i<c.length;i++) {
			arr[i] = Integer.parseInt(c[i]);
		}
		
		for(i=0;i<c.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
