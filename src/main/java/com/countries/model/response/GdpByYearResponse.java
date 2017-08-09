package com.countries.model.response;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.CountryNameAndGdp;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class GdpByYearResponse {

	@XmlElement(name = "country_name_and_gdp")
	private List<CountryNameAndGdp> countryNameAndGdp;

	public GdpByYearResponse() {
		super();
	}

	public List<CountryNameAndGdp> getCountryNameAndGdp() {
		return countryNameAndGdp;
	}

	public void setCountryNameAndGdp(List<CountryNameAndGdp> countryNameAndGdp) {
		this.countryNameAndGdp = countryNameAndGdp;
	}

}
