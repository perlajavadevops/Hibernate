import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class SaveEmployee {

	static SessionFactory sessionFactoryObj;

	public static void main(String[] args) {

		// creating configuration object
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
		// creating transaction object
		Transaction t = session.beginTransaction();
		Employee e1 = new Employee();
		//e1.setId(2);
		e1.setFirstName("Siva");
		e1.setLastName("Reddy");
		session.save(e1);// persisting the object
		t.commit();// transaction is committed
		session.close();
		System.out.println("successfully saved");
	}
	
	//trasient state
	//persistence state
	//detached state

}
