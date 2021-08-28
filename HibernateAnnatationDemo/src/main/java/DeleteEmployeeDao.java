import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteEmployeeDao {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();
		// creating transaction object
		Transaction t = session.beginTransaction();
		
		Employee employee = (Employee)session.get(Employee.class,104);//this getting the record
		
		session.delete(employee);
		
		t.commit();
		session.close();
		
	}
}
