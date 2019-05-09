package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.app.model.Country;

@SpringBootApplication(scanBasePackages = "com.app")
public class SpringRestTemplateRestFullServicesApplication {
	@Autowired
	private static RestTemplate rest;
	public static void main(String[] args) {
		SpringApplication.run(SpringRestTemplateRestFullServicesApplication.class, args);
			
		rest=new RestTemplate();
		//GET BY ID
		Country bhutan=	rest.getForObject("http://localhost:7878/country/{id}",Country.class, 2);
		System.out.println("Get The Country NAme:"+bhutan.getCountryName());
		System.out.println("Get The Country population:"+bhutan.getPopulation());
	
		//Post By Resourse
		final String uri="http://localhost:7878/countries";
		Country country=new Country();
		country.setId(5);
		country.setCountryName("USA");
		country.setPopulation(10000);
	
		Country addedCountry = rest.postForObject( uri, country, Country.class);
	     System.out.println("Country added : " +addedCountry.getCountryName()); 
	
	     //Put for Resource
	     final String uriForPut="http://localhost:7878/countries";
	     Country countryCh=new Country();
	     countryCh.setId(1);
	     countryCh.setCountryName("India");
	     countryCh.setPopulation(1200000);
	     
	     rest.put(uriForPut, country);
	     System.out.println("Change The Country Population is::"+countryCh.getPopulation());
	     
	     //Delete  The Resource
	     final String uriForDelete = "http://localhost:7878/country/{id}";
	      
	      Map<String, String> params = new HashMap<String, String>();
	      params.put("id","2");
	      rest.delete ( uriForDelete,params);  
	 }
	     
	

}
