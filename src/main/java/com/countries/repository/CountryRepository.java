package com.countries.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.countries.entity.CountryEntity;

@Repository
public interface CountryRepository {

	public CountryEntity findByCountryCode(String countryCode);

	public CountryEntity findByCountryName(String countryCode);
	
	public List<CountryEntity> findCountries();
	
	
}
