package com.ashish.newApp.App;

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
   		
   		
       Song obj = new Song();
       
       obj.setId(1);
       obj.setSongName("Bulleya");
       obj.setSinger("Pappon");
       
       session.save(obj);
		tx.commit();
		session.close();
    }
}
