package com.tap.DAO;

import org.hibernate.SessionFactory;

import com.tap.Entity.Employee;

public interface EmployeeDAO {
	
	void addemployee(Employee e, SessionFactory sf); 
}
