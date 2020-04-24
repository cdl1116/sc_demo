package com.example.scdemo.modules.test.service;

import java.util.List;

import com.example.scdemo.modules.common.vo.Result;
import com.example.scdemo.modules.test.entity.City;
import com.github.pagehelper.PageInfo;

public interface CityService {
	
	List<City> getCitiesByCountryId(int countryId);
	
	PageInfo<City> getCitiesByPage(int currentPage,int PageSize,int countryId);

	Result<City> insertCity(City city);
}
