package com.lambdaschool.countryssearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CountryssearchApplication
{
	static CountryList ourCountryList;

	public static void main(String[] args)
	{
		ourCountryList = new CountryList();

		SpringApplication.run(CountryssearchApplication.class, args);
	}
}
