package ques6_3.com.cg.eis.pl;

import ques6_3.com.cg.eis.bean.Employee;
import ques6_3.com.cg.eis.exception.EmployeeException;
import ques6_3.com.cg.eis.service.Service;

public class Main {
	public static void validate(Employee emp) throws EmployeeException{
		if(emp.getSalary()<3000) {
			throw new EmployeeException("Salary should be more than 3000");
		}
		else {
			System.out.println("Detail: \n---------------------");
		}
	}
	
	public static void main(String[] args) {
		Service srv = new Service();
		
		Employee emp = srv.getEmployeeDetails(1, "Shubham", 30000, "Manager");
		try {
			validate(emp);
			srv.insuranceScheme(emp.getSalary(), emp.getDesignation(), emp);
			srv.displayDetails(emp);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
