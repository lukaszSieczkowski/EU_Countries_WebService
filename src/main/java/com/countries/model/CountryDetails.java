package com.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class CountryDetails {

	@XmlElement(name = "area")
	private long area;
	@XmlElement(name = "population")
	private long population;
	@XmlElement(name = "capital")
	private String capital;
	@XmlElement(name = "currency")
	private String currency;
	@XmlElement(name = "gros_domestic_product")
	private long grosDomesticProduct;
	@XmlElement(name = "gros_domestic_product_per_person")
	private long grosDomesticProductPerPerson;

	public CountryDetails() {
		super();
	}

	private CountryDetails(Builder builder) {
		this.area = builder.area;
		this.population = builder.population;
		this.capital = builder.capital;
		this.currency = builder.currency;
		this.grosDomesticProduct = builder.grosDomesticProduct;
		this.grosDomesticProductPerPerson = builder.grosDomesticProductPerPerson;
	}

	public long getArea() {
		return area;
	}

	public void setArea(long area) {
		this.area = area;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getGrosDomesticProduct() {
		return grosDomesticProduct;
	}

	public void setGrosDomesticProduct(long grosDomesticProduct) {
		this.grosDomesticProduct = grosDomesticProduct;
	}

	public long getGrosDomesticProductPerPerson() {
		return grosDomesticProductPerPerson;
	}

	public void setGrosDomesticProductPerPerson(long grosDomesticProductPerPerson) {
		this.grosDomesticProductPerPerson = grosDomesticProductPerPerson;
	}

	public static class Builder {
		private long area;
		private long population;
		private String capital;
		private String currency;
		private long grosDomesticProduct;
		private long grosDomesticProductPerPerson;

		public Builder() {

		}

		public Builder area(long area) {
			this.area = area;
			return this;
		}

		public Builder population(long population) {
			this.population = population;
			return this;
		}

		public Builder capital(String capital) {
			this.capital = capital;
			return this;
		}

		public Builder currency(String currency) {
			this.currency = currency;
			return this;
		}

		public Builder grosDomesticProduct(long grosDomesticProduct) {
			this.grosDomesticProduct = grosDomesticProduct;
			return this;
		}

		public Builder grosDomesticProductPerPerson(long grosDomesticProductPerPerson) {
			this.grosDomesticProductPerPerson = grosDomesticProductPerPerson;
			return this;
		}

		public CountryDetails build() {
			return new CountryDetails(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (area ^ (area >>> 32));
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + (int) (grosDomesticProduct ^ (grosDomesticProduct >>> 32));
		result = prime * result + (int) (grosDomesticProductPerPerson ^ (grosDomesticProductPerPerson >>> 32));
		result = prime * result + (int) (population ^ (population >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDetails other = (CountryDetails) obj;
		if (area != other.area)
			return false;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (grosDomesticProduct != other.grosDomesticProduct)
			return false;
		if (grosDomesticProductPerPerson != other.grosDomesticProductPerPerson)
			return false;
		if (population != other.population)
			return false;
		return true;
	}

}
