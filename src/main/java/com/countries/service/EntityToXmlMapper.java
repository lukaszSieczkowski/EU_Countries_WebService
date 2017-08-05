package com.countries.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.countries.entity.CountryDetailsEntity;
import com.countries.entity.CountryEntity;
import com.countries.entity.GrosDomesticProductYearToYearEntity;
import com.countries.entity.UnemploymentEntity;
import com.countries.model.Country;
import com.countries.model.CountryDetails;
import com.countries.model.CountryNameAndGdp;
import com.countries.model.CountryNameAndUnemployment;
import com.countries.model.GrosDomesticProduct;
import com.countries.model.Unemployment;
import com.countries.model.response.GdpByCountryNameAndYearResponse;
import com.countries.model.response.GdpByYearResponse;
import com.countries.model.response.UnemploymentByYearResponse;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;

@Service
public class EntityToXmlMapper {

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

	public UnemploymentByYearResponse conventObjectToUnemploymentCountryNameAndYerListResponse(List<Object[]> object) {

		UnemploymentByYearResponse unemploymentByCountryNameAll = new UnemploymentByYearResponse();
		List<CountryNameAndUnemployment> countryNameAndUnemploymentList = new ArrayList<>();
		for (Object[] p : object) {

			String countryName = (String) p[0];
			double unemployment = (double) p[1];
			CountryNameAndUnemployment countryNameAndUnemployment = new CountryNameAndUnemployment();
			countryNameAndUnemployment.setCountryName(countryName);
			countryNameAndUnemployment.setUnemployment(unemployment);
			countryNameAndUnemploymentList.add(countryNameAndUnemployment);

		}
		unemploymentByCountryNameAll.setCountryNameAndUnemployment(countryNameAndUnemploymentList);
		return unemploymentByCountryNameAll;

	}

	public GrosDomesticProduct grosDomesticProductEntityToGrossDomesticProduct(CountryEntity countryEntity) {
		GrosDomesticProductYearToYearEntity grosDomesticProductYearToYearEntity = countryEntity
				.getGrosDomesticProductYearToYear();
		GrosDomesticProduct grosDomesticProduct = new GrosDomesticProduct.Builder()
				.gdp_2003(grosDomesticProductYearToYearEntity.getGdp_2003())
				.gdp_2004(grosDomesticProductYearToYearEntity.getGdp_2004())
				.gdp_2005(grosDomesticProductYearToYearEntity.getGdp_2005())
				.gdp_2006(grosDomesticProductYearToYearEntity.getGdp_2006())
				.gdp_2007(grosDomesticProductYearToYearEntity.getGdp_2007())
				.gdp_2008(grosDomesticProductYearToYearEntity.getGdp_2008())
				.gdp_2009(grosDomesticProductYearToYearEntity.getGdp_2009())
				.gdp_2010(grosDomesticProductYearToYearEntity.getGdp_2010())
				.gdp_2011(grosDomesticProductYearToYearEntity.getGdp_2011())
				.gdp_2012(grosDomesticProductYearToYearEntity.getGdp_2012())
				.gdp_2013(grosDomesticProductYearToYearEntity.getGdp_2013())
				.gdp_2014(grosDomesticProductYearToYearEntity.getGdp_2014()).build();
		return grosDomesticProduct;
	}

	public GdpByCountryNameAndYearResponse gdpByCountryNameAndYearToCountryNameAndyearResponse(Double gdp) {
		GdpByCountryNameAndYearResponse gdpByCountryNameAndYearResponse = new GdpByCountryNameAndYearResponse();
		gdpByCountryNameAndYearResponse.setGdp(gdp);
		return gdpByCountryNameAndYearResponse;
	}

	public GdpByYearResponse conventObjectToGdpCountryNameAndYerListResponse(List<Object[]> object) {

		GdpByYearResponse gdpByYearResponse = new GdpByYearResponse();
		List<CountryNameAndGdp> countryNameAndGdpList = new ArrayList<>();
		for (Object[] p : object) {

			String countryName = (String) p[0];
			double gdp = (double) p[1];
			CountryNameAndGdp countryNameAndGdp = new CountryNameAndGdp();
			countryNameAndGdp.setCountryName(countryName);
			countryNameAndGdp.setGdp(gdp);
			countryNameAndGdpList.add(countryNameAndGdp);
		}
		gdpByYearResponse.setCountryNameAndGdp(countryNameAndGdpList);
		return gdpByYearResponse;
	}

}