import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class AllEmployeesDao {

	static SessionFactory sessionFactoryObj;

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file
		// creating seession factory object
		 ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build(); 
		 
	        // Creating Hibernate SessionFactory Instance
	        sessionFactoryObj = cfg.buildSessionFactory(serviceRegistryObj);
	        
	        Session session = sessionFactoryObj.openSession();
	        
	        Query query = session.createQuery("from Employee");//select * from emp;
	        List<Employee> list = query.list();
	        
	        Iterator<Employee> itr = list.iterator();
	        System.out.println("=====================");
	        while (itr.hasNext()) {
				Employee employee = (Employee) itr.next();
				System.out.println(employee.getFirstName());
				System.out.println(employee.getLastName());
				System.out.println(employee.getId());
				
			}
	        System.out.println("=====================");
	        
	        session.close();

	}
	
}
