package com.ashish.newApp.Employee;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	

    	Configuration cfg=new Configuration();
       	cfg.configure("hibernate.cfg.xml");
   		SessionFactory factory=cfg.buildSessionFactory();
   		Session session =factory.openSession();
   		Transaction tx=session.beginTransaction();
   		
   		EmpDetails obj = new EmpDetails();
   		obj.setEmpid(1);
        obj.setEmpname("Ashish");
        obj.setEmpDesignation("Developer");
        obj.setContactNumber(8828488);
   		
   		
   		session.save(obj);
		tx.commit();
		session.close();
        
    }
}
