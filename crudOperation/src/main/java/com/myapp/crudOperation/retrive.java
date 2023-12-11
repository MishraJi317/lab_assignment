package com.myapp.crudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.myapp.insert.person;
import com.myapp.utility.HibernateUtil;

public class retrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			person per = ses.get(person.class,1);
			
			
			System.out.println("Data for person with id 1 is : "+per.toString());
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
