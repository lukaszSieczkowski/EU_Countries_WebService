package com.countries.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.CountryNameAndYear;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryNameAndYearRequest {

	@XmlElement(name = "countryNameAndYear")
	private CountryNameAndYear countryNameAndYear;

	public CountryNameAndYearRequest() {
		super();
	}

	public CountryNameAndYear getCountryNameAndYear() {
		return countryNameAndYear;
	}

	public void setCountryNameAndYear(CountryNameAndYear countryNameAndYear) {
		this.countryNameAndYear = countryNameAndYear;
	}

}
