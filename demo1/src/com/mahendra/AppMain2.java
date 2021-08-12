package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AppMain2 {

	public static void main(String[] args) {
		// Load 'persistence.xml' from 'META-INF' folder and search for 'JPA-PU'
		// Everything is Case Sensitive ( foldername, filename and Unit name 'JPA-PU'
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		System.out.println("Entity Manager : "+ em);

		EntityTransaction tn = em.getTransaction();
		Country cn = null;
		try {
			tn.begin();
			cn = em.find(Country.class, "IND");
			cn.setName("India");
			
			//em.merge(cn); // Supposed to UPDATE record		
			tn.commit(); // All changes are actually made ....here...
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		em.close();
		
		cn.setName("Republic of India");
		//Next persistent context ( another new em object )
		em = factory.createEntityManager();
		try {
			EntityTransaction tn1 = em.getTransaction();
			tn1.begin();
			em.merge(cn);
			tn1.commit();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		em.close();

		
	}

}
