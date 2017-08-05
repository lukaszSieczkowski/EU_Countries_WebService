package com.countries.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class UnemploymentByCountryNameAndYearResponse {

	@XmlElement(name = "unemployment")
	private double unemployment;

	public UnemploymentByCountryNameAndYearResponse() {
		super();
	}

	public double getUnemployment() {
		return unemployment;
	}

	public void setUnemployment(double unemployment) {
		this.unemployment = unemployment;
	}

}
