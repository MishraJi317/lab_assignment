package com.myapp.crudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.myapp.insert.person;
import com.myapp.utility.HibernateUtil;

public class UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		
		try
		{

			ses.beginTransaction();
			person newperson = new person(7,"Abhi","miraroad",35);
			
		    
			ses.saveOrUpdate(newperson);
			ses.getTransaction().commit();
			
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
