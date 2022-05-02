package com.pgr.hibernate.dao;

import java.util.List;

import com.pgr.hibernate.entity.Customer;

public interface CustomerDao {
	
	public void saveCustomerOders();
	
	public Customer getCustomer();
	
	public void deleteCustomer();
	
	public void updateCustomer();
	
	public List<Customer> getCustomerList();
	
	

}
