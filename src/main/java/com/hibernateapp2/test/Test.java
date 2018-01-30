package com.hibernateapp2.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernateapp2.model.EmployeeBean;

public class Test {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();// Activates Hibernate

		cfg = cfg.configure();//
		

		SessionFactory sessionFactory = cfg.buildSessionFactory();
		
		System.out.println(sessionFactory.getClass().getName());

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		EmployeeBean employeeBean = new EmployeeBean();

		employeeBean.setEid(8);
		employeeBean.setEname("Ross");
		employeeBean.setEsal(300.00f);
		
		int id  = (Integer)session.save(employeeBean);//insert query
		
		System.out.println("Identity value---"+id);

		tx.commit();

		session.close();
		sessionFactory.close();

	}

}
