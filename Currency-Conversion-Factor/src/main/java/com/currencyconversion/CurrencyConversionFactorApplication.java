package com.currencyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyConversionFactorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionFactorApplication.class, args);
	}

}
