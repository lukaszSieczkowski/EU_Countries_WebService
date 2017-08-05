package com.countries.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.countries.model.request.CountriesRequest;
import com.countries.model.request.CountryCodeRequest;
import com.countries.model.request.CountryNameAndYearRequest;
import com.countries.model.request.CountryNameRequest;
import com.countries.model.request.YearRequest;
import com.countries.model.response.CountriesResponse;
import com.countries.model.response.CountryDetailsResponse;
import com.countries.model.response.CountryResponse;
import com.countries.model.response.UnemploymentByCountryNameAll;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;
import com.countries.model.response.UnemploymentByCountryNameResponse;

@WebService
public interface CountryProcessor {
	@WebMethod
	public CountryResponse getCountryById(CountryCodeRequest countryRequest);

	@WebMethod
	public CountriesResponse getCountries(CountriesRequest countriesRequest);

	@WebMethod
	public CountryDetailsResponse getCountryDetailsByCountryCode(CountryCodeRequest countryCodeRequest);
	
	@WebMethod
	public CountryDetailsResponse getCountryDetailsByCountryName(CountryNameRequest countryNameRequest);

	@WebMethod
	public UnemploymentByCountryNameResponse getUnemploymentByCountry(CountryNameRequest countryNameRequest);
	
	@WebMethod
	public UnemploymentByCountryNameAndYearResponse getUnemploymentByCOuntryNameAndYear(CountryNameAndYearRequest countryNameAndYearRequest);
	
	@WebMethod
	public UnemploymentByCountryNameAll getUnemploymentByCOuntryNameAll(YearRequest yearRequest);

	
}
