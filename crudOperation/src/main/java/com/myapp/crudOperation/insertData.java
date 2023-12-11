package com.myapp.crudOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.myapp.insert.person;
import com.myapp.utility.HibernateUtil;


public class insertData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		
		try
		{
			ses.beginTransaction();
			person obj = new person("Ashish","Miraroad",23);
			person obj2 = new person("Prathamesh","Bhayander",23);
			person obj3 = new person("Shivam","Bhayander",22);
			person obj4 = new person("Rahul","Bandra",24);
			person obj5 = new person("Aayush","Nalasopara",22);
			ses.save(obj);
			ses.save(obj2);
			ses.save(obj3);
			ses.save(obj4);
			ses.save(obj5);
			
			ses.getTransaction().commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
