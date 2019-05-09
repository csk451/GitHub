package com.app.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.app.model.Country;

@Service
public class CountryService {

	public static HashMap<Integer,Country> countryIdMap=getCountryIdMap();

	public CountryService() {
		super();
 
		if(countryIdMap==null)
		{
			countryIdMap=new HashMap<Integer,Country>();
			// Creating some objects of Country while initializing
			Country indiaCountry=new Country(1, "India",10000);
			Country chinaCountry=new Country(4, "China",20000);
			Country nepalCountry=new Country(3, "Nepal",8000);
			Country bhutanCountry=new Country(2, "Bhutan",7000);
 
 
			countryIdMap.put(1,indiaCountry);
			countryIdMap.put(4,chinaCountry);
			countryIdMap.put(3,nepalCountry);
			countryIdMap.put(2,bhutanCountry);
		}
	}
	//GET ALL EMPLOYEES
	public List getAllCountries()
	{
		List countries = new ArrayList(countryIdMap.values());
		return countries;
	}
	//GET EMPLOYEE BY ID
	public Country getCountry(int id)
	{
		Country country= countryIdMap.get(id);
		return country;
	}
	//Post a New resource
	public Country addCountry(Country country)
	{
		country.setId(getMaxId()+1);
		countryIdMap.put(country.getId(), country);
		return country;
	}
	//Update The Country
	public Country updateCountry(Country country)
	{
		if(country.getId()<=0)
			return null;
		countryIdMap.put(country.getId(), country);
		return country;
 
	}
	//Delete the Country Based On ID
	public void deleteCountry(int id)
	{
		countryIdMap.remove(id);
	}
 

 
	// Utility method to get max id
	public static int getMaxId()
	{ int max=0;
	for (int id:countryIdMap.keySet()) { 
		if(max<=id)
			max=id;
 
	} 
	return max;
	}
	
	
	private static HashMap<Integer, Country> getCountryIdMap() {
		// TODO Auto-generated method stub
		return countryIdMap;
	}
}
