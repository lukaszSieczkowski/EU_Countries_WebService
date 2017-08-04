package com.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Unemployment {
	@XmlElement(name = "unemployment_2003")
	private double unemployment_2003;
	@XmlElement(name = "unemployment_2004")
	private double unemployment_2004;
	@XmlElement(name = "unemployment_2005")
	private double unemployment_2005;
	@XmlElement(name = "unemployment_2006")
	private double unemployment_2006;
	@XmlElement(name = "unemployment_2007")
	private double unemployment_2007;
	@XmlElement(name = "unemployment_2008")
	private double unemployment_2008;
	@XmlElement(name = "unemployment_2009")
	private double unemployment_2009;
	@XmlElement(name = "unemployment_2010")
	private double unemployment_2010;
	@XmlElement(name = "unemployment_2011")
	private double unemployment_2011;
	@XmlElement(name = "unemployment_2012")
	private double unemployment_2012;

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

	private Unemployment(Builder builer) {
		this.unemployment_2003 = builer.unemployment_2003;
		this.unemployment_2004 = builer.unemployment_2004;
		this.unemployment_2005 = builer.unemployment_2005;
		this.unemployment_2006 = builer.unemployment_2006;
		this.unemployment_2007 = builer.unemployment_2007;
		this.unemployment_2008 = builer.unemployment_2008;
		this.unemployment_2009 = builer.unemployment_2009;
		this.unemployment_2010 = builer.unemployment_2010;
		this.unemployment_2011 = builer.unemployment_2011;
		this.unemployment_2012 = builer.unemployment_2012;
	}

	public static class Builder {

		private double unemployment_2003;
		private double unemployment_2004;
		private double unemployment_2005;
		private double unemployment_2006;
		private double unemployment_2007;
		private double unemployment_2008;
		private double unemployment_2009;
		private double unemployment_2010;
		private double unemployment_2011;
		private double unemployment_2012;

		public Builder() {

		}

		public Builder unemployment_2003(double unemployment_2003) {
			this.unemployment_2003 = unemployment_2003;
			return this;
		}

		public Builder unemployment_2004(double unemployment_2004) {
			this.unemployment_2004 = unemployment_2004;
			return this;
		}

		public Builder unemployment_2005(double unemployment_2005) {
			this.unemployment_2005 = unemployment_2005;
			return this;
		}

		public Builder unemployment_2006(double unemployment_2006) {
			this.unemployment_2006 = unemployment_2006;
			return this;
		}

		public Builder unemployment_2007(double unemployment_2007) {
			this.unemployment_2007 = unemployment_2007;
			return this;
		}

		public Builder unemployment_2008(double unemployment_2008) {
			this.unemployment_2008 = unemployment_2008;
			return this;
		}

		public Builder unemployment_2009(double unemployment_2009) {
			this.unemployment_2009 = unemployment_2009;
			return this;
		}

		public Builder unemployment_2010(double unemployment_2010) {
			this.unemployment_2010 = unemployment_2010;
			return this;
		}

		public Builder unemployment_2011(double unemployment_2011) {
			this.unemployment_2011 = unemployment_2011;
			return this;
		}

		public Builder unemployment_2012(double unemployment_2012) {
			this.unemployment_2012 = unemployment_2012;
			return this;
		}

		public Unemployment build() {
			return new Unemployment(this);
		}

	}

}
