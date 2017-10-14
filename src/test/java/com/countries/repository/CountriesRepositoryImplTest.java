package com.countries.repository;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.persistence.Cache;
import javax.persistence.EntityGraph;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnitUtil;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.metamodel.Metamodel;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.countries.entity.CountryEntity;
@RunWith(MockitoJUnitRunner.class)
public class CountriesRepositoryImplTest {

	CountryRepositoryImpl countryRepositoryImpl;
	
	@Mock
	Query query;

	@Before
	public void prepData() {
		countryRepositoryImpl = new CountryRepositoryImpl();
	}

	@Test
	public void findByCountryCodeTest() {
		
		CountryEntity countryEntity = countryRepositoryImpl.findByCountryCode("NL");
		assertEquals("NL", countryEntity.getCountryCode());
		assertEquals("The Netherlands", countryEntity.getCountryName());
	}
	
	@Test
	public void findByCountryNameTest() {
		CountryEntity countryEntity = countryRepositoryImpl.findByCountryName("Ireland");
		assertEquals("IE", countryEntity.getCountryCode());
		assertEquals("Ireland", countryEntity.getCountryName());
	}

	@Test
	public void findCountriesTest() {
		List<CountryEntity> countries = new ArrayList<>();
		countries = countryRepositoryImpl.findCountries();
		assertThat(countries, not(IsEmptyCollection.empty()));
	}

	@Test
	public void findUnemploymentByYearTest() {
		List<Object[]> list = new ArrayList<>();
		list = countryRepositoryImpl.findUnemploymentByYear(2007);
		assertThat(list, not(IsEmptyCollection.empty()));
	}

	@Test
	public void findGdpByCountryNameAndYearTest() {
		Double gdp = countryRepositoryImpl.findGdpByCountryNameAndYear("Lithuania", 2011);
		assertEquals(gdp, 5.9, 0);
	}

	@Test
	public void findGdpByYearTest() {
		List<Object[]> list = new ArrayList<>();
		list = countryRepositoryImpl.findGdpByYear(2007);
		assertThat(list, not(IsEmptyCollection.empty()));
	}
	
	
}
