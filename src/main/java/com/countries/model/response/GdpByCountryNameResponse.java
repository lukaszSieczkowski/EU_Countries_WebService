package com.countries.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.countries.model.GrosDomesticProduct;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class GdpByCountryNameResponse {

	@XmlElement(name = "gdp")
	private GrosDomesticProduct grosDomesticProduct;

	public GdpByCountryNameResponse() {
		super();
	}

	public GrosDomesticProduct getGrosDomesticProduct() {
		return grosDomesticProduct;
	}

	public void setGrosDomesticProduct(GrosDomesticProduct grosDomesticProduct) {
		this.grosDomesticProduct = grosDomesticProduct;
	}

}
