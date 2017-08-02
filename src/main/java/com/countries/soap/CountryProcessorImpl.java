package com.countries.soap;

import java.util.List;

import com.countries.entity.CountryEntity;
import com.countries.model.Country;
import com.countries.model.CountryDetails;
import com.countries.model.request.CountriesRequest;
import com.countries.model.request.CountryCodeRequest;
import com.countries.model.request.CountryNameRequest;
import com.countries.model.response.CountriesResponse;
import com.countries.model.response.CountryDetailsResponse;
import com.countries.model.response.CountryResponse;
import com.countries.repository.CountryRepository;
import com.countries.repository.CountryRepositoryImpl;
import com.countries.service.CountryToXmlMapper;

public class CountryProcessorImpl implements CountryProcessor {

	@Override
	public CountryResponse getCountryById(CountryCodeRequest countryCodeRequest) {
		CountryResponse countryResponse = new CountryResponse();
		String countryCode = countryCodeRequest.getCountryCode();
		CountryRepository countryRepository = new CountryRepositoryImpl();
		CountryToXmlMapper countryToXmlMapper = new CountryToXmlMapper();
		CountryEntity countryEntity = countryRepository.findByCountryCode(countryCode);
		Country country = countryToXmlMapper.countryEntityToCountry(countryEntity);
		countryResponse.setCountry(country);
		return countryResponse;
	}

	@Override
	public CountriesResponse getCountries(CountriesRequest countriesRequest) {
		CountriesResponse countriesResponse = new CountriesResponse();
		CountryRepository countryRepository = new CountryRepositoryImpl();
		List<CountryEntity> countryEntityList = countryRepository.findCountries();
		CountryToXmlMapper countryToXmlMapper = new CountryToXmlMapper();
		List<Country> countries = countryToXmlMapper.countryEntityToCountry(countryEntityList);
		countriesResponse.setCountries(countries);
		return countriesResponse;
	}

	@Override
	public CountryDetailsResponse getCountryDetailsByCountryCode(CountryCodeRequest countryCodeRequest) {
		CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();
		String countryCode = countryCodeRequest.getCountryCode();
		CountryRepository countryRepository = new CountryRepositoryImpl();
		CountryToXmlMapper countryToXmlMapper = new CountryToXmlMapper();
		CountryEntity countryEntity = countryRepository.findByCountryCode(countryCode);
		CountryDetails countryDetails = countryToXmlMapper.countryDetailsEntityToCountryDetails(countryEntity);
		countryDetailsResponse.setCountryDetails(countryDetails);
		return countryDetailsResponse;
	}

	@Override
	public CountryDetailsResponse getCountryDetailsByCountryName(CountryNameRequest countryNameRequest) {
		CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();
		String countryName = countryNameRequest.getCountryName();
		CountryRepository countryRepository = new CountryRepositoryImpl();
		CountryToXmlMapper countryToXmlMapper = new CountryToXmlMapper();
		CountryEntity countryEntity = countryRepository.findByCountryName(countryName);
		CountryDetails countryDetails = countryToXmlMapper.countryDetailsEntityToCountryDetails(countryEntity);
		countryDetailsResponse.setCountryDetails(countryDetails);
		return countryDetailsResponse;
	}

	
}
