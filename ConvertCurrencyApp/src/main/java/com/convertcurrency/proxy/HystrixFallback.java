package com.convertcurrency.proxy;

import org.springframework.stereotype.Component;

import com.convertcurrency.entity.CurrencyConvertDetail;

@Component
public class HystrixFallback implements ICurrencyConversionFactorProxy {

	@Override
	public CurrencyConvertDetail getConversionFactor(String sourceCountry, String destCountry) {
		return new CurrencyConvertDetail(sourceCountry,destCountry,0.0);
	}
}
