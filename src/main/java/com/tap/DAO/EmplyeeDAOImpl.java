package com.tap.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.Entity.Employee;

public class EmplyeeDAOImpl implements EmployeeDAO {
	
	Session session = null;

	
	@Override
	public void addemployee(Employee e, SessionFactory sf) {
		session = sf.openSession();
    	Transaction t = session.beginTransaction();
		session.save(e);
		System.out.println("Data Inserted");
	
		t.commit();
		
		
	}
	
	
}
