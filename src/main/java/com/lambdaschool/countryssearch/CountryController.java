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
public class CountryController
{
	@RequestMapping(value = "/all",
			produces = {"application/json"})
	public ResponseEntity<?> getAllCountryNames()
	{
		return new ResponseEntity<>(CountryssearchApplication.ourCountryList.getCountryNames(), HttpStatus.OK);
	}

	@RequestMapping(value = "/start/{letter}",
			produces = {"application/json"})
	public ResponseEntity<?> getNamesWithLetter(
			@PathVariable
					char letter)
	{
		ArrayList<String> countryMatchers;
		countryMatchers = CountryssearchApplication.ourCountryList.getNamesWithLetter(c -> c.getName().toUpperCase().charAt(0) == Character.toUpperCase(letter));
		return new ResponseEntity<>(countryMatchers, HttpStatus.OK);
	}
}
