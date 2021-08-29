package com.pgr.hibernate;

import java.util.List;

import com.pgr.hibernate.dao.CustomerDAO;
import com.pgr.hibernate.dao.impl.CustomerDAOImpl;
import com.pgr.hibernate.dto.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerDAO customerDAO = new CustomerDAOImpl();
		//Save Customer
		/*Customer customer = new Customer();
		customer.setName("PerlaReddy");
		customer.setAddress("Bangalore");
		customer.setEmail("perlareddyjava@gmail.com");
		customer.setPhoneNumber(8990899000L);
		
		customerDAO.saveCustomer(customer);*/
		
		//Find customer by name
		/*List<Customer> list = customerDAO.getCustomerByName("PerlaReddy");
		for(Customer customer1 : list) {
			System.out.println(customer1.getEmail());
			System.out.println(customer1.getName());
			System.out.println(customer1.getAddress());
			System.out.println(customer1.getCustomerId());
			System.out.println(customer1.getPhoneNumber());
		}*/
		
		//Count the customers
		long i = customerDAO.getTotalCustomersCount();
		System.out.println(i);
		
	}
}
