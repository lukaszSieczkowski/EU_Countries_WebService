package com.countries.entity;

import javax.persistence.*;

@Entity
@Table(name = "export")
public class Export {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "export_2006")
	private long export_2006;
	@Column(name = "export_2007")
	private long export_2007;
	@Column(name = "export_2008")
	private long export_2008;
	@Column(name = "export_2009")
	private long export_2009;
	@Column(name = "export_2010")
	private long export_2010;
	@Column(name = "export_2011")
	private long export_2011;
	@Column(name = "export_2012")
	private long export_2012;
	@Column(name = "export_2013")
	private long export_2013;
	@Column(name = "export_2014")
	private long export_2014;
	@Column(name = "export_2015")
	private long export_2015;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_country")
	private CountryEntity country;

	public Export() {
		super();
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getExport_2006() {
		return export_2006;
	}

	public void setExport_2006(long export_2006) {
		this.export_2006 = export_2006;
	}

	public long getExport_2007() {
		return export_2007;
	}

	public void setExport_2007(long export_2007) {
		this.export_2007 = export_2007;
	}

	public long getExport_2008() {
		return export_2008;
	}

	public void setExport_2008(long export_2008) {
		this.export_2008 = export_2008;
	}

	public long getExport_2009() {
		return export_2009;
	}

	public void setExport_2009(long export_2009) {
		this.export_2009 = export_2009;
	}

	public long getExport_2010() {
		return export_2010;
	}

	public void setExport_2010(long export_2010) {
		this.export_2010 = export_2010;
	}

	public long getExport_2011() {
		return export_2011;
	}

	public void setExport_2011(long export_2011) {
		this.export_2011 = export_2011;
	}

	public long getExport_2012() {
		return export_2012;
	}

	public void setExport_2012(long export_2012) {
		this.export_2012 = export_2012;
	}

	public long getExport_2013() {
		return export_2013;
	}

	public void setExport_2013(long export_2013) {
		this.export_2013 = export_2013;
	}

	public long getExport_2014() {
		return export_2014;
	}

	public void setExport_2014(long export_2014) {
		this.export_2014 = export_2014;
	}

	public long getExport_2015() {
		return export_2015;
	}

	public void setExport_2015(long export_2015) {
		this.export_2015 = export_2015;
	}

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}
}
