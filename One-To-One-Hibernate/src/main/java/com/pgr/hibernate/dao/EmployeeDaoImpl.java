package com.pgr.hibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pgr.hibernate.entity.Account;
import com.pgr.hibernate.entity.Employee;
import com.pgr.hibernate.util.HibernateConfigurationUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void saveEmployee() {
		
		Session session = HibernateConfigurationUtil.getSessionObject();
		
		Account account = new Account();
		account.setAccountId(101);
		account.setAccountNumber("90000000000");
		account.setAccountType("Salary Account");
		account.setAddress("Bangalore");
		account.setBranch("Maratahalli");
		account.setIfscCode("AC101000");
		
		Employee employee = new Employee();
		employee.setCompanyName("Harman Connected Services");
		employee.setId(101);
		employee.setName("Dhruvika");
		employee.setSalary(20000);
		
		account.setEmployee(employee);
		employee.setAccount(account);
		
		
		Transaction tx = session.beginTransaction();
		session.save(account);
		session.save(employee);
		
		tx.commit();
		
		session.close();
		

	}
	
	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getEmployee() {
		Session session = HibernateConfigurationUtil.getSessionObject();
		Employee employee = (Employee)session.get(Employee.class, 1);
		
		return employee;
	}

	@Override
	public void deleteEmployee() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee() {
		// TODO Auto-generated method stub
		
	}

}
