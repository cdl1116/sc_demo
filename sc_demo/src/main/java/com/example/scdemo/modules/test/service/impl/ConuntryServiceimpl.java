package com.example.scdemo.modules.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scdemo.modules.test.dao.CountryDao;
import com.example.scdemo.modules.test.entity.Country;
import com.example.scdemo.modules.test.service.ConuntryService;

@Service
public class ConuntryServiceimpl implements ConuntryService {
	
	@Autowired
	private CountryDao countryDao;
	@Override
	public Country getCountryById(int countryId) {
		// TODO Auto-generated method stub
		return countryDao.getCountryById(countryId);
	}
	
	@Override
	public Country getCountryByName(String countryName) {
		// TODO Auto-generated method stub
		return countryDao.getCountryByName(countryName);
	}

}
