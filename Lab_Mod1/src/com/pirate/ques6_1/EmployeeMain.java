package com.pirate.ques6_1;

public class EmployeeMain {

	static void check(Employee emp) throws EmpException{
		if(emp.getFirstName() == null && emp.getLastName() == null) {
			throw new EmpException("Null name");
		}
		else {
			System.out.println("First Name: "+emp.getFirstName()+"\nLast Name: "+emp.getLastName()+"\nGender: "+emp.getGender());
		}
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(null, null, 'F');
		try {
			check(emp);
		} 
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
