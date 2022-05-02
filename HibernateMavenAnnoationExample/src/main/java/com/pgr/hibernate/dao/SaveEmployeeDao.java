package com.pgr.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pgr.hibernate.entity.Employee;
import com.pgr.hibernate.util.HibernateConfigurationUtil;

public class SaveEmployeeDao {

	static SessionFactory sessionFactoryObj;

	public static void main(String[] args) {

		HibernateConfigurationUtil util = new HibernateConfigurationUtil();
		
		// creating session object
		Session session = util.getSessionObject();
		// creating transaction object
		Transaction t = session.beginTransaction();
		Employee emp = new Employee();
		emp.setCompanyName("TCS");
		/*emp.setId(102);*/
		emp.setName("Dhruvika");
		emp.setSalary(4000);
		
		session.save(emp);// persisting the object
		t.commit();// transaction is committed
		session.close();
		System.out.println("successfully saved");
	}
	
	//trasient state
	//persistence state
	//detached state

}
