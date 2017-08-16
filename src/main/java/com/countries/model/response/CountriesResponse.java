package com.countries.model.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.Country;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountriesResponse {

	@XmlElement(name = "countries")
	private List<Country> countries;

	public CountriesResponse() {
		super();
	}

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

}
