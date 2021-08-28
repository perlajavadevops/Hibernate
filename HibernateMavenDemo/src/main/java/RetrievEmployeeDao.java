import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class RetrievEmployeeDao {

	static SessionFactory sessionFactoryObj;

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		// creating seession factory object
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
				.build();

		// Creating Hibernate SessionFactory Instance
		sessionFactoryObj = cfg.buildSessionFactory(serviceRegistryObj);
		// SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = sessionFactoryObj.openSession();
		// creating transaction object
		// Transaction t = session.beginTransaction();

		Query query = session.createQuery("From Employee where id in (1)");
	
		List<Employee> list = query.list();
		for(Employee employee : list) {
			System.out.println(employee.getFirstName());
			System.out.println(employee.getLastName());
			System.out.println(employee.getId());
		}
		
		//Employee employee = (Employee) session.get(Employee.class, 3);// this getting the record
		

		session.close();

	}
}
