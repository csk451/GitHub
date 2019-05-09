package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Country;
import com.app.service.CountryService;

@RestController
public class CountryController {
	
	CountryService countryService = new CountryService();
	
	//GET ALL EMPLOYEES
	@GetMapping(value = "/countries", headers = "Accept=application/json")
	public List getCountries() {
		List listOfCountries = countryService.getAllCountries();
		return listOfCountries;
	}
	
	//GetEmployee Based on ID
	@GetMapping(value = "/country/{id}",headers = "Accept=application/json")
	public Country getCountryById(@PathVariable int id) {
		return countryService.getCountry(id);
	}
	//Post a New resource
	@PostMapping(value = "/countries", headers = "Accept=application/json")
	public Country addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}
	//Update The Country
	@PutMapping(value = "/countries", headers = "Accept=application/json")
	public Country updateCountry(@RequestBody Country country) {
		return countryService.updateCountry(country);
	}
	//Delete the Country Based On ID
	@DeleteMapping(value = "/country/{id}", headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		countryService.deleteCountry(id);
 
	} 
}
