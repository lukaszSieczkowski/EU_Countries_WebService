package com.countries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.countries.entity.CountryEntity;
import com.countries.model.Country;
import com.countries.repository.CountryRepositoryImpl;

@Service
public class CountryToXmlMapper {

	
	public Country countryEntityToCountry(CountryEntity countryEntity){
		Country country = new Country();
		country.setCountryName(countryEntity.getCountryName());
		country.setCountryCode(countryEntity.getCountryCode());
		return country;
	}
	
	public List<Country>  countryEntityToCountry (List<CountryEntity> countryEntityList){
		List<Country> countryList = new ArrayList<>();
		
		for(int i=0;i<countryEntityList.size();i++){
			Country country = countryEntityToCountry(countryEntityList.get(i));
			countryList.add(country);
		}
		return countryList;	
	}

}
