package com.countries.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.countries.entity.CountryEntity;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

	public CountryEntity findByCountryCode(String countryCode) {
	
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		Query query = entityManager
				.createQuery("Select p from CountryEntity p where p.countryCode = '" + countryCode + "'");
		CountryEntity countryEntity = (CountryEntity) query.getSingleResult();
		entityManager.close();
		return countryEntity;
	}
	
	public CountryEntity findByCountryName(String countryName) {
	
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		Query query = entityManager
				.createQuery("Select p from CountryEntity p where p.countryName = '" + countryName + "'");
		CountryEntity countryEntity = (CountryEntity) query.getSingleResult();
		entityManager.close();
		return countryEntity;
	}

	public List<CountryEntity> findCountries() {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		List<CountryEntity> countries = new ArrayList<>();
		countries = entityManager.createQuery("SELECT p FROM CountryEntity p").getResultList();
		entityManager.close();
		return countries;
	}

	
	
	
}
