package com.currencyconversion.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.currencyconversion.entity.BuildResponseUtil;
import com.currencyconversion.entity.CurrencyConversion;
import com.currencyconversion.service.CurrencyConversionService;

@RestController
public class CurrencyConversionController {

	@Autowired
	CurrencyConversionService  currencyService;
	
	@PostMapping("/currency-conversion-factor/sourceCountry/{sourceCountry}/destCountry/{destCountry}/conversionFactor/{factor}")
	@ResponseBody
	@ResponseStatus(value= HttpStatus.CREATED)
	public BuildResponseUtil createConversionFactor(@PathVariable String sourceCountry,@PathVariable String destCountry, @PathVariable double factor )
	{
		CurrencyConversion currencyConversion = new CurrencyConversion();
		currencyConversion.setSourceCountry(sourceCountry);
		currencyConversion.setDestCountry(destCountry);
		currencyConversion.setConversion_factor(factor);
		 currencyService.createconversionFactor(currencyConversion);
		  return new BuildResponseUtil(HttpStatus.CREATED.toString(),"successfully added",currencyConversion);
	}
	
	@GetMapping("/currency-conversion-factor")
	public List<CurrencyConversion> getAllConversionfactor()
	{
		return currencyService.getAllConversionfactor();
	}
	
	@GetMapping("/currency-conversion-factor/sourceCountry/{sourceCountry}/destCountry/{destCountry}")
	public CurrencyConversion getConversionFactor(@PathVariable String sourceCountry, @PathVariable String destCountry)
	{
		return currencyService.getConversionFactor(sourceCountry,destCountry);
	}
	
	@PatchMapping("/currency-conversion-factor/sourceCountry/{sourceCountry}/destCountry/{destCountry}/conversionFactor/{factor}")
	public CurrencyConversion updateConversionFactor(@PathVariable String sourceCountry,@PathVariable String destCountry, @PathVariable double factor )
	{
		return currencyService.updateConversionFactor(sourceCountry,destCountry,factor);
	}
	
}
