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
@Table(name = "gros_domestic_product_year_to_year_percentage")
public class GrosDomesticProductYearToYearEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "gros_domestic_product_2003")
	private double gdp_2003;
	@Column(name = "gros_domestic_product_2004")
	private double gdp_2004;
	@Column(name = "gros_domestic_product_2005")
	private double gdp_2005;
	@Column(name = "gros_domestic_product_2006")
	private double gdp_2006;
	@Column(name = "gros_domestic_product_2007")
	private double gdp_2007;
	@Column(name = "gros_domestic_product_2008")
	private double gdp_2008;
	@Column(name = "gros_domestic_product_2009")
	private double gdp_2009;
	@Column(name = "gros_domestic_product_2010")
	private double gdp_2010;
	@Column(name = "gros_domestic_product_2011")
	private double gdp_2011;
	@Column(name = "gros_domestic_product_2012")
	private double gdp_2012;
	@Column(name = "gros_domestic_product_2013")
	private double gdp_2013;
	@Column(name = "gros_domestic_product_2014")
	private double gdp_2014;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public GrosDomesticProductYearToYearEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getGdp_2003() {
		return gdp_2003;
	}

	public void setGdp_2003(double gdp_2003) {
		this.gdp_2003 = gdp_2003;
	}

	public double getGdp_2004() {
		return gdp_2004;
	}

	public void setGdp_2004(double gdp_2004) {
		this.gdp_2004 = gdp_2004;
	}

	public double getGdp_2005() {
		return gdp_2005;
	}

	public void setGdp_2005(double gdp_2005) {
		this.gdp_2005 = gdp_2005;
	}

	public double getGdp_2006() {
		return gdp_2006;
	}

	public void setGdp_2006(double gdp_2006) {
		this.gdp_2006 = gdp_2006;
	}

	public double getGdp_2007() {
		return gdp_2007;
	}

	public void setGdp_2007(double gdp_2007) {
		this.gdp_2007 = gdp_2007;
	}

	public double getGdp_2008() {
		return gdp_2008;
	}

	public void setGdp_2008(double gdp_2008) {
		this.gdp_2008 = gdp_2008;
	}

	public double getGdp_2009() {
		return gdp_2009;
	}

	public void setGdp_2009(double gdp_2009) {
		this.gdp_2009 = gdp_2009;
	}

	public double getGdp_2010() {
		return gdp_2010;
	}

	public void setGdp_2010(double gdp_2010) {
		this.gdp_2010 = gdp_2010;
	}

	public double getGdp_2011() {
		return gdp_2011;
	}

	public void setGdp_2011(double gdp_2011) {
		this.gdp_2011 = gdp_2011;
	}

	public double getGdp_2012() {
		return gdp_2012;
	}

	public void setGdp_2012(double gdp_2012) {
		this.gdp_2012 = gdp_2012;
	}

	public double getGdp_2013() {
		return gdp_2013;
	}

	public void setGdp_2013(double gdp_2013) {
		this.gdp_2013 = gdp_2013;
	}

	public double getGdp_2014() {
		return gdp_2014;
	}

	public void setGdp_2014(double gdp_2014) {
		this.gdp_2014 = gdp_2014;
	}

}
