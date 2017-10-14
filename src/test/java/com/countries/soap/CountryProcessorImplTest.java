package com.countries.soap;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.countries.entity.CountryDetailsEntity;
import com.countries.entity.CountryEntity;
import com.countries.entity.GrosDomesticProductYearToYearEntity;
import com.countries.entity.UnemploymentEntity;
import com.countries.model.Countries;
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
import com.countries.model.response.GdpByCountryNameResponse;
import com.countries.model.response.GdpByYearResponse;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;
import com.countries.model.response.UnemploymentByCountryNameResponse;

import com.countries.repository.CountryRepositoryImpl;
import com.countries.service.EntityToXmlMapper;

@RunWith(MockitoJUnitRunner.class)
public class CountryProcessorImplTest {
	@InjectMocks
	CountryProcessorImpl countryProcessor = new CountryProcessorImpl();
	@Mock
	CountryRepositoryImpl countryRepository;
	@Mock
	EntityToXmlMapper entityToXmlMapper;

	CountryEntity countryEntity;
	Country country;
	CountryDetails countryDetails;
	Unemployment unemployment;
	GrosDomesticProduct gdp;

	@Before
	public void init() {
		countryEntity = new CountryEntity("Poland", "PL");
		country = new Country("Poland", "PL");
		countryDetails = new CountryDetails.Builder().area(312879).capital("Warszawa").currency("PL")
				.grosDomesticProduct(487600000000L).grosDomesticProductPerPerson(12538).population(38544000).build();
		unemployment = new Unemployment.Builder().unemployment_2003(19.8).unemployment_2004(19.1)
				.unemployment_2005(17.9).unemployment_2006(13.9).unemployment_2007(9.6).unemployment_2008(7.1)
				.unemployment_2009(8.1).unemployment_2010(9.7).unemployment_2011(9.7).unemployment_2012(10.1).build();
		gdp = new GrosDomesticProduct.Builder().gdp_2003(3.9).gdp_2004(5.3).gdp_2005(3.6).gdp_2006(6.2).gdp_2007(6.8)
				.gdp_2008(5.1).gdp_2009(1.6).gdp_2010(3.9).gdp_2011(4.3).gdp_2012(2.0).gdp_2013(1.2).gdp_2014(2.2)
				.build();
	}

	@Test
	public void getCountryByIdTest() {
		CountryCodeRequest request = new CountryCodeRequest();
		request.setCountryCode("PL");
		CountryEntity countryEntity = new CountryEntity("Poland", "PL");

		Mockito.when(countryRepository.findByCountryCode(request.getCountryCode())).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.countryEntityToCountry(countryEntity)).thenReturn(country);

