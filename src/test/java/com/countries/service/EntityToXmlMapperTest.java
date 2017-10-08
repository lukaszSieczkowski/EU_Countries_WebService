package com.countries.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.countries.entity.CountryDetailsEntity;
import com.countries.entity.CountryEntity;
import com.countries.entity.UnemploymentEntity;
import com.countries.model.Country;
import com.countries.model.CountryDetails;
import com.countries.model.GrosDomesticProduct;
import com.countries.model.Unemployment;
import com.countries.model.response.GdpByYearResponse;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;
import com.countries.model.response.UnemploymentByYearResponse;
import com.countries.repository.CountryRepositoryImpl;

public class EntityToXmlMapperTest {

	@Mock
	CountryRepositoryImpl countryRepositoryImpl;
	EntityToXmlMapper entityToXmlMapper;
	CountryEntity polandEntity;
	CountryEntity netherlandsEntity;
	CountryEntity germanyEntity;
	List<CountryEntity> countryEntityList;
	CountryDetails netherlandsDetails;

	@Before
	public void prepData() {
		MockitoAnnotations.initMocks(this);
		entityToXmlMapper = new EntityToXmlMapper();
		polandEntity = new CountryEntity("Poland", "PL");
		countryEntityList = new ArrayList<>();
		countryEntityList.add(polandEntity);
		netherlandsEntity = new CountryEntity();
		netherlandsEntity.setCountryCode("NL");
		netherlandsEntity.setCountryName("Netherlands");
		CountryDetailsEntity netherlandsDetailsEntity = new CountryDetailsEntity();
		netherlandsDetailsEntity.setArea(41526);
		netherlandsDetailsEntity.setCapital("Amsterdam");
		netherlandsDetailsEntity.setCurency("EURO");
		netherlandsDetailsEntity.setGrosDomesticProduct(773100000000L);
		netherlandsDetailsEntity.setGrosDomesticProductPerPerson(46142);
		netherlandsDetailsEntity.setPopulation(16778000);
		netherlandsEntity.setDetails(netherlandsDetailsEntity);
	
	
	}

	@Test
	public void countryEntityToCountryTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("PL")).thenReturn(polandEntity);
		Country country = entityToXmlMapper.countryEntityToCountry(polandEntity);
		assertNotNull(country);
		assertEquals(new Country("Poland", "PL"), country);
	}

	@Test
	public void countryEntityToCountryListTest() {
		Mockito.when(countryRepositoryImpl.findCountries()).thenReturn(countryEntityList);
		List<Country> countryList = entityToXmlMapper.countryEntityToCountry(countryEntityList);
		assertThat(countryList, not(IsEmptyCollection.empty()));
	}

	@Test
	public void countryDetailsEntityToCountryDetailsTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("NL")).thenReturn(netherlandsEntity);
		CountryDetails countryDetails = entityToXmlMapper.countryDetailsEntityToCountryDetails(netherlandsEntity);
		CountryDetails netherlandsDetails = new CountryDetails.Builder().area(41526).capital("Amsterdam")
				.currency("EURO").grosDomesticProduct(773100000000L).grosDomesticProductPerPerson(46142)
				.population(16778000).build();
		assertNotNull(countryDetails);
		assertEquals(netherlandsDetails, countryDetails);
	}

	@Test
	public void unemploymentDetailsToUnemploymentTest() {
		Mockito.when(countryRepositoryImpl.findByCountryName("Germany")).thenReturn(germanyEntity);
		Unemployment unemployment = entityToXmlMapper.unemploymentDetailsToUnemployment(germanyEntity);
		Unemployment germanyUnemployment = new Unemployment.Builder().unemployment_2003(9.8).unemployment_2004(10.5)
				.unemployment_2005(11.3).unemployment_2006(10.3).unemployment_2007(8.7).unemployment_2008(7.5)
				.unemployment_2009(7.8).unemployment_2010(7.1).unemployment_2011(5.9).unemployment_2012(5.5).build();
		assertNotNull(unemployment);
		assertEquals(germanyUnemployment, unemployment);
	}

	@Test
	public void countryNameAndYearToCountryNameAndyearResponseTest() {
		CountryEntity countryEntity = countryRepositoryImpl.findByCountryCode("CZ");
		UnemploymentByCountryNameAndYearResponse unemploymentByCountryNameAndYearResponse = entityToXmlMapper
				.countryNameAndYearToCountryNameAndyearResponse(2010, countryEntity);
		Double unemployment = unemploymentByCountryNameAndYearResponse.getUnemployment();
		assertEquals(7.3, unemployment, 0);
	}

	@Test
	public void conventObjectToUnemploymentCountryNameAndYerListResponseTest() {
		List<Object[]> objects = countryRepositoryImpl.findUnemploymentByYear(2005);
		UnemploymentByYearResponse unemploymentByCountryNameAll = entityToXmlMapper
				.conventObjectToUnemploymentCountryNameAndYerListResponse(objects);
		assertEquals("Cyprus", unemploymentByCountryNameAll.getCountryNameAndUnemployment().get(3).getCountryName());
		assertEquals(5.3, unemploymentByCountryNameAll.getCountryNameAndUnemployment().get(3).getUnemployment(), 0);
	}

	@Test
	public void grosDomesticProductEntityToGrossDomesticProductTest() {
		CountryEntity countryEntity = countryRepositoryImpl.findByCountryName("Finland");
		GrosDomesticProduct domesticProduct = entityToXmlMapper
				.grosDomesticProductEntityToGrossDomesticProduct(countryEntity);
		GrosDomesticProduct gdpFinland = new GrosDomesticProduct.Builder().gdp_2003(2).gdp_2004(4.1).gdp_2005(2.9)
				.gdp_2006(4.4).gdp_2007(5.3).gdp_2008(0.3).gdp_2009(-8.5).gdp_2010(3.3).gdp_2011(2.8).gdp_2012(-0.2)
				.gdp_2013(0.3).gdp_2014(1.2).build();
		assertNotNull(domesticProduct);
		assertEquals(gdpFinland, domesticProduct);
	}

	@Test
	public void conventObjectToGdpCountryNameAndYerListResponse() {
		List<Object[]> objects = countryRepositoryImpl.findGdpByYear(2003);
		GdpByYearResponse response = entityToXmlMapper.conventObjectToGdpCountryNameAndYerListResponse(objects);
		assertEquals("Austria", response.getCountryNameAndGdp().get(0).getCountryName());
		assertEquals(0.9, response.getCountryNameAndGdp().get(0).getGdp(), 0);

	}
}
