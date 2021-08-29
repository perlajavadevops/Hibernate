package com.pgr.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateSessionUtil {

	static SessionFactory sessionFactoryObj;

	public Session getSession() {
		// AnnotationConfiguration cfg = new AnnotationConfiguration();
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		// creating seession factory object
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
				.build();
		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = cfg.buildSessionFactory(serviceRegistryObj);
		// creating session object
		Session session = sessionFactoryObj.openSession();
		return session;
	}
	
	public void closeSessionFactory() {
		sessionFactoryObj.close();
	}
}
