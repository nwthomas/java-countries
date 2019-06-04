package com.lambdaschool.countryssearch;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/population")
public class PopulationController
{
	@RequestMapping(value = "/size/{people}", produces = {"application/json"})
	public ResponseEntity<?> getPopBySize(@PathVariable int people)
	{
		ArrayList<String> populationbyNumber;
		populationbyNumber = new CountryssearchApplication().ourCountryList.getCountryNamesWithTest(c -> c.getName().length() >= people);
		return new ResponseEntity<>(populationbyNumber, HttpStatus.OK);
	}

	@RequestMapping(value = "/min", produces = {"application/json"})
	public ResponseEntity<?> getMinSizedCountry()
	{
		return new ResponseEntity<>(CountryssearchApplication.ourCountryList.getMinSizedCountry(), HttpStatus.OK);
	}

	@RequestMapping(value = "/max", produces = {"application/json"})
	public ResponseEntity<?> getMaxSizedCountry()
	{
		return new ResponseEntity<>(CountryssearchApplication.ourCountryList.getMaxSizedCountry(), HttpStatus.OK);
	}
}
