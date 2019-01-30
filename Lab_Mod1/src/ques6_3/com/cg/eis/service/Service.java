package ques6_3.com.cg.eis.service;

import ques6_3.com.cg.eis.bean.Employee;

public class Service implements EmployeeService {

	public Employee getEmployeeDetails(int id, String name, double salary, String designation) {
		Employee emp = new Employee(id, name, salary, designation);
		return emp;
	}

	public void insuranceScheme(double salary, String designation, Employee emp) {
		if((salary > 5000 && salary < 20000) && designation == "System Associate") {
			emp.setInsuranceScheme("Scheme C");			
		}
		
		else if((salary>=20000 && salary<40000) && designation == "Programmer") {
			emp.setInsuranceScheme("Scheme B");
		}
	
		else if((salary>=40000) && designation == "Manager") {
			emp.setInsuranceScheme("Scheme C");
		}
		
		else if(salary < 5000 && designation == "Clerk") {
			emp.setInsuranceScheme("Scheme D");			
		}
	}

	public void displayDetails(Employee e) {
		System.out.println("Id: "+e.getId()+"\nName: "+e.getName()+"\nSalary: "+e.getSalary()+"\nDesignation: "+e.getDesignation()+"\nInsuranceScheme: "+e.getInsuranceScheme());
		
	}
}
