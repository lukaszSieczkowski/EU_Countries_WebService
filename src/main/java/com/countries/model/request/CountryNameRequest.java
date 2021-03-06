package com.countries.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryNameRequest {

	@XmlElement(name = "country_name", required = true)
	private String countryName;

	public CountryNameRequest() {
		super();
	}
	

	public CountryNameRequest(String countryName) {
		super();
		this.countryName = countryName;
	}



	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
