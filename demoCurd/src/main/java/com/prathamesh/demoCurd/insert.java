package com.prathamesh.demoCurd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.prathamesh.HUtil.*;
import com.prathamesh.persistant.*;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session ses = HibernateUtil.getSession();
		
		
		ses.beginTransaction();
		developer obj = new developer("Ashish");
		ses.save(obj);
		
		ses.getTransaction().commit();
		

	}

}
