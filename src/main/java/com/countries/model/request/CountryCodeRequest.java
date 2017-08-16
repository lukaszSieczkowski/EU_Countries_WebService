package com.countries.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryCodeRequest {

	@XmlElement(name = "country_code", required = true)
	private String countryCode;

	public CountryCodeRequest() {
		super();
	}

	public CountryCodeRequest(String countryCode) {
		super();
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
