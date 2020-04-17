package com.convertcurrency.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.convertcurrency.entity.CurrencyConvertDetail;

@Component
//@FeignClient(name="Currency-Conversion-Factor", url="localhost:8081")
@FeignClient(name="Currency-Conversion-Factor", fallback = HystrixFallback.class)
public interface ICurrencyConversionFactorProxy {

	@GetMapping("/currency-conversion-factor/sourceCountry/{sourceCountry}/destCountry/{destCountry}")
	public CurrencyConvertDetail getConversionFactor(@PathVariable("sourceCountry") String sourceCountry, @PathVariable("destCountry") String destCountry);
	 
}
