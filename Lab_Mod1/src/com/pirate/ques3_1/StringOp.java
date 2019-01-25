package com.pirate.ques3_1;

public class StringOp {

	public String concat(String str) {
		return str + str;
	}
	
	public String replace(String str) {
		char[] ltr = str.toCharArray();
		String wrd = "";
		for(int i=0;i<ltr.length;i++) {
			if(i%2!=0) {
				wrd = wrd + ltr[i];
			}
			else {
				wrd = wrd+"#";
			}
		}
		return wrd;
	}
	
	public String remove(String str) {
		String wrd = "";
		for(int i=0;i<str.length();i++) {
			if(!wrd.contains(String.valueOf(str.charAt(i)))) {
				wrd = wrd + String.valueOf(str.charAt(i));
			}
		}
		return wrd;
	}
	
	public String upper(String str) {
		char[] ltr = str.toCharArray();
		String wrd = "";
		for(int i=0;i<ltr.length;i++) {
			if(i%2!=0) {
				wrd = wrd + ltr[i];
			}
			else {
				wrd = wrd + Character.toUpperCase(ltr[i]);
			}
		}
		return wrd;
	}
}
