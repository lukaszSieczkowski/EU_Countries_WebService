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
@Table(name = "inflation")
public class Inflation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "inflation_2001")
	private double inflation_2001;
	@Column(name = "inflation_2002")
	private double inflation_2002;
	@Column(name = "inflation_2003")
	private double inflation_2003;
	@Column(name = "inflation_2004")
	private double inflation_2004;
	@Column(name = "inflation_2005")
	private double inflation_2005;
	@Column(name = "inflation_2006")
	private double inflation_2006;
	@Column(name = "inflation_2007")
	private double inflation_2007;
	@Column(name = "inflation_2008")
	private double inflation_2008;
	@Column(name = "inflation_2009")
	private double inflation_2009;
	@Column(name = "inflation_2010")
	private double inflation_2010;
	@Column(name = "inflation_2011")
	private double inflation_2011;
	@Column(name = "inflation_2012")
	private double inflation_2012;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public Inflation() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getInflation_2001() {
		return inflation_2001;
	}

	public void setInflation_2001(double inflation_2001) {
		this.inflation_2001 = inflation_2001;
	}

	public double getInflation_2002() {
		return inflation_2002;
	}

	public void setInflation_2002(double inflation_2002) {
		this.inflation_2002 = inflation_2002;
	}

	public double getInflation_2003() {
		return inflation_2003;
	}

	public void setInflation_2003(double inflation_2003) {
		this.inflation_2003 = inflation_2003;
	}

	public double getInflation_2004() {
		return inflation_2004;
	}

	public void setInflation_2004(double inflation_2004) {
		this.inflation_2004 = inflation_2004;
	}

	public double getInflation_2005() {
		return inflation_2005;
	}

	public void setInflation_2005(double inflation_2005) {
		this.inflation_2005 = inflation_2005;
	}

	public double getInflation_2006() {
		return inflation_2006;
	}

	public void setInflation_2006(double inflation_2006) {
		this.inflation_2006 = inflation_2006;
	}

	public double getInflation_2007() {
		return inflation_2007;
	}

	public void setInflation_2007(double inflation_2007) {
		this.inflation_2007 = inflation_2007;
	}

	public double getInflation_2008() {
		return inflation_2008;
	}

	public void setInflation_2008(double inflation_2008) {
		this.inflation_2008 = inflation_2008;
	}

	public double getInflation_2009() {
		return inflation_2009;
	}

	public void setInflation_2009(double inflation_2009) {
		this.inflation_2009 = inflation_2009;
	}

	public double getInflation_2010() {
		return inflation_2010;
	}

	public void setInflation_2010(double inflation_2010) {
		this.inflation_2010 = inflation_2010;
	}

	public double getInflation_2011() {
		return inflation_2011;
	}

	public void setInflation_2011(double inflation_2011) {
		this.inflation_2011 = inflation_2011;
	}

	public double getInflation_2012() {
		return inflation_2012;
	}

	public void setInflation_2012(double inflation_2012) {
		this.inflation_2012 = inflation_2012;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}
}
