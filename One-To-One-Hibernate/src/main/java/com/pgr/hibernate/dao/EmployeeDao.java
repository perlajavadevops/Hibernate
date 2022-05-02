package com.pgr.hibernate.dao;

import java.util.List;

import com.pgr.hibernate.entity.Employee;

public interface EmployeeDao {
	
	public void saveEmployee();
	
	public Employee getEmployee();
	
	public void deleteEmployee();
	
	public void updateEmployee();
	
	public List<Employee> getEmployeeList();
	
	

}
