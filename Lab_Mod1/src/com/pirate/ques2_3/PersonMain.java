package com.pirate.ques2_3;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Divya","Bharathi",'F');
		
		System.out.println("Personal Details: \n_____________________\n");
		System.out.println("First Name: "+ p.getFirstName());
		System.out.println("Last Name: "+p.getLastName());
		System.out.println("Gender: "+ p.getGender());
	}

}
