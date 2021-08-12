package com.mahendra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AppMain {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		
		EntityManager em = factory.createEntityManager();
		
		
		System.out.println("Entity Manager : "+ em);
		
		EntityTransaction tn = em.getTransaction();
		try
		{
			tn.begin();
			Account acc = new Account();
			acc.setAccHolder("Dharmendra Deol");
			acc.setBalance(20000.00);
			
			em.persist(acc);
			tn.commit();
			System.out.println("Account created!");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		em.close();
	}

}
