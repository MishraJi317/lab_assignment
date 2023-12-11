package com.ashish.newApp.annotExample;

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
   		
   		car1 obj = new car1();
   		
   		obj.setBrand("Toyata");
   		obj.setModel("Altas");
   		obj.setYear(2020);
   		
   		session.save(obj);
		tx.commit();
		session.close();
        
        
    }
}
