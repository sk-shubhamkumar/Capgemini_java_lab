package com.pirate.ques2_5;

enum Gender{
	M, F;
}

public class Person {

	private String firstName;
	private String lastName;
	private Gender gender;
	
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender m) {
		this.gender = m;
	}

}
