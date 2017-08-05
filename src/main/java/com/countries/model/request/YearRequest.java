package com.countries.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class YearRequest {
	@XmlElement(name = "year", required = true)
	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public YearRequest() {
		super();
	}
	
}
