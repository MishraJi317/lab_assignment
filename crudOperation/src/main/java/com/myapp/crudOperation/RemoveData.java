package com.myapp.crudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.myapp.insert.person;
import com.myapp.utility.HibernateUtil;

public class RemoveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		
		try
		{

			ses.beginTransaction();
			person p1 = new person(7);
			
		    
			ses.remove(p1);
			ses.getTransaction().commit();
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
