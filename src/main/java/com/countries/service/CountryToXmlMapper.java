package com.countries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.countries.entity.CountryDetailsEntity;
import com.countries.entity.CountryEntity;
import com.countries.entity.UnemploymentEntity;
import com.countries.model.Country;
import com.countries.model.CountryDetails;
import com.countries.model.Unemployment;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;

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

	public CountryDetails countryDetailsEntityToCountryDetails(CountryEntity countryEntity) {
		CountryDetailsEntity countryDetailsEntity = countryEntity.getDetails();
		CountryDetails countryDetails = new CountryDetails.Builder().area(countryDetailsEntity.getArea())
				.capital(countryDetailsEntity.getCapital()).currency(countryDetailsEntity.getCurency())
				.population(countryDetailsEntity.getPopulation())
				.grosDomesticProduct(countryDetailsEntity.getGrosDomesticProduct())
				.grosDomesticProductPerPerson(countryDetailsEntity.getGrosDomesticProductPerPerson()).build();
		return countryDetails;
	}

	public Unemployment unemploymentDetailsToUnemployment(CountryEntity countryEntity) {
		UnemploymentEntity unemploymentEntity = countryEntity.getUnemployment();
		Unemployment unemployment = new Unemployment.Builder()
				.unemployment_2003(unemploymentEntity.getUnemployment_2003())
				.unemployment_2004(unemploymentEntity.getUnemployment_2004())
				.unemployment_2005(unemploymentEntity.getUnemployment_2005())
				.unemployment_2006(unemploymentEntity.getUnemployment_2006())
				.unemployment_2007(unemploymentEntity.getUnemployment_2007())
				.unemployment_2008(unemploymentEntity.getUnemployment_2008())
				.unemployment_2009(unemploymentEntity.getUnemployment_2009())
				.unemployment_2010(unemploymentEntity.getUnemployment_2010())
				.unemployment_2011(unemploymentEntity.getUnemployment_2011())
				.unemployment_2012(unemploymentEntity.getUnemployment_2012()).build();
		return unemployment;
	}

	public UnemploymentByCountryNameAndYearResponse countryNameAndYearToCountryNameAndyearResponse(int year,
			CountryEntity countryEntity) {
		UnemploymentByCountryNameAndYearResponse unemploymentByCountryNameAndYearResponse = new UnemploymentByCountryNameAndYearResponse();
		switch (year) {
		case 2003: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2003());
			break;
		}
		case 2004: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2004());
			break;
		}
		case 2005: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2005());
			break;
		}
		case 2006: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2006());
			break;
		}
		case 2007: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2007());
			break;
		}
		case 2008: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2008());
			break;
		}
		case 2009: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2009());
			break;
		}
		case 2010: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2010());
			System.out.println(countryEntity.getUnemployment().getUnemployment_2010());
			break;
		}
		case 2011: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2011());
		}
		case 2012: {
			unemploymentByCountryNameAndYearResponse
					.setUnemployment(countryEntity.getUnemployment().getUnemployment_2012());
			break;
		}
		}
		return unemploymentByCountryNameAndYearResponse;
	}

}