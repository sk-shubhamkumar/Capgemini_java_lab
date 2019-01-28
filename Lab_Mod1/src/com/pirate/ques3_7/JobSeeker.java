package com.pirate.ques3_7;

public class JobSeeker {
	
	private String username;
	
	public JobSeeker(String username) {
		super();
		this.username = username;
	}

	public String validate(String username) {
		if(username.length()==12) {
			if(username.endsWith("_job")) {
				return "True";
			}
		}
		return "Flase";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