		CountryResponse response = countryProcessor.getCountryById(request);
		assertNotNull(response);
		assertEquals("Incorect country value", new Country("Poland", "PL"), response.getCountry());
	}

	@Test
	public void getCountriesTest() {
		CountriesRequest request = new CountriesRequest();
		List<CountryEntity> countriesEntityList = new ArrayList<>();
		countriesEntityList.add(countryEntity);
		List<Country> countriesList = new ArrayList<>();
		countriesList.add(country);

		Mockito.when(countryRepository.findCountries()).thenReturn(countriesEntityList);
		Mockito.when(entityToXmlMapper.countryEntityToCountry(countriesEntityList)).thenReturn(countriesList);
		CountriesResponse response = countryProcessor.getCountries(request);

		assertNotNull(response);
		assertEquals("Incorrect country code value", "PL", response.getCountries().get(0).getCountryCode());
		assertEquals("Incorrect country name value", "Poland", response.getCountries().get(0).getCountryName());
	}

	@Test
	public void getCountryDetailsByCountryCodeTest() {
		CountryCodeRequest request = new CountryCodeRequest();
		request.setCountryCode("PL");

		Mockito.when(countryRepository.findByCountryCode(request.getCountryCode())).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.countryDetailsEntityToCountryDetails(countryEntity)).thenReturn(countryDetails);
		CountryDetailsResponse response = countryProcessor.getCountryDetailsByCountryCode(request);

		assertNotNull(response);
		assertEquals("Incorrect are value", 312879, response.getCountryDetails().getArea());
		assertEquals("Incorrect capital city value", "Warszawa", response.getCountryDetails().getCapital());
		assertEquals("Incorrect currency value", "PL", response.getCountryDetails().getCurrency());
		assertEquals("Incorrect gros domectic product value", 487600000000L,
				response.getCountryDetails().getGrosDomesticProduct());
		assertEquals("Incorrect gros domestic product per person value", 12538,
				response.getCountryDetails().getGrosDomesticProductPerPerson());
		assertEquals("Incorect population value", 38544000, response.getCountryDetails().getPopulation());
	}

	@Test
	public void getCountryDetailsByCountryNameTest() {
		CountryNameRequest request = new CountryNameRequest();
		request.setCountryName("Poland");

		Mockito.when(countryRepository.findByCountryName(request.getCountryName())).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.countryDetailsEntityToCountryDetails(countryEntity)).thenReturn(countryDetails);
		CountryDetailsResponse response = countryProcessor.getCountryDetailsByCountryName(request);

		assertNotNull(response);
		assertEquals("Incorrect are value", 312879, response.getCountryDetails().getArea());
		assertEquals("Incorrect capital city value", "Warszawa", response.getCountryDetails().getCapital());
		assertEquals("Incorrect currency value", "PL", response.getCountryDetails().getCurrency());
		assertEquals("Incorrect gros domectic product value", 487600000000L,
				response.getCountryDetails().getGrosDomesticProduct());
		assertEquals("Incorrect gros domestic product per person value", 12538,
				response.getCountryDetails().getGrosDomesticProductPerPerson());
		assertEquals("Incorect population value", 38544000, response.getCountryDetails().getPopulation());
	}

	@Test
	public void getUnemploymentByCountryTest() {
		CountryNameRequest request = new CountryNameRequest();
		request.setCountryName("Poland");
		Mockito.when(countryRepository.findByCountryName(request.getCountryName())).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.unemploymentDetailsToUnemployment(countryEntity)).thenReturn(unemployment);

		UnemploymentByCountryNameResponse response = countryProcessor.getUnemploymentByCountry(request);

		assertNotNull(response);
		assertEquals("Incorect unemployment value in year 2003", 19.8,
				response.getUnemployment().getUnemployment_2003(), 0);
		assertEquals("Incorect unemployment value in year 2004", 19.1,
				response.getUnemployment().getUnemployment_2004(), 0);
		assertEquals("Incorect unemployment value in year 2005", 17.9,
				response.getUnemployment().getUnemployment_2005(), 0);
		assertEquals("Incorect unemployment value in year 2006", 13.9,
				response.getUnemployment().getUnemployment_2006(), 0);
		assertEquals("Incorect unemployment value in year 2007", 9.6, response.getUnemployment().getUnemployment_2007(),
				0);
		assertEquals("Incorect unemployment value in year 2008", 7.1, response.getUnemployment().getUnemployment_2008(),
				0);
		assertEquals("Incorect unemployment value in year 2009", 8.1, response.getUnemployment().getUnemployment_2009(),
				0);
		assertEquals("Incorect unemployment value in year 2010", 9.7, response.getUnemployment().getUnemployment_2010(),
				0);
		assertEquals("Incorect unemployment value in year 2011", 9.7, response.getUnemployment().getUnemployment_2011(),
				0);
		assertEquals("Incorect unemployment value in year 2012", 10.1,
				response.getUnemployment().getUnemployment_2012(), 0);
	}

	@Test
	public void getUnemploymentByCountryNameAndYearTest() {
		CountryNameAndYearRequest request = new CountryNameAndYearRequest();
		CountryNameAndYear countryNameAndYear = new CountryNameAndYear();
		countryNameAndYear.setCountryName("Poland");
		countryNameAndYear.setYear(2010);
		request.setCountryNameAndYear(countryNameAndYear);
		UnemploymentByCountryNameAndYearResponse unemploymentByCountryNameAndYearResponse = new UnemploymentByCountryNameAndYearResponse();
		unemploymentByCountryNameAndYearResponse.setUnemployment(9.7);

		Mockito.when(countryRepository.findByCountryName("Poland")).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.countryNameAndYearToCountryNameAndyearResponse(countryNameAndYear.getYear(),
				countryEntity)).thenReturn(unemploymentByCountryNameAndYearResponse);

		UnemploymentByCountryNameAndYearResponse response = countryProcessor
				.getUnemploymentByCountryNameAndYear(request);

		assertNotNull(response);
		assertEquals(9.7, response.getUnemployment(), 0);
	}

	@Test
	public void getGprByCountryTest() {
		CountryNameRequest request = new CountryNameRequest();
		request.setCountryName("Poland");
		Mockito.when(countryRepository.findByCountryName(request.getCountryName())).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.grosDomesticProductEntityToGrossDomesticProduct(countryEntity)).thenReturn(gdp);

		GdpByCountryNameResponse response = countryProcessor.getGprByCountry(request);

		assertNotNull(response);
		assertEquals("Incorect unemployment value in year 2003", 3.9, response.getGrosDomesticProduct().getGdp_2003(),
				0);
		assertEquals("Incorect unemployment value in year 2004", 5.3, response.getGrosDomesticProduct().getGdp_2004(),
				0);
		assertEquals("Incorect unemployment value in year 2005", 3.6, response.getGrosDomesticProduct().getGdp_2005(),
				0);
		assertEquals("Incorect unemployment value in year 2006", 6.2, response.getGrosDomesticProduct().getGdp_2006(),
				0);
		assertEquals("Incorect unemployment value in year 2007", 6.8, response.getGrosDomesticProduct().getGdp_2007(),
				0);
		assertEquals("Incorect unemployment value in year 2008", 5.1, response.getGrosDomesticProduct().getGdp_2008(),
				0);
		assertEquals("Incorect unemployment value in year 2009", 1.6, response.getGrosDomesticProduct().getGdp_2009(),
				0);
		assertEquals("Incorect unemployment value in year 2010", 3.9, response.getGrosDomesticProduct().getGdp_2010(),
				0);
		assertEquals("Incorect unemployment value in year 2011", 4.3, response.getGrosDomesticProduct().getGdp_2011(),
				0);
		assertEquals("Incorect unemployment value in year 2012", 2.0, response.getGrosDomesticProduct().getGdp_2012(),
				0);
		assertEquals("Incorect unemployment value in year 2013", 1.2, response.getGrosDomesticProduct().getGdp_2013(),
				0);
		assertEquals("Incorect unemployment value in year 2014", 2.2, response.getGrosDomesticProduct().getGdp_2014(),
				0);
	}

	@Test
	public void getGdpByYearTest() {

		YearRequest request = new YearRequest();
		request.setYear(2010);

		List<Object[]> objects = new ArrayList<>();
		Object[] object = { "Poland", 3.9 };
		objects.add(object);

		List<CountryNameAndGdp> countryNameAndGdpList = new ArrayList<>();
		CountryNameAndGdp countryNameAndGdp = new CountryNameAndGdp();
		countryNameAndGdp.setCountryName("Poland");
		countryNameAndGdp.setGdp(3.9);
		countryNameAndGdpList.add(countryNameAndGdp);

		Mockito.when(countryRepository.findGdpByYear(request.getYear())).thenReturn(objects);
		Mockito.when(entityToXmlMapper.conventObjectToGdpCountryNameAndYer(objects)).thenReturn(countryNameAndGdpList);

		GdpByYearResponse gdpByYear = countryProcessor.getGdpByYear(request);

		assertNotNull(gdpByYear);
		assertEquals("Poland", gdpByYear.getCountryNameAndGdp().get(0).getCountryName());
		assertEquals(3.9, gdpByYear.getCountryNameAndGdp().get(0).getGdp(), 0);
	}

}
