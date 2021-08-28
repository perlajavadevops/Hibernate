import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DeleteEmployeeDao {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		// creating seession factory object
		ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties())
				.build();

		// Creating Hibernate SessionFactory Instance
		SessionFactory sessionFactoryObj = cfg.buildSessionFactory(serviceRegistryObj);
		// creating session object
		Session session = sessionFactoryObj.openSession();
		// creating transaction object
		Transaction t = session.beginTransaction();

		Employee employee = (Employee) session.get(Employee.class, 2);// this getting the record

		/*
		 * Employee employee = new Employee(); employee.setId(5);
		 * employee.setFirstName("Roshmi"); employee.setLastName("Rajeesh");
		 */
		
		Query query = session.createQuery("DELETE FROM Employee where id in(:ids)");
		ArrayList<Integer> empIdsList = new ArrayList<Integer>();
		empIdsList.add(1);
		empIdsList.add(2);
		
		query.setParameterList("ids", empIdsList);
		query.executeUpdate();
		//session.delete(employee);

		t.commit();
		session.close();

	}
}
