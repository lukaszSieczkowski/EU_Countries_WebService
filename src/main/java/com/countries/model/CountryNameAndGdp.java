package com.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryNameAndGdp {

	@XmlElement(name = "country_name")
	private String countryName;
	@XmlElement(name = "gdp")
	private double gdp;

	public CountryNameAndGdp() {
		super();
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public double getGdp() {
		return gdp;
	}

	public void setGdp(double gdp) {
		this.gdp = gdp;
	}

	@Override
	public String toString() {
		return "CountryNameAndGdp [countryName=" + countryName + ", gdp=" + gdp + "]";
	}

	
}
