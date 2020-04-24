package com.example.scdemo.modules.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.scdemo.modules.test.entity.Country;
import com.example.scdemo.modules.test.service.ConuntryService;

@RestController
@RequestMapping("/api")
public class CountryController {

	@Autowired
	private ConuntryService ConuntryService;
	
	@RequestMapping("/country/{countryId}")
	public Country getCountryControllerById(@PathVariable int countryId){
		return ConuntryService.getCountryById(countryId);
	}
	
	@RequestMapping("/country")
	public Country getCountryByName(@RequestParam String countryName){
		return ConuntryService.getCountryByName(countryName);
	} 
}
