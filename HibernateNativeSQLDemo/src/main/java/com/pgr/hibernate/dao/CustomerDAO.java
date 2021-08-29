package com.pgr.hibernate.dao;

import java.util.List;

import com.pgr.hibernate.dto.Customer;

public interface CustomerDAO {

	public abstract void saveCustomer(Customer customer);
	public abstract List<Customer> getCustomerByName(String name);
	public abstract long getTotalCustomersCount();
}
