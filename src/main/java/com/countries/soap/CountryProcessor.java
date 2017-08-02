package com.countries.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.countries.model.request.CountriesRequest;
import com.countries.model.request.CountryCodeRequest;
import com.countries.model.request.CountryNameRequest;
import com.countries.model.response.CountriesResponse;
import com.countries.model.response.CountryDetailsResponse;
import com.countries.model.response.CountryResponse;

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
}
