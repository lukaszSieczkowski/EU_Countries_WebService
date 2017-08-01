package com.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryResponse {
	
	@XmlElement(name="country")
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
