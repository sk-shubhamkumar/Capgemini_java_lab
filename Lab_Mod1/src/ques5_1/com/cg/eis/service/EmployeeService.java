package ques5_1.com.cg.eis.service;

import ques5_1.com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	Employee getEmployeeDetails(int id, String name, double salary, String designation); 
	
	void insuranceScheme(double salary, String designation, Employee emp);
	
	void displayDetails(Employee e);
}
