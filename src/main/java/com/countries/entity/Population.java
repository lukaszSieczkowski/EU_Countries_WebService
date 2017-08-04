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
@Table(name = "population")
public class Population {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "population_2001")
	private long population_2001;
	@Column(name = "population_2002")
	private long population_2002;
	@Column(name = "population_2003")
	private long population_2003;
	@Column(name = "population_2004")
	private long population_2004;
	@Column(name = "population_2005")
	private long population_2005;
	@Column(name = "population_2006")
	private long population_2006;
	@Column(name = "population_2007")
	private long population_2007;
	@Column(name = "population_2008")
	private long population_2008;
	@Column(name = "population_2009")
	private long population_2009;
	@Column(name = "population_2010")
	private long population_2010;
	@Column(name = "population_2011")
	private long population_2011;
	@Column(name = "population_2012")
	private long population_2012;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public Population() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPopulation_2001() {
		return population_2001;
	}

	public void setPopulation_2001(long population_2001) {
		this.population_2001 = population_2001;
	}

	public long getPopulation_2002() {
		return population_2002;
	}

	public void setPopulation_2002(long population_2002) {
		this.population_2002 = population_2002;
	}

	public long getPopulation_2003() {
		return population_2003;
	}

	public void setPopulation_2003(long population_2003) {
		this.population_2003 = population_2003;
	}

	public long getPopulation_2004() {
		return population_2004;
	}

	public void setPopulation_2004(long population_2004) {
		this.population_2004 = population_2004;
	}

	public long getPopulation_2005() {
		return population_2005;
	}

	public void setPopulation_2005(long population_2005) {
		this.population_2005 = population_2005;
	}

	public long getPopulation_2006() {
		return population_2006;
	}

	public void setPopulation_2006(long population_2006) {
		this.population_2006 = population_2006;
	}

	public long getPopulation_2007() {
		return population_2007;
	}

	public void setPopulation_2007(long population_2007) {
		this.population_2007 = population_2007;
	}

	public long getPopulation_2008() {
		return population_2008;
	}

	public void setPopulation_2008(long population_2008) {
		this.population_2008 = population_2008;
	}

	public long getPopulation_2009() {
		return population_2009;
	}

	public void setPopulation_2009(long population_2009) {
		this.population_2009 = population_2009;
	}

	public long getPopulation_2010() {
		return population_2010;
	}

	public void setPopulation_2010(long population_2010) {
		this.population_2010 = population_2010;
	}

	public long getPopulation_2011() {
		return population_2011;
	}

	public void setPopulation_2011(long population_2011) {
		this.population_2011 = population_2011;
	}

	public long getPopulation_2012() {
		return population_2012;
	}

	public void setPopulation_2012(long population_2012) {
		this.population_2012 = population_2012;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

}
