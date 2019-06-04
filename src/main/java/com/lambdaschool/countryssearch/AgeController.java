package com.lambdaschool.countryssearch;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/age")
public class AgeController
{
	@RequestMapping(value = "/age/{age}", produces = {"application/json"})
	public ResponseEntity<?> getBiggerAges(@PathVariable int age)
	{
		ArrayList<Country> biggerAges;
		biggerAges = CountryssearchApplication.ourCountryList.getMedianAgeOrBigger(c -> c.getPopulation() >= age);
		return new ResponseEntity<>(biggerAges, HttpStatus.OK);
	}

	@RequestMapping(value = "/min", produces = {"application/json"})
	public ResponseEntity<?> getSmallestAvgAge()
	{
		Country minAgeCountry;
		minAgeCountry = CountryssearchApplication.ourCountryList.getMinAgedCountry();
		return new ResponseEntity<>(minAgeCountry, HttpStatus.OK);
	}
}
