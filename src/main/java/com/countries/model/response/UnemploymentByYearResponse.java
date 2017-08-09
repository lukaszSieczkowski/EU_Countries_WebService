package com.countries.model.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.CountryNameAndUnemployment;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class UnemploymentByYearResponse {

	@XmlElement(name = "country_name_and_year")
	private List<CountryNameAndUnemployment> countryNameAndUnemployment;

	public UnemploymentByYearResponse() {
		super();
	}

	public List<CountryNameAndUnemployment> getCountryNameAndUnemployment() {
		return countryNameAndUnemployment;
	}

	public void setCountryNameAndUnemployment(List<CountryNameAndUnemployment> countryNameAndUnemployment) {
		this.countryNameAndUnemployment = countryNameAndUnemployment;
	}
}
