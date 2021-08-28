import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RetrievEmployeeDao {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		// creating seession factory object
		SessionFactory factory = cfg.buildSessionFactory();
		// creating session object
		Session session = factory.openSession();
		// creating transaction object
	//	Transaction t = session.beginTransaction();
		
		Employee employee = (Employee)session.load(Employee.class,1);//this getting the record
		System.out.println(employee.getFirstName());
		System.out.println(employee.getLastName());
		System.out.println(employee.getId());
		
		session.close();
		
	}
}
