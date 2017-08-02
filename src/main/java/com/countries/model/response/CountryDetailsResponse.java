package com.countries.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.CountryDetails;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryDetailsResponse {

	@XmlElement(name="country_details")
	private CountryDetails countryDetails;

	public CountryDetailsResponse() {
		super();
	}

	public CountryDetails getCountryDetails() {
		return countryDetails;
	}

	public void setCountryDetails(CountryDetails countryDetails) {
		this.countryDetails = countryDetails;
	}
	
}
