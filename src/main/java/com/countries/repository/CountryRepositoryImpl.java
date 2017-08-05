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

	public List<Object[]> findUnemploymentByYear(int year) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		List<Object[]> object = entityManager.createQuery("SELECT distinct c.countryName,u.unemployment_" + year
				+ " FROM CountryEntity c JOIN UnemploymentEntity u ON c.id = u.country ").getResultList();
		entityManager.close();
		return object;
	}

	public Double findGdpByCountryNameAndYear(String countryName, int year) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		Double gdp = (Double) entityManager.createQuery("SELECT g.gdp_" + year
				+ " FROM CountryEntity c JOIN GrosDomesticProductYearToYearEntity g ON c.id = g.country WHERE c.countryName = '"
				+ countryName + "'").getSingleResult();
		entityManager.close();
		return gdp;
	}

	@Override
	public List<Object[]> findGdpByYear(int year) {
		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("myPersistanceUnit");
		EntityManager entityManager = emFactory.createEntityManager();
		List<Object[]> object = entityManager
				.createQuery("SELECT distinct c.countryName,g.gdp_" + year
						+ " FROM CountryEntity c JOIN GrosDomesticProductYearToYearEntity g ON c.id = g.country ")
				.getResultList();
		entityManager.close();
		return object;
	}

}
