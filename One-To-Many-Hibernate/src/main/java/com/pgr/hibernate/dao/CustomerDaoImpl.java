package com.pgr.hibernate.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pgr.hibernate.entity.Customer;
import com.pgr.hibernate.entity.Order;
import com.pgr.hibernate.util.HibernateConfigurationUtil;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public void saveCustomerOders() {
		Session session = HibernateConfigurationUtil.getSessionObject();
		Customer customer = new Customer();
		customer.setAddress("Bangalore");
		customer.setEmaiId("abc@gmail.com");
		customer.setName("Perla Reddy");
		customer.setPhoneNumber(890000000);
		
		Order order = new Order();
		order.setOrder_number("1000");
		order.setOrderName("Abc Order");
		order.setCustomer(customer);
		
		Order order2 = new Order();
		order2.setOrder_number("1020");
		order2.setOrderName("Phone Order");
		order2.setCustomer(customer);
		
		Set<Order> orders = new HashSet<>();
		orders.add(order);
		orders.add(order2);
		orders.add(order);
		orders.add(order);
		orders.add(order);
		
		customer.setOrders(orders);
		
		Transaction tx = session.beginTransaction();
		session.save(customer);
		
		tx.commit();
		
		session.close();
		
		
		
		
	}

	@Override
	public Customer getCustomer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*@Override
	public void save() {
		
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
*/
}
