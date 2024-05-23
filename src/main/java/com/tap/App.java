package com.tap;

import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tap.DAO.EmplyeeDAOImpl;
import com.tap.Entity.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
    	SessionFactory sf = (SessionFactory) ac.getBean("sessionfactory");
    	EmplyeeDAOImpl edao = (EmplyeeDAOImpl) ac.getBean("edao");
    	Employee e = (Employee) ac.getBean("employee");
    	edao.addemployee(e,sf);
    	
    	
    }
}
