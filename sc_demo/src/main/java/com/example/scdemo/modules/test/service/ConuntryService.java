package com.example.scdemo.modules.test.service;

import com.example.scdemo.modules.test.entity.Country;

public interface ConuntryService {

	
	Country getCountryById(int countryId);
	Country getCountryByName(String countryName);
}
