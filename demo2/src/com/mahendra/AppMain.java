package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppMain {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		System.out.println("Entity Manager : "+ em);

		//Master Record: When using EAGER mode, it would load "Country" object as well
		//Master Record: When using LAZY mode, it would load "Country" only when you try "getCountry"
		City city = em.find(City.class, 1024);
		em.close();
		
		//While invoking getCountry in LAZY mode, persistent-context MUST NOT BE CLOSED
		System.out.println(city.getName()+" from state: "+city.getDistrict()+" and country: "+city.getCountry().getName());
		
		
		
	}

}
