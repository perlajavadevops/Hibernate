package com.pgr.hibernate.dao.impl;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pgr.hibernate.dao.CustomerDAO;
import com.pgr.hibernate.dto.Customer;
import com.pgr.hibernate.util.HibernateSessionUtil;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void saveCustomer(Customer customer) {
		
		HibernateSessionUtil sessionUtil = new HibernateSessionUtil();
		Session session = sessionUtil.getSession();
		Transaction tx = session.beginTransaction();
		session.save(customer);
		tx.commit();
		session.close();
		sessionUtil.closeSessionFactory();
	}

	@Override
	public List<Customer> getCustomerByName(String name) {
		HibernateSessionUtil sessionUtil = new HibernateSessionUtil();
		Session session = sessionUtil.getSession();
	    //TypedQuery query = (TypedQuery) session.getNamedQuery("findCustomerByName");
		Query query = session.getNamedQuery("findCustomerByName");
		query.setParameter("name", name);
		@SuppressWarnings("unchecked")
		List<Customer> list = query.list();
		session.close();
		sessionUtil.closeSessionFactory();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public long getTotalCustomersCount() {
		HibernateSessionUtil sessionUtil = new HibernateSessionUtil();
		Session session = sessionUtil.getSession();
	    //TypedQuery query = (TypedQuery) session.getNamedQuery("findCustomerByName");
		Query query = session.getNamedQuery("countTotalCustomers");
		
        List<Long> list = query.list();
        session.close();
		sessionUtil.closeSessionFactory();
        return list.get(0);
        
	}

}
