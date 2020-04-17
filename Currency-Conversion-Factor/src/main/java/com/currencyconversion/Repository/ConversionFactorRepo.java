
  package com.currencyconversion.Repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.currencyconversion.entity.CurrencyConversion;
  
@Repository
  public interface ConversionFactorRepo extends JpaRepository<CurrencyConversion, Integer> {

	public CurrencyConversion findBysourceCountryAndDestCountry(String sourceCountry, String destCountry);
  }

 