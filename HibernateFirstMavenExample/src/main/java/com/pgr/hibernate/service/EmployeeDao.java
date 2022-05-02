package com.pgr.hibernate.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pgr.hibernate.entity.Employee;
import com.pgr.hibernate.util.HibernateConfigurationUtil;

public class EmployeeDao {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setCompanyName("Capgmini");
		/*emp.setId(102);*/
		emp.setName("Sireesha");
		emp.setSalary(1000);
		
		HibernateConfigurationUtil util = new HibernateConfigurationUtil();
		
		Session session = util.getSessionObject();
		/*Transaction tx = session.beginTransaction(); //using Hql inserting 
		Query query = session.createQuery("update Employee set salary=:salary WHERE id=:id");
		query.setParameter("salary", 6000d);
		query.setParameter("id", 102);
		
		int i = query.executeUpdate();
		System.out.println(i);
		tx.commit();*/
		
		//Pagination
		Query query1 = session.createQuery("From Employee where id in (:id)");
		
		List<Integer> listOfEmpIds = new ArrayList<>();
		listOfEmpIds.add(104);
		listOfEmpIds.add(103);
		
		query1.setParameterList("id", listOfEmpIds);
		
		List<Employee> empList = query1.list();
		
		 for(Employee emp1 : empList) {
			 System.out.println(emp1);
		 }
		 
		/*query1.setFirstResult(1);
		query1.setMaxResults(3);
		List<Employee> empList = query1.list();
		
		 for(Employee emp1 : empList) {
			 System.out.println(emp1);
		 }
		*/
		
		/*Query query1 = session.createQuery("From Employee where id=:id");
		query1.setParameter("id", 103);
		List<Employee> empList = query1.list();
		
		 for(Employee emp1 : empList) {
			 System.out.println(emp1);
		 }*/
		 
		 //Query query = session.createQuery("From Employee");
		 
		 /*List<Employee> empList = query.list();
		
		 for(Employee emp1 : empList) {
			 System.out.println(emp1);
		 }*/
		//Employee emp1 = (Employee) session.load(Employee.class, 101);
		
		//emp1.setCompanyName("Google");
		//emp1.setSalary(2000);
		/*System.out.println(emp1.getCompanyName());
		System.out.prin tln(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());*/
		
		//Transaction tx = session.beginTransaction();
		//session.delete(emp1);
		//session.save(emp1);
		//session.update(emp1);
		//tx.commit();
		
		session.close();
		
		
	}
}
