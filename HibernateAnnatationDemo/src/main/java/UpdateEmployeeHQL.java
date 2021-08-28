import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


public class UpdateEmployeeHQL {

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
	        Transaction tx=session.beginTransaction();  

/*	        Query query = session.createQuery("update Employee set first_name=:fn, last_name=:ln where id=:i");
	        query.setParameter("fn", "Perla");
	        query.setParameter("ln", "Reddy");
	        query.setParameter("i", 1);
	        
	        int status=query.executeUpdate();  
			System.out.println(status);  
			tx.commit();  
			session.close();*/

	        
	        
	       /* Query query=session.createQuery("delete from Employee where id=:i");  
	        query.setParameter("i", 1);
	        int status=q.executeUpdate();  
			System.out.println(status);  
			tx.commit();  

*/	        
	       /* Query query=session.createQuery("SELECT  MIN(salary) FROM Employee");  
	        List list = query.list();
	        
	        Iterator itr = list.iterator();
	        System.out.println("=====================");
	        while (itr.hasNext()) {
	        	System.out.println(itr.next());
			}
	        System.out.println("=====================");
	        tx.commit();  
*/	        session.close();

	        
	        
	}
}
