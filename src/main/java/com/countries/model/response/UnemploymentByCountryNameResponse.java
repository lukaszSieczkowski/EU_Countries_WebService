package com.countries.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.Unemployment;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class UnemploymentByCountryNameResponse {

	@XmlElement(name = "unemployment")
	private Unemployment unemployment;

	public UnemploymentByCountryNameResponse() {
		super();
	}

	public Unemployment getUnemployment() {
		return unemployment;
	}

	public void setUnemployment(Unemployment unemployment) {
		this.unemployment = unemployment;
	}

}
