package com.countries.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class GrosDomesticProduct {

	@XmlElement(name = "gdp_2003")
	private double gdp_2003;
	@XmlElement(name = "gdp_2004")
	private double gdp_2004;
	@XmlElement(name = "gdp_2005")
	private double gdp_2005;
	@XmlElement(name = "gdp_2006")
	private double gdp_2006;
	@XmlElement(name = "gdp_2007")
	private double gdp_2007;
	@XmlElement(name = "gdp_2008")
	private double gdp_2008;
	@XmlElement(name = "gdp_2009")
	private double gdp_2009;
	@XmlElement(name = "gdp_2010")
	private double gdp_2010;
	@XmlElement(name = "gdp_2011")
	private double gdp_2011;
	@XmlElement(name = "gdp_2012")
	private double gdp_2012;
	@XmlElement(name = "gdp_2013")
	private double gdp_2013;
	@XmlElement(name = "gdp_2014")
	private double gdp_2014;

	private GrosDomesticProduct(Builder builder) {
		this.gdp_2003 = builder.gdp_2003;
		this.gdp_2004 = builder.gdp_2004;
		this.gdp_2005 = builder.gdp_2005;
		this.gdp_2006 = builder.gdp_2006;
		this.gdp_2007 = builder.gdp_2007;
		this.gdp_2008 = builder.gdp_2008;
		this.gdp_2009 = builder.gdp_2009;
		this.gdp_2010 = builder.gdp_2010;
		this.gdp_2011 = builder.gdp_2011;
		this.gdp_2012 = builder.gdp_2012;
		this.gdp_2013 = builder.gdp_2013;
		this.gdp_2014 = builder.gdp_2014;
	}

	public static class Builder {
		private double gdp_2003;
		private double gdp_2004;
		private double gdp_2005;
		private double gdp_2006;
		private double gdp_2007;
		private double gdp_2008;
		private double gdp_2009;
		private double gdp_2010;
		private double gdp_2011;
		private double gdp_2012;
		private double gdp_2013;
		private double gdp_2014;

		public Builder() {

		}

		public Builder gdp_2003(double gdp_2003) {
			this.gdp_2003 = gdp_2003;
			return this;
		}

		public Builder gdp_2004(double gdp_2004) {
			this.gdp_2004 = gdp_2004;
			return this;
		}

		public Builder gdp_2005(double gdp_2005) {
			this.gdp_2005 = gdp_2005;
			return this;
		}

		public Builder gdp_2006(double gdp_2006) {
			this.gdp_2006 = gdp_2006;
			return this;
		}

		public Builder gdp_2007(double gdp_2007) {
			this.gdp_2007 = gdp_2007;
			return this;
		}

		public Builder gdp_2008(double gdp_2008) {
			this.gdp_2008 = gdp_2008;
			return this;
		}

		public Builder gdp_2009(double gdp_2009) {
			this.gdp_2009 = gdp_2009;
			return this;
		}

		public Builder gdp_2010(double gdp_2010) {
			this.gdp_2010 = gdp_2010;
			return this;
		}

		public Builder gdp_2011(double gdp_2011) {
			this.gdp_2011 = gdp_2011;
			return this;
		}

		public Builder gdp_2012(double gdp_2012) {
			this.gdp_2012 = gdp_2012;
			return this;
		}

		public Builder gdp_2013(double gdp_2013) {
			this.gdp_2013 = gdp_2013;
			return this;
		}

		public Builder gdp_2014(double gdp_2014) {
			this.gdp_2014 = gdp_2014;
			return this;
		}

		public GrosDomesticProduct build() {
			return new GrosDomesticProduct(this);
		}
	}

	public GrosDomesticProduct() {
		super();
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(gdp_2003);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2004);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2005);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2006);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2007);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2008);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2009);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2010);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2011);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2012);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2013);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gdp_2014);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		GrosDomesticProduct other = (GrosDomesticProduct) obj;
		if (Double.doubleToLongBits(gdp_2003) != Double.doubleToLongBits(other.gdp_2003))
			return false;
		if (Double.doubleToLongBits(gdp_2004) != Double.doubleToLongBits(other.gdp_2004))
			return false;
		if (Double.doubleToLongBits(gdp_2005) != Double.doubleToLongBits(other.gdp_2005))
			return false;
		if (Double.doubleToLongBits(gdp_2006) != Double.doubleToLongBits(other.gdp_2006))
			return false;
		if (Double.doubleToLongBits(gdp_2007) != Double.doubleToLongBits(other.gdp_2007))
			return false;
		if (Double.doubleToLongBits(gdp_2008) != Double.doubleToLongBits(other.gdp_2008))
			return false;
		if (Double.doubleToLongBits(gdp_2009) != Double.doubleToLongBits(other.gdp_2009))
			return false;
		if (Double.doubleToLongBits(gdp_2010) != Double.doubleToLongBits(other.gdp_2010))
			return false;
		if (Double.doubleToLongBits(gdp_2011) != Double.doubleToLongBits(other.gdp_2011))
			return false;
		if (Double.doubleToLongBits(gdp_2012) != Double.doubleToLongBits(other.gdp_2012))
			return false;
		if (Double.doubleToLongBits(gdp_2013) != Double.doubleToLongBits(other.gdp_2013))
			return false;
		if (Double.doubleToLongBits(gdp_2014) != Double.doubleToLongBits(other.gdp_2014))
			return false;
		return true;
	}

}
