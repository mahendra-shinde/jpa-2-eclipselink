package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class AppMain3 {

	public static void main(String[] args) {
		// Load 'persistence.xml' from 'META-INF' folder and search for 'JPA-PU'
		// Everything is Case Sensitive ( foldername, filename and Unit name 'JPA-PU'
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		System.out.println("Entity Manager : "+ em);

		EntityTransaction tn = em.getTransaction();
		Country cn = new Country();
		cn.setCapital(1024);
		cn.setCode("WKD");
		cn.setCode2("WK");
		cn.setName("Kingdom of Wakanda");
		//cn was transient object
		try {
			tn.begin();
			em.persist(cn); // became persistent/managed
					
			tn.commit(); // All changes are actually made ....here...
			System.out.println("New country added !");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		em.close();
		
		}

}
