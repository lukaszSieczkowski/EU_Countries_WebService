package com.countries.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class CountryDetailsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_details")
	private long id;
	@Column(name = "area_details")
	private long area;
	@Column(name = "population_details")
	private long population;
	@Column(name = "capital_details")
	private String capital;
	@Column(name = "currency_details")
	private String curency;
	@Column(name = "gros_domestic_product_details")
	private long grosDomesticProduct;
	@Column(name = "gros_domestic_product_per_person_details")
	private long grosDomesticProductPerPerson;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public CountryDetailsEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getCurency() {
		return curency;
	}

	public void setCurency(String curency) {
		this.curency = curency;
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

}
