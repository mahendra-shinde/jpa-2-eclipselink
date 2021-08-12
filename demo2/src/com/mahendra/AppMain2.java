package com.mahendra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AppMain2 {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		
		EntityManager em = factory.createEntityManager();
		
		System.out.println("Entity Manager : "+ em);

		List<CityDetails> cities = em.createQuery
				("select new com.mahendra.CityDetails(c.name, n.name) from City c JOIN c.country n",
				CityDetails.class).getResultList();
		
		System.out.println("Cities found: "+cities.size());
		for(CityDetails c: cities) {
			System.out.println(c.getCountry()+" "+c.getName());
		}
		
		em.close();
	}

}
