package com.pgr.hibernate;

import com.pgr.hibernate.dao.CustomerDaoImpl;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerDaoImpl impl = new CustomerDaoImpl();
		impl.saveCustomerOders();
	}
}
