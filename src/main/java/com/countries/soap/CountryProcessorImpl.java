package com.countries.soap;


import com.countries.model.CountryRequest;
import com.countries.model.CountryResponse;
import com.countries.repository.CountryRepository;

public class CountryProcessorImpl implements CountryProcessor {

	@Override
	public CountryResponse getCountryById(CountryRequest countryRequest) {
		CountryResponse countryResponse = new CountryResponse();
		long id = countryRequest.getId();
		CountryRepository countryRepository = new CountryRepository();
		String name = countryRepository.findById(id);
		countryResponse.setCountryName(name);
		return countryResponse;
	}

}
