package com.lambdaschool.countryssearch;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/names")
public class NamesController
{
	@RequestMapping(value = "/all",
			produces = {"application/json"})
	public ResponseEntity<?> getAllCountryNames()
	{
		ArrayList<String> allSortedCountries = CountryssearchApplication.ourCountryList.getCountryNames();
		allSortedCountries.sort((c1, c2) -> c1.compareToIgnoreCase(c2));
		return new ResponseEntity<>(allSortedCountries, HttpStatus.OK);
	}

	@RequestMapping(value = "/start/{letter}",
			produces = {"application/json"})
	public ResponseEntity<?> getNamesWithTest(
			@PathVariable
					char letter)
	{
		ArrayList<String> countryMatchers;
		countryMatchers = CountryssearchApplication.ourCountryList.getCountryNamesWithTest(c -> c.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
		countryMatchers.sort((c1, c2) -> c1.compareToIgnoreCase(c2));
		return new ResponseEntity<>(countryMatchers, HttpStatus.OK);
	}

	@RequestMapping(value = "/size/{number}",
			produces = {"application/json"})
	public ResponseEntity<?> getNamesWithTest(
			@PathVariable
					int number)
	{
		ArrayList<String> nameLengthList;
		nameLengthList = CountryssearchApplication.ourCountryList.getCountryNamesWithTest(c -> c.getName().length() == number);
		nameLengthList.sort((c1, c2) -> c1.compareToIgnoreCase(c2));
		return new ResponseEntity<>(nameLengthList, HttpStatus.OK);
	}
}
