package com.countries.soap;

import static org.junit.Assert.*;

import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;

import com.countries.model.Country;
import com.countries.model.CountryDetails;
import com.countries.model.CountryNameAndGdp;
import com.countries.model.CountryNameAndUnemployment;
import com.countries.model.CountryNameAndYear;
import com.countries.model.GrosDomesticProduct;
import com.countries.model.Unemployment;
import com.countries.model.request.CountriesRequest;
import com.countries.model.request.CountryCodeRequest;
import com.countries.model.request.CountryNameAndYearRequest;
import com.countries.model.request.CountryNameRequest;
import com.countries.model.request.YearRequest;
import com.countries.model.response.CountriesResponse;
import com.countries.model.response.CountryDetailsResponse;
import com.countries.model.response.CountryResponse;
import com.countries.model.response.GdpByCountryNameAndYearResponse;
import com.countries.model.response.GdpByCountryNameResponse;
import com.countries.model.response.GdpByYearResponse;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;
import com.countries.model.response.UnemploymentByCountryNameResponse;
import com.countries.model.response.UnemploymentByYearResponse;

import static org.hamcrest.CoreMatchers.*;

public class CountryProcessorImplTest {

	CountryProcessor countryProcessor;

	@Before
	public void setData() {
		countryProcessor = new CountryProcessorImpl();
	}

	@Test
	public void getCountriesTest() {
		CountriesRequest countriesRequest = new CountriesRequest();
		CountriesResponse countriesResponse = countryProcessor.getCountries(countriesRequest);
		List<Country> countriesList = countriesResponse.getCountries();
		assertThat(countriesList, not(IsEmptyCollection.empty()));
	}

	@Test
	public void getCountryByIdTest() {
		CountryCodeRequest codeRequest = new CountryCodeRequest("AU");
		CountryResponse response = countryProcessor.getCountryById(codeRequest);
		Country country = response.getCountry();
		assertEquals("Austria", country.getCountryName());
		assertEquals("AU", country.getCountryCode());
	}

	@Test
	public void getCountryDetailsByCountryCodeTest() {
		CountryCodeRequest codeRequest = new CountryCodeRequest("PL");
		CountryDetailsResponse response = countryProcessor.getCountryDetailsByCountryCode(codeRequest);
		CountryDetails countryDetails = response.getCountryDetails();
		assertEquals(312879, countryDetails.getArea());
		assertEquals("Warszawa", countryDetails.getCapital());
		assertEquals("PLN", countryDetails.getCurrency());
		assertEquals(38544000, countryDetails.getPopulation());
		assertEquals(487600000000L, countryDetails.getGrosDomesticProduct());
		assertEquals(12538, countryDetails.getGrosDomesticProductPerPerson());
	}

	@Test
	public void getCountryDetailsByCountryNameTest() {
		CountryNameRequest countryNameRequest = new CountryNameRequest("Poland");
		CountryDetailsResponse response = countryProcessor.getCountryDetailsByCountryName(countryNameRequest);
		CountryDetails countryDetails = response.getCountryDetails();
		assertEquals(312879, countryDetails.getArea());
		assertEquals("Warszawa", countryDetails.getCapital());
		assertEquals("PLN", countryDetails.getCurrency());
		assertEquals(38544000, countryDetails.getPopulation());
		assertEquals(487600000000L, countryDetails.getGrosDomesticProduct());
		assertEquals(12538, countryDetails.getGrosDomesticProductPerPerson());
	}

