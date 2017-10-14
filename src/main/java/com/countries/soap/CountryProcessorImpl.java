package com.countries.soap;

import java.util.List;

import com.countries.entity.CountryEntity;
import com.countries.model.Country;
import com.countries.model.CountryDetails;
import com.countries.model.CountryNameAndGdp;
import com.countries.model.CountryNameAndUnemployment;
import com.countries.model.GrosDomesticProduct;
import com.countries.model.Unemployment;
import com.countries.model.request.CountriesRequest;
import com.countries.model.request.CountryCodeRequest;
import com.countries.model.request.CountryNameAndYearRequest;
import com.countries.model.request.CountryNameRequest;
import com.countries.model.request.YearRequest;
import com.countries.model.response.CountriesResponse;
import com.countries.model.response.CountryDetailsResponse;
import com.countries.model.response.CountryResponse;
import com.countries.model.response.GdpByCountryNameAndYearResponse;
import com.countries.model.response.GdpByCountryNameResponse;
import com.countries.model.response.GdpByYearResponse;
import com.countries.model.response.UnemploymentByYearResponse;
import com.countries.model.response.UnemploymentByCountryNameAndYearResponse;
import com.countries.model.response.UnemploymentByCountryNameResponse;
import com.countries.repository.CountryRepository;
import com.countries.repository.CountryRepositoryImpl;
import com.countries.service.EntityToXmlMapper;

public class CountryProcessorImpl implements CountryProcessor {

	CountryRepository countryRepository;
	EntityToXmlMapper entityToXmlMapper;

	public CountryProcessorImpl() {
		countryRepository = new CountryRepositoryImpl();
		entityToXmlMapper = new EntityToXmlMapper();
	}

	@Override
	public CountryResponse getCountryById(CountryCodeRequest countryCodeRequest) {
		CountryResponse countryResponse = new CountryResponse();
		String countryCode = countryCodeRequest.getCountryCode();
		CountryEntity countryEntity = countryRepository.findByCountryCode(countryCode);
		Country country = entityToXmlMapper.countryEntityToCountry(countryEntity);
		countryResponse.setCountry(country);
		return countryResponse;
	}

	@Override
	public CountriesResponse getCountries(CountriesRequest countriesRequest) {

		CountriesResponse countriesResponse = new CountriesResponse();
		List<CountryEntity> countryEntityList = countryRepository.findCountries();
		List<Country> countries = entityToXmlMapper.countryEntityToCountry(countryEntityList);
		countriesResponse.setCountries(countries);
		return countriesResponse;
	}

	@Override
	public CountryDetailsResponse getCountryDetailsByCountryCode(CountryCodeRequest countryCodeRequest) {
		CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();
		String countryCode = countryCodeRequest.getCountryCode();
		CountryEntity countryEntity = countryRepository.findByCountryCode(countryCode);
		CountryDetails countryDetails = entityToXmlMapper.countryDetailsEntityToCountryDetails(countryEntity);
		countryDetailsResponse.setCountryDetails(countryDetails);
		return countryDetailsResponse;
	}

	@Override
	public CountryDetailsResponse getCountryDetailsByCountryName(CountryNameRequest countryNameRequest) {
		CountryDetailsResponse countryDetailsResponse = new CountryDetailsResponse();
		String countryName = countryNameRequest.getCountryName();
		CountryEntity countryEntity = countryRepository.findByCountryName(countryName);
		CountryDetails countryDetails = entityToXmlMapper.countryDetailsEntityToCountryDetails(countryEntity);
		countryDetailsResponse.setCountryDetails(countryDetails);
		return countryDetailsResponse;
	}

	@Override
	public UnemploymentByCountryNameResponse getUnemploymentByCountry(CountryNameRequest countryNameRequest) {
		UnemploymentByCountryNameResponse unemploymentByCountryNameResponse = new UnemploymentByCountryNameResponse();
		String countryName = countryNameRequest.getCountryName();
		CountryEntity countryEntity = countryRepository.findByCountryName(countryName);
		Unemployment unemployment = entityToXmlMapper.unemploymentDetailsToUnemployment(countryEntity);

		unemploymentByCountryNameResponse.setUnemployment(unemployment);
		return unemploymentByCountryNameResponse;
	}


	@Override
	public GdpByCountryNameResponse getGprByCountry(CountryNameRequest countryNameRequest) {
		GdpByCountryNameResponse gprByCountryNameResponse = new GdpByCountryNameResponse();
		String countryName = countryNameRequest.getCountryName();
		CountryEntity countryEntity = countryRepository.findByCountryName(countryName);
		GrosDomesticProduct grosDomesticProduct = entityToXmlMapper
				.grosDomesticProductEntityToGrossDomesticProduct(countryEntity);
		gprByCountryNameResponse.setGrosDomesticProduct(grosDomesticProduct);
		return gprByCountryNameResponse;

	}
	@Override
	public UnemploymentByCountryNameAndYearResponse getUnemploymentByCountryNameAndYear(
			CountryNameAndYearRequest countryNameAndYearRequest) {
		UnemploymentByCountryNameAndYearResponse unemploymentByCountryNameAndYearResponse = new UnemploymentByCountryNameAndYearResponse();
		String countryName = countryNameAndYearRequest.getCountryNameAndYear().getCountryName();
		int year = countryNameAndYearRequest.getCountryNameAndYear().getYear();
		CountryEntity countryEntity = countryRepository.findByCountryName(countryName);
		unemploymentByCountryNameAndYearResponse = entityToXmlMapper
				.countryNameAndYearToCountryNameAndyearResponse(year, countryEntity);
		return unemploymentByCountryNameAndYearResponse;
	}
	
	@Override
	public GdpByCountryNameAndYearResponse getGprByCountryNameAndYear(
			CountryNameAndYearRequest countryNameAndYearRequest) {
		GdpByCountryNameAndYearResponse gprByCountryNameAndYearResponse = new GdpByCountryNameAndYearResponse();
		String countryName = countryNameAndYearRequest.getCountryNameAndYear().getCountryName();
		int year = countryNameAndYearRequest.getCountryNameAndYear().getYear();

		Double gdp = countryRepository.findGdpByCountryNameAndYear(countryName, year);
		gprByCountryNameAndYearResponse = entityToXmlMapper.gdpByCountryNameAndYearToCountryNameAndyearResponse(gdp);
		return gprByCountryNameAndYearResponse;
	}
	
	@Override
	public UnemploymentByYearResponse getUnemploymentByYear(YearRequest yearRequest) {
		UnemploymentByYearResponse unemploymentByYearResponse = new UnemploymentByYearResponse();
		int year = yearRequest.getYear();
		
		List<Object[]> object = countryRepository.findUnemploymentByYear(year);

		List<CountryNameAndUnemployment> countryNameAndUnemploymentList = entityToXmlMapper
				.conventObjectToUnemploymentCountryNameAndYer(object);

		unemploymentByYearResponse.setCountryNameAndUnemployment(countryNameAndUnemploymentList);

		return unemploymentByYearResponse;
	}

	@Override
	public GdpByYearResponse getGdpByYear(YearRequest yearRequest) {
		GdpByYearResponse gdpByYearResponse = new GdpByYearResponse();
		int year = yearRequest.getYear();

		List<Object[]> object = countryRepository.findGdpByYear(year);

		List<CountryNameAndGdp> gdpCountryNameAndYerList = entityToXmlMapper
				.conventObjectToGdpCountryNameAndYer(object);
		gdpByYearResponse.setCountryNameAndGdp(gdpCountryNameAndYerList);
		return gdpByYearResponse;
	}

}
