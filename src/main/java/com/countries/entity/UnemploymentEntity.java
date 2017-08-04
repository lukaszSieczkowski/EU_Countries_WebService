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
@Table(name = "unemployment")
public class UnemploymentEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "unemployment_2003")
	private double unemployment_2003;
	@Column(name = "unemployment_2004")
	private double unemployment_2004;
	@Column(name = "unemployment_2005")
	private double unemployment_2005;
	@Column(name = "unemployment_2006")
	private double unemployment_2006;
	@Column(name = "unemployment_2007")
	private double unemployment_2007;
	@Column(name = "unemployment_2008")
	private double unemployment_2008;
	@Column(name = "unemployment_2009")
	private double unemployment_2009;
	@Column(name = "unemployment_2010")
	private double unemployment_2010;
	@Column(name = "unemployment_2011")
	private double unemployment_2011;
	@Column(name = "unemployment_2012")
	private double unemployment_2012;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public UnemploymentEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getUnemployment_2003() {
		return unemployment_2003;
	}

	public void setUnemployment_2003(double unemployment_2003) {
		this.unemployment_2003 = unemployment_2003;
	}

	public double getUnemployment_2004() {
		return unemployment_2004;
	}

	public void setUnemployment_2004(double unemployment_2004) {
		this.unemployment_2004 = unemployment_2004;
	}

	public double getUnemployment_2005() {
		return unemployment_2005;
	}

	public void setUnemployment_2005(double unemployment_2005) {
		this.unemployment_2005 = unemployment_2005;
	}

	public double getUnemployment_2006() {
		return unemployment_2006;
	}

	public void setUnemployment_2006(double unemployment_2006) {
		this.unemployment_2006 = unemployment_2006;
	}

	public double getUnemployment_2007() {
		return unemployment_2007;
	}

	public void setUnemployment_2007(double unemployment_2007) {
		this.unemployment_2007 = unemployment_2007;
	}

	public double getUnemployment_2008() {
		return unemployment_2008;
	}

	public void setUnemployment_2008(double unemployment_2008) {
		this.unemployment_2008 = unemployment_2008;
	}

	public double getUnemployment_2009() {
		return unemployment_2009;
	}

	public void setUnemployment_2009(double unemployment_2009) {
		this.unemployment_2009 = unemployment_2009;
	}

	public double getUnemployment_2010() {
		return unemployment_2010;
	}

	public void setUnemployment_2010(double unemployment_2010) {
		this.unemployment_2010 = unemployment_2010;
	}

	public double getUnemployment_2011() {
		return unemployment_2011;
	}

	public void setUnemployment_2011(double unemployment_2011) {
		this.unemployment_2011 = unemployment_2011;
	}

	public double getUnemployment_2012() {
		return unemployment_2012;
	}

	public void setUnemployment_2012(double unemployment_2012) {
		this.unemployment_2012 = unemployment_2012;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

}
