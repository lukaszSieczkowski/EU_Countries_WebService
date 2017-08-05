package com.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryNameAndUnemployment {
	
		@XmlElement(name="country_name")
		private String countryName;
		@XmlElement(name="unemployment")
		private double unemployment;
		public CountryNameAndUnemployment() {
			super();
		}
		public String getCountryName() {
			return countryName;
		}
		public void setCountryName(String countryName) {
			this.countryName = countryName;
		}
		public double getUnemployment() {
			return unemployment;
		}
		public void setUnemployment(double unemployment) {
			this.unemployment = unemployment;
		}
}
