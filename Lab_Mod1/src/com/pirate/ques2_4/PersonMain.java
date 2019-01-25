package com.pirate.ques2_4;

import com.pirate.ques2_4.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mobile = args[0];

		Person p = new Person("Divya","Bharathi",'F',mobile);
		
		p.setMobile(mobile);
		
		System.out.println(p.display());
		
//		System.out.println("Personal Details: \n_____________________\n");
//		System.out.println("First Name: "+ p.getFirstName());
//		System.out.println("Last Name: "+p.getLastName());
//		System.out.println("Gender: "+ p.getGender());
//		System.out.println("Mobile: "+p.getMobile());
	}

}