	@Test
	public void getUnemploymentByCountry() {
		CountryNameRequest countryNameRequest = new CountryNameRequest("Germany");
		UnemploymentByCountryNameResponse unemploymentResponse = countryProcessor
				.getUnemploymentByCountry(countryNameRequest);
		Unemployment unemployment = unemploymentResponse.getUnemployment();

		assertEquals(9.8, unemployment.getUnemployment_2003(), 0);
		assertEquals(10.5, unemployment.getUnemployment_2004(), 0);
		assertEquals(11.3, unemployment.getUnemployment_2005(), 0);
		assertEquals(10.3, unemployment.getUnemployment_2006(), 0);
		assertEquals(8.7, unemployment.getUnemployment_2007(), 0);
		assertEquals(7.5, unemployment.getUnemployment_2008(), 0);
		assertEquals(7.8, unemployment.getUnemployment_2009(), 0);
		assertEquals(7.1, unemployment.getUnemployment_2010(), 0);
		assertEquals(5.9, unemployment.getUnemployment_2011(), 0);
		assertEquals(5.5, unemployment.getUnemployment_2012(), 0);
	}

	@Test
	public void getUnemploymentByCountryNameAndYearTest() {
		CountryNameAndYearRequest countryNameAndYearRequest = new CountryNameAndYearRequest(
				new CountryNameAndYear("Spain", 2009));
		UnemploymentByCountryNameAndYearResponse response = countryProcessor
				.getUnemploymentByCountryNameAndYear(countryNameAndYearRequest);
		Double unemployment = response.getUnemployment();
		assertEquals(18, unemployment, 0);
	}

	@Test
	public void getUnemploymentByYearTest() {
		YearRequest yearRequest = new YearRequest(2004);
		UnemploymentByYearResponse unemploymentByYearResponse = countryProcessor.getUnemploymentByYear(yearRequest);
		List<CountryNameAndUnemployment> countriesList = unemploymentByYearResponse.getCountryNameAndUnemployment();
		assertThat(countriesList, not(IsEmptyCollection.empty()));
		assertEquals("Belgium", countriesList.get(1).getCountryName());
		assertEquals(8.4, countriesList.get(1).getUnemployment(), 0);
	}

	@Test
	public void getGdpByCountry() {
		CountryNameRequest countryNameRequest = new CountryNameRequest("Portugal");
		GdpByCountryNameResponse gdpResponse = countryProcessor.getGprByCountry(countryNameRequest);
		GrosDomesticProduct gdp = gdpResponse.getGrosDomesticProduct();

		assertEquals(-0.9, gdp.getGdp_2003(), 0);
		assertEquals(1.6, gdp.getGdp_2004(), 0);
		assertEquals(0.8, gdp.getGdp_2005(), 0);
		assertEquals(1.4, gdp.getGdp_2006(), 0);
		assertEquals(2.4, gdp.getGdp_2007(), 0);
		assertEquals(0, gdp.getGdp_2008(), 0);
		assertEquals(2.9, gdp.getGdp_2009(), 0);
		assertEquals(1.9, gdp.getGdp_2010(), 0);
		assertEquals(-1.6, gdp.getGdp_2011(), 0);
		assertEquals(-3.2, gdp.getGdp_2012(), 0);
		assertEquals(-1.9, gdp.getGdp_2013(), 0);
		assertEquals(0.8, gdp.getGdp_2014(), 0);
	}

	@Test
	public void getGprByCountryNameAndYearTest() {
		CountryNameAndYearRequest countryNameAndYearRequest = new CountryNameAndYearRequest(
				new CountryNameAndYear("Luxemburg", 2008));
		GdpByCountryNameAndYearResponse response = countryProcessor
				.getGprByCountryNameAndYear(countryNameAndYearRequest);
		Double gdp = response.getGdp();
		assertEquals(-0.7, gdp, 0);
	}

	@Test
	public void getGdpByYearTest() {
		YearRequest yearRequest = new YearRequest(2006);
		GdpByYearResponse gdpResponse = countryProcessor.getGdpByYear(yearRequest);
		List<CountryNameAndGdp> countriesList = gdpResponse.getCountryNameAndGdp();
		assertThat(countriesList, not(IsEmptyCollection.empty()));
		assertEquals("Bulgaria", countriesList.get(2).getCountryName());
		assertEquals(6.5, countriesList.get(2).getGdp(), 0);
	}
}
