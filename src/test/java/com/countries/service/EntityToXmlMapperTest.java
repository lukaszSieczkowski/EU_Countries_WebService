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
import org.mockito.stubbing.OngoingStubbing;

import com.countries.entity.CountryDetailsEntity;
import com.countries.entity.CountryEntity;
import com.countries.entity.GrosDomesticProductYearToYearEntity;
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

	EntityToXmlMapper entityToXmlMapper;

	CountryEntity poland;

	@Mock
	CountryRepositoryImpl countryRepositoryImpl;

	@Before
	public void prepData() {
		MockitoAnnotations.initMocks(this);
		poland = preparePolandObject();
		entityToXmlMapper = new EntityToXmlMapper();
	}

	@Test
	public void countryEntityToCountryTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("PL")).thenReturn(poland);
		Country country = entityToXmlMapper.countryEntityToCountry(poland);
		assertNotNull(country);
		assertEquals("PL", country.getCountryCode());
		assertEquals("Poland", country.getCountryName());
	}

	@Test
	public void countryEntityToCountryListTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("PL")).thenReturn(poland);
		List<CountryEntity> countries = new ArrayList<>();
		countries.add(poland);
		List<Country> countryList = entityToXmlMapper.countryEntityToCountry(countries);
		assertThat(countryList, not(IsEmptyCollection.empty()));
	}

	@Test
	public void countryDetailsEntityToCountryDetailsTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("PL")).thenReturn(poland);
		CountryDetails countryDetails = entityToXmlMapper.countryDetailsEntityToCountryDetails(poland);
		assertNotNull(countryDetails);
		assertEquals(312879, countryDetails.getArea());
		assertEquals("Warszawa", countryDetails.getCapital());
		assertEquals("PL", countryDetails.getCurrency());
		assertEquals(487600000000L, countryDetails.getGrosDomesticProduct());
		assertEquals(12538, countryDetails.getGrosDomesticProductPerPerson());
		assertEquals(38544000, countryDetails.getPopulation());
	}

	@Test
	public void unemploymentDetailsToUnemploymentTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("PL")).thenReturn(poland);
		Unemployment unemployment = entityToXmlMapper.unemploymentDetailsToUnemployment(poland);
		assertNotNull(unemployment);
		assertEquals(19.8, poland.getUnemployment().getUnemployment_2003(), 0);
		assertEquals(19.1, poland.getUnemployment().getUnemployment_2004(), 0);
		assertEquals(17.9, poland.getUnemployment().getUnemployment_2005(), 0);
		assertEquals(13.9, poland.getUnemployment().getUnemployment_2006(), 0);
		assertEquals(9.6, poland.getUnemployment().getUnemployment_2007(), 0);
		assertEquals(7.1, poland.getUnemployment().getUnemployment_2008(), 0);
		assertEquals(8.1, poland.getUnemployment().getUnemployment_2009(), 0);
		assertEquals(9.7, poland.getUnemployment().getUnemployment_2010(), 0);
		assertEquals(9.7, poland.getUnemployment().getUnemployment_2011(), 0);
		assertEquals(10.1, poland.getUnemployment().getUnemployment_2012(), 0);
	}

	@Test
	public void countryNameAndYearToCountryNameAndyearResponseTest() {
		Mockito.when(countryRepositoryImpl.findByCountryCode("PL")).thenReturn(poland);
		UnemploymentByCountryNameAndYearResponse unemploymentByCountryNameAndYearResponse = entityToXmlMapper
				.countryNameAndYearToCountryNameAndyearResponse(2010, poland);
		Double unemployment = unemploymentByCountryNameAndYearResponse.getUnemployment();
		assertEquals(9.7, unemployment, 0);
	}

	@Test
	public void conventObjectToUnemploymentCountryNameAndYerListResponseTest() {
		Object[] nameUnemployment = { "Poland", 17.9 };
		List<Object[]> objects = new ArrayList<>();
		objects.add(nameUnemployment);
		Mockito.when(countryRepositoryImpl.findUnemploymentByYear(2005)).thenReturn(objects);
		UnemploymentByYearResponse unemploymentByCountryNameAll = entityToXmlMapper
				.conventObjectToUnemploymentCountryNameAndYerListResponse(objects);
		assertEquals("Poland", unemploymentByCountryNameAll.getCountryNameAndUnemployment().get(0).getCountryName());
		assertEquals(17.9, unemploymentByCountryNameAll.getCountryNameAndUnemployment().get(0).getUnemployment(), 0);
	}

	@Test
	public void grosDomesticProductEntityToGrossDomesticProductTest() {

		Mockito.when(countryRepositoryImpl.findByCountryName("Poland")).thenReturn(poland);
		GrosDomesticProduct domesticProduct = entityToXmlMapper.grosDomesticProductEntityToGrossDomesticProduct(poland);

		assertNotNull(domesticProduct);
		assertEquals(3.9, domesticProduct.getGdp_2003(), 0);
		assertEquals(5.3, domesticProduct.getGdp_2004(), 0);
		assertEquals(3.6, domesticProduct.getGdp_2005(), 0);
		assertEquals(6.2, domesticProduct.getGdp_2006(), 0);
		assertEquals(6.8, domesticProduct.getGdp_2007(), 0);
		assertEquals(5.1, domesticProduct.getGdp_2008(), 0);
		assertEquals(1.6, domesticProduct.getGdp_2009(), 0);
		assertEquals(3.9, domesticProduct.getGdp_2010(), 0);
		assertEquals(4.3, domesticProduct.getGdp_2011(), 0);
		assertEquals(2.0, domesticProduct.getGdp_2012(), 0);
		assertEquals(1.2, domesticProduct.getGdp_2013(), 0);
		assertEquals(2.2, domesticProduct.getGdp_2014(), 0);
	}

	@Test
	public void conventObjectToGdpCountryNameAndYerListResponse() {
		Object[] nameUnemployment = { "Poland", 3.9 };
		List<Object[]> objects = new ArrayList<>();
		objects.add(nameUnemployment);
		Mockito.when(countryRepositoryImpl.findGdpByYear(2003)).thenReturn(objects);
		GdpByYearResponse response = entityToXmlMapper.conventObjectToGdpCountryNameAndYerListResponse(objects);
		assertEquals("Poland", response.getCountryNameAndGdp().get(0).getCountryName());
		assertEquals(3.9, response.getCountryNameAndGdp().get(0).getGdp(), 0);

	}

	public CountryEntity preparePolandObject() {

		CountryEntity poland = new CountryEntity();
		poland.setCountryCode("PL");
		poland.setCountryName("Poland");

		CountryDetailsEntity polandDetails = new CountryDetailsEntity();
		polandDetails.setArea(312879);
		polandDetails.setCapital("Warszawa");
		polandDetails.setCurency("PL");
		polandDetails.setGrosDomesticProduct(487600000000L);
		polandDetails.setGrosDomesticProductPerPerson(12538);
		polandDetails.setPopulation(38544000);
		poland.setDetails(polandDetails);

		UnemploymentEntity polandUnemployment = new UnemploymentEntity();
		polandUnemployment.setUnemployment_2003(19.8);
		polandUnemployment.setUnemployment_2004(19.1);
		polandUnemployment.setUnemployment_2005(17.9);
		polandUnemployment.setUnemployment_2006(13.9);
		polandUnemployment.setUnemployment_2007(9.6);
		polandUnemployment.setUnemployment_2008(7.1);
		polandUnemployment.setUnemployment_2009(8.1);
		polandUnemployment.setUnemployment_2010(9.7);
		polandUnemployment.setUnemployment_2011(9.7);
		polandUnemployment.setUnemployment_2012(10.1);
		poland.setUnemployment(polandUnemployment);

		GrosDomesticProductYearToYearEntity polandGDP = new GrosDomesticProductYearToYearEntity();
		polandGDP.setGdp_2003(3.9);
		polandGDP.setGdp_2004(5.3);
		polandGDP.setGdp_2005(3.6);
		polandGDP.setGdp_2006(6.2);
		polandGDP.setGdp_2007(6.8);
		polandGDP.setGdp_2008(5.1);
		polandGDP.setGdp_2009(1.6);
		polandGDP.setGdp_2010(3.9);
		polandGDP.setGdp_2011(4.3);
		polandGDP.setGdp_2012(2.0);
		polandGDP.setGdp_2013(1.2);
		polandGDP.setGdp_2014(2.2);
		poland.setGrosDomesticProductYearToYear(polandGDP);

		return poland;

	}
}
