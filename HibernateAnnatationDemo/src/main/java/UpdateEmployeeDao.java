import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class UpdateEmployeeDao {

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
		
		Employee employee = (Employee)session.get(Employee.class,102);//this getting the record
		employee.setFirstName("Dhatrika");
		employee.setLastName("Sai");
		
		session.update(employee);
		
		t.commit();
		session.close();
		System.out.println("Employee updated....");
		
		
	}
}
