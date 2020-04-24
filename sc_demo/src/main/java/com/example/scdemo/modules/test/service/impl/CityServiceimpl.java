package com.example.scdemo.modules.test.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.scdemo.modules.common.vo.Result;
import com.example.scdemo.modules.common.vo.Result.ResultEnum;
import com.example.scdemo.modules.test.dao.CityDao;
import com.example.scdemo.modules.test.entity.City;
import com.example.scdemo.modules.test.service.CityService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CityServiceimpl implements CityService {
	
	@Autowired
	private CityDao cityDao;
	
	@Override
	public List<City> getCitiesByCountryId(int countryId) {
		// TODO Auto-generated method stub
		List<City> cities = cityDao.getCitiesByCountryId2(countryId);
		return cities;
	}

	@Override
	public PageInfo<City> getCitiesByPage(int currentPage, int PageSize, int countryId) {
		PageHelper.startPage(currentPage, PageSize);
		List<City> cities = cityDao.getCitiesByCountryId(countryId);
		cities.stream().map(item -> {
			item.setCityName(item.getCityName()+"--");
			return item;
		}).collect(Collectors.toList());
		return new PageInfo<City>(cities);
	}

	@Override
	public Result<City> insertCity(City city) {
		// TODO Auto-generated method stub
		Result<City> result=new Result<>(ResultEnum.SUCCESS.status,"Insert success.");
		
		try{
			cityDao.insertCity(city);
			result.setObject(city);
		}catch(Exception e){
			result.setStatus(ResultEnum.FAILD.status);
			result.setMessage(e.getMessage());
		}
		
		return null;
	}

	

}
