package com.countries.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;

import com.countries.entity.Country;

@Repository
public class CountryRepository {

	public String findById(long id) {

		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		Country country = entityManager.find(Country.class, id);
		entityManager.close();
		String name = country.getCountryName();
		return name;
	}

}
