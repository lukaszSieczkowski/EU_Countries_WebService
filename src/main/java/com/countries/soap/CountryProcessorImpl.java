package com.countries.soap;



import java.util.List;

import com.countries.entity.CountryEntity;
import com.countries.model.CountriesRequest;
import com.countries.model.CountriesResponse;
import com.countries.model.Country;
import com.countries.model.CountryRequest;
import com.countries.model.CountryResponse;
import com.countries.repository.CountryRepository;
import com.countries.repository.CountryRepositoryImpl;
import com.countries.service.CountryToXmlMapper;

public class CountryProcessorImpl implements CountryProcessor {


	@Override
	public CountryResponse getCountryById(CountryRequest countryRequest) {
		CountryResponse countryResponse = new CountryResponse();
		String countryCode = countryRequest.getCountryCode();
		CountryRepository countryRepository =  new CountryRepositoryImpl();
		CountryToXmlMapper countryToXmlMapper =new CountryToXmlMapper();
		CountryEntity countryEntity = countryRepository.findByCountryCode(countryCode);
		Country country = countryToXmlMapper.countryEntityToCountry(countryEntity);
		countryResponse.setCountry(country);
		return countryResponse;
	}

	@Override
	public CountriesResponse getCountries(CountriesRequest countriesRequest) {
		CountriesResponse countriesResponse = new CountriesResponse();
		CountryRepository countryRepository =  new CountryRepositoryImpl();
		List<CountryEntity> countryEntityList = countryRepository.findCountries();
		CountryToXmlMapper countryToXmlMapper =new CountryToXmlMapper();
		List<Country>countries = countryToXmlMapper.countryEntityToCountry(countryEntityList);
		countriesResponse.setCountries(countries);
		return countriesResponse;
	}

}
