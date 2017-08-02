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
@Table(name = "interest_rates")
public class InterestRates {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "interest_rates_2002")
	private double interest_rates_2002;
	@Column(name = "interest_rates_2003")
	private double interest_rates_2003;
	@Column(name = "interest_rates_2004")
	private double interest_rates_2004;
	@Column(name = "interest_rates_2005")
	private double interest_rates_2005;
	@Column(name = "interest_rates_2006")
	private double interest_rates_2006;
	@Column(name = "interest_rates_2007")
	private double interest_rates_2007;
	@Column(name = "interest_rates_2008")
	private double interest_rates_2008;
	@Column(name = "interest_rates_2009")
	private double interest_rates_2009;
	@Column(name = "interest_rates_2010")
	private double interest_rates_2010;
	@Column(name = "interest_rates_2011")
	private double interest_rates_2011;
	@Column(name = "interest_rates_2012")
	private double interest_rates_2012;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public InterestRates() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getInterest_rates_2002() {
		return interest_rates_2002;
	}

	public void setInterest_rates_2002(double interest_rates_2002) {
		this.interest_rates_2002 = interest_rates_2002;
	}

	public double getInterest_rates_2003() {
		return interest_rates_2003;
	}

	public void setInterest_rates_2003(double interest_rates_2003) {
		this.interest_rates_2003 = interest_rates_2003;
	}

	public double getInterest_rates_2004() {
		return interest_rates_2004;
	}

	public void setInterest_rates_2004(double interest_rates_2004) {
		this.interest_rates_2004 = interest_rates_2004;
	}

	public double getInterest_rates_2005() {
		return interest_rates_2005;
	}

	public void setInterest_rates_2005(double interest_rates_2005) {
		this.interest_rates_2005 = interest_rates_2005;
	}

	public double getInterest_rates_2006() {
		return interest_rates_2006;
	}

	public void setInterest_rates_2006(double interest_rates_2006) {
		this.interest_rates_2006 = interest_rates_2006;
	}

	public double getInterest_rates_2007() {
		return interest_rates_2007;
	}

	public void setInterest_rates_2007(double interest_rates_2007) {
		this.interest_rates_2007 = interest_rates_2007;
	}

	public double getInterest_rates_2008() {
		return interest_rates_2008;
	}

	public void setInterest_rates_2008(double interest_rates_2008) {
		this.interest_rates_2008 = interest_rates_2008;
	}

	public double getInterest_rates_2009() {
		return interest_rates_2009;
	}

	public void setInterest_rates_2009(double interest_rates_2009) {
		this.interest_rates_2009 = interest_rates_2009;
	}

	public double getInterest_rates_2010() {
		return interest_rates_2010;
	}

	public void setInterest_rates_2010(double interest_rates_2010) {
		this.interest_rates_2010 = interest_rates_2010;
	}

	public double getInterest_rates_2011() {
		return interest_rates_2011;
	}

	public void setInterest_rates_2011(double interest_rates_2011) {
		this.interest_rates_2011 = interest_rates_2011;
	}

	public double getInterest_rates_2012() {
		return interest_rates_2012;
	}

	public void setInterest_rates_2012(double interest_rates_2012) {
		this.interest_rates_2012 = interest_rates_2012;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

}
