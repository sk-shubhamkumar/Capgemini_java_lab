package ques5_1.com.cg.eis.pl;

import ques5_1.com.cg.eis.bean.Employee;
import ques5_1.com.cg.eis.service.Service;

public class Main {

	public static void main(String[] args) {
		Service srv = new Service();
		
		Employee emp = srv.getEmployeeDetails(1, "Shubham", 46000, "Manager");
		srv.insuranceScheme(emp.getSalary(), emp.getDesignation(), emp);
		srv.displayDetails(emp);
	}

}
