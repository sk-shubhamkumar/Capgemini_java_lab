package com.pirate.ques2_4;

public class Person {

	private String firstName;
	private String lastName;
	private char gender;
	private String mobile;
	
	public Person(String firstName, String lastName, char gender, String mobile) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.mobile = mobile;
	}

	public String display() {
		return "Personal Details: \n_____________________\n" + 
				"\nFirst Name: "+ firstName + 
				"\nLast Name: "+ lastName +
				"\nGender: "+ gender +
				"\nMobile: "+ mobile;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}
