package com.countries.soap;

import static org.junit.Assert.*;

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
import com.countries.repository.CountryRepositoryImpl;
import com.countries.service.EntityToXmlMapper;

import static org.hamcrest.CoreMatchers.*;
@RunWith(MockitoJUnitRunner.class)
public class CountryProcessorImplTest {
	@InjectMocks
	CountryProcessorImpl countryProcessor = new CountryProcessorImpl();
	@Mock
	CountryRepositoryImpl countryRepository;
	@Mock
	EntityToXmlMapper entityToXmlMapper;
	
	
	@Test
	public void getCountryByIdTest() {
		CountryCodeRequest request = new CountryCodeRequest();
		request.setCountryCode("PL");
		CountryEntity countryEntity = new CountryEntity("Poland","PL");
		Mockito.when(countryRepository.findByCountryCode(request.getCountryCode())).thenReturn(countryEntity);
		Mockito.when(entityToXmlMapper.countryEntityToCountry(countryEntity)).thenReturn(new Country("Poland","PL"));
		CountryResponse response = countryProcessor.getCountryById(request);
		assertEquals(new Country("Poland","PL"),response.getCountry());
	
	}
	
	
	
}
