package com.lambdaschool.countryssearch;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/countries")
public class CountryController
{
	@RequestMapping(value = "allnames", produces = {"application/json"})
	public ResponseEntity<?> getAllCountryNames()
	{
		return new ResponseEntity<>(CountryssearchApplication.ourCountryList.getCountryNames(), HttpStatus.OK);
	}
}
