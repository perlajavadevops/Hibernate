import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class UpdateEmployeeDao {

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

		Employee employee = (Employee) session.get(Employee.class, 1);// this getting the record
		
		employee.setFirstName("Dhatrika");
		employee.setLastName("Sai");

		session.update(employee);

		t.commit();
		session.close();
		System.out.println("Employee updated....");

	}
}
