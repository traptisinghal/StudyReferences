package com.convertcurrency.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.convertcurrency.entity.CurrencyConvertDetail;
import com.convertcurrency.proxy.ICurrencyConversionFactorProxy;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class ConvertCurrencyService {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ICurrencyConversionFactorProxy proxy;
	

	public String convertCurrency(String scrCountry, String destCountry, double amount) {
		CurrencyConvertDetail convertObj = proxy.getConversionFactor(scrCountry, destCountry);
		log.info("factor" +convertObj.getConversion_factor());
		return "Converted amount is " + amount * convertObj.getConversion_factor();
	
	}

}
