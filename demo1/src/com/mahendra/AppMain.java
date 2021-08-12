package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppMain {

	public static void main(String[] args) {
		// Load 'persistence.xml' from 'META-INF' folder and search for 'JPA-PU'
		// Everything is Case Sensitive ( foldername, filename and Unit name 'JPA-PU'
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		System.out.println("Entity Manager : "+ em);
		
		// Fetch all countries and store them in "CACHE"
		List<Country> countries = em.createQuery("from Country c").getResultList();
		
		em.clear(); // clean "cache" and remove all objects
	
		
		// Any other fetch opertions would first check the CACHE
		// But if cache is CLEANED/EMPTY, then request database
		Country my = em.find(Country.class, "IND");
		
		System.out.println("Country name : "+my.getName());
		
		em.close();
		
	}

}
