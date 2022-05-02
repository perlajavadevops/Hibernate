package com.pgr.hibernate;

import com.pgr.hibernate.dao.EmployeeDaoImpl;
import com.pgr.hibernate.entity.Employee;

public class EmployeeMain {
	
	public static void main(String[] args) {
		EmployeeDaoImpl employeeDaoImpl = new EmployeeDaoImpl();
		//employeeDaoImpl.saveEmployee();
		Employee empl = employeeDaoImpl.getEmployee();
		System.out.println(empl.getCompanyName());
		System.out.println(empl.getId());
		System.out.println(empl.getName());
		System.out.println(empl.getSalary());
		System.out.println(empl.getAccount().getAccountId());
	}

}
