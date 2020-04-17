package com.currencyconversion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyconversion.Repository.ConversionFactorRepo;
import com.currencyconversion.entity.CurrencyConversion;

@Service
public class CurrencyConversionService {

	@Autowired
	ConversionFactorRepo factorRepo;
	
	public void createconversionFactor(CurrencyConversion currencyConversion) 
	{
		factorRepo.save(currencyConversion);
	}

	public List<CurrencyConversion> getAllConversionfactor() 
	{
		return factorRepo.findAll();
	}

	public CurrencyConversion getConversionFactor(String sourceCountry, String destCountry) {
		return factorRepo.findBysourceCountryAndDestCountry(sourceCountry,destCountry);
	}

	public CurrencyConversion updateConversionFactor(String sourceCountry, String destCountry, double factor) {
		CurrencyConversion conversionFactor = factorRepo.findBysourceCountryAndDestCountry(sourceCountry,destCountry);
		conversionFactor.setConversion_factor(factor);
		return factorRepo.save(conversionFactor);
	}

}
