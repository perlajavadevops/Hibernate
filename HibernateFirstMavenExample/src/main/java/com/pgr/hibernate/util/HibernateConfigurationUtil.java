package com.pgr.hibernate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfigurationUtil {

	public Session getSessionObject() {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		// creating seession factory object
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
				.build();

		// Creating Hibernate SessionFactory Instance
		SessionFactory sessionFactoryObj = cfg.buildSessionFactory(serviceRegistryObj);

		Session session = sessionFactoryObj.openSession();
		return session;
	}
}
