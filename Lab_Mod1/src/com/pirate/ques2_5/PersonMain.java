package com.pirate.ques2_5;

import com.pirate.ques2_5.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char gender = args[0].charAt(0);

		Person p = new Person("Divya","Bharathi",gender);
		
		if(gender == 'M') {
			p.setGender(Gender.M);
		}
		else if(gender == 'F') {
			p.setGender(Gender.F);
		}
		System.out.println("Personal Details: \n_____________________\n");
		System.out.println("First Name: "+ p.getFirstName());
		System.out.println("Last Name: "+p.getLastName());
		System.out.println("Gender: "+ p.getGender());
	}

}
