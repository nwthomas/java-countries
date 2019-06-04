package com.lambdaschool.countryssearch;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
public class PopulationController
{
	@RequestMapping(value = "/size/{people}", produces = {"application/json"})
	public ResponseEntity<?> getPopBySize(@PathVariable int people)
	{
//		ArrayList<String> population
		// Finish
		return null;
	}
}
