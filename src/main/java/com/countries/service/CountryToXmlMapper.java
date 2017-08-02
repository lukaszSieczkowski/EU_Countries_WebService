package com.countries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.countries.entity.CountryDetailsEntity;
import com.countries.entity.CountryEntity;
import com.countries.model.Country;
import com.countries.model.CountryDetails;

@Service
public class CountryToXmlMapper {

	public Country countryEntityToCountry(CountryEntity countryEntity) {
		Country country = new Country();
		country.setCountryName(countryEntity.getCountryName());
		country.setCountryCode(countryEntity.getCountryCode());
		return country;
	}

	public List<Country> countryEntityToCountry(List<CountryEntity> countryEntityList) {
		List<Country> countryList = new ArrayList<>();

		for (int i = 0; i < countryEntityList.size(); i++) {
			Country country = countryEntityToCountry(countryEntityList.get(i));
			countryList.add(country);
		}
		return countryList;
	}
	
	public CountryDetails countryDetailsEntityToCountryDetails(CountryEntity countryEntity){
		CountryDetailsEntity countryDetailsEntity = countryEntity.getDetails();
		CountryDetails countryDetails = new CountryDetails.Builder().area(countryDetailsEntity.getArea())
				.capital(countryDetailsEntity.getCapital()).currency(countryDetailsEntity.getCurency())
				.population(countryDetailsEntity.getPopulation()).grosDomesticProduct(countryDetailsEntity.getGrosDomesticProduct())
				.grosDomesticProductPerPerson(countryDetailsEntity.getGrosDomesticProductPerPerson()).build();
		return countryDetails;
		
	}

}
