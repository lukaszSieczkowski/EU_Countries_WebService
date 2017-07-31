package com.countries.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.countries.model.CountryRequest;
import com.countries.model.CountryResponse;

@WebService
public interface CountryProcessor {
	@WebMethod
	public CountryResponse getCountryById(CountryRequest countryRequest);
	
}
