package com.currencyconversion.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrencyConversion {

	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE)
	int id;
	
	String sourceCountry;
	
	String destCountry;
	double conversion_factor;
	
	public CurrencyConversion()
	{
		
	}
	
	public CurrencyConversion(String sourceCountry, String destCountry, double conversion_factor) {
		super();
		this.sourceCountry = sourceCountry;
		this.destCountry = destCountry;
		this.conversion_factor = conversion_factor;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSourceCountry() {
		return sourceCountry;
	}
	public void setSourceCountry(String sourceCountry) {
		this.sourceCountry = sourceCountry;
	}
	public String getDestCountry() {
		return destCountry;
	}
	public void setDestCountry(String destCountry) {
		this.destCountry = destCountry;
	}
	public double getConversion_factor() {
		return conversion_factor;
	}
	public void setConversion_factor(double conversion_factor) {
		this.conversion_factor = conversion_factor;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", sourceCountry=" + sourceCountry + ", destCountry=" + destCountry
				+ ", conversion_factor=" + conversion_factor + "]";
	}
	
	
	
	
}
