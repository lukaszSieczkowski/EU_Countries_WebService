package com.countries.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.Country;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryResponse {

	@XmlElement(name = "country")
	private Country country;

	public CountryResponse() {
		super();
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}
