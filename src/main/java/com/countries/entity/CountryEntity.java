package com.countries.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country")
public class CountryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_country")
	private long id;
	@Column(name = "name_country")
	private String countryName;
	@Column(name = "code_country")
	private String countryCode;
	@OneToOne(mappedBy = "country")
	private CountryDetailsEntity details;
	@OneToOne(mappedBy = "country")
	private GrosDomesticProductYearToYearEntity grosDomesticProductYearToYear;
	@OneToOne(mappedBy = "country")
	private Population population;
	@OneToOne(mappedBy = "country")
	private Inflation inflation;
	@OneToOne(mappedBy = "country")
	private InterestRates interestRates;
	@OneToOne(mappedBy = "country")
	private UnemploymentEntity unemployment;
	@OneToOne(mappedBy = "country")
	private Export export;

	public CountryEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public CountryDetailsEntity getDetails() {
		return details;
	}

	public void setDetails(CountryDetailsEntity details) {
		this.details = details;
	}

	public GrosDomesticProductYearToYearEntity getGrosDomesticProductYearToYear() {
		return grosDomesticProductYearToYear;
	}

	public void setGrosDomesticProductYearToYear(GrosDomesticProductYearToYearEntity grosDomesticProductYearToYear) {
		this.grosDomesticProductYearToYear = grosDomesticProductYearToYear;
	}

	public Population getPopulation() {
		return population;
	}

	public void setPopulation(Population population) {
		this.population = population;
	}

	public Inflation getInflation() {
		return inflation;
	}

	public void setInflation(Inflation inflation) {
		this.inflation = inflation;
	}

	public InterestRates getInterestRates() {
		return interestRates;
	}

	public void setInterestRates(InterestRates interestRates) {
		this.interestRates = interestRates;
	}

	public UnemploymentEntity getUnemployment() {
		return unemployment;
	}

	public void setUnemployment(UnemploymentEntity unemployment) {
		this.unemployment = unemployment;
	}

	public Export getExport() {
		return export;
	}

	public void setExport(Export export) {
		this.export = export;
	}

}
