package com.countries.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.countries.entity.CountryEntity;

@Repository
public interface CountryRepository {

	public CountryEntity findByCountryCode(String countryCode);

	public CountryEntity findByCountryName(String countryCode);

	public List<CountryEntity> findCountries();

	public List<Object[]> findUnemploymentByYear(int year);

	public Double findGdpByCountryNameAndYear(String countryName, int year);

	public List<Object[]> findGdpByYear(int year);

}
