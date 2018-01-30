package com.hibernateapp2.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateapp2.model.BookBean;
import com.hibernateapp2.model.EmployeeBean;

public class Test2 {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();// Activates Hibernate

		cfg = cfg.configure();//
		

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		System.out.println(sessionFactory.getClass().getName());

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		
		BookBean bookBean = (BookBean)session.get(BookBean.class, "ff808181614033dc01614033dfa80000");
		
		
		bookBean.setBname("Java");
		

		session.update(bookBean);
		
		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
