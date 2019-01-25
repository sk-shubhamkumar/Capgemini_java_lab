package com.pirate.ques3_2;

public class PositiveStr {
	
	public String positive(String str) {
		str = str.toLowerCase();
		char []ltr = str.toCharArray();
		
		for(int i=1; i<ltr.length; i++) {
			if(ltr[i] < ltr[i-1]) {
				return "False";
			}
		}
		
		return "True";
	}
}
