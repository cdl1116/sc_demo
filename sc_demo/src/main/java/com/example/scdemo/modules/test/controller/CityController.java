package com.example.scdemo.modules.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.scdemo.modules.common.vo.Result;
import com.example.scdemo.modules.test.entity.City;
import com.example.scdemo.modules.test.service.CityService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/cities/{countryId}")
	public List<City> getCitiesByCountryId(@PathVariable int countryId){
		return cityService.getCitiesByCountryId(countryId);
	}
	/*
	 * 127.0.0.1/api/cities?currentPage=1&PageSize=10&countryId=522
	 */
	@RequestMapping("/cities")
	public PageInfo<City> getCitiesByPage(@RequestParam int currentPage, 
			@RequestParam int PageSize,@RequestParam int countryId) {
		return cityService.getCitiesByPage(currentPage, PageSize, countryId);
	}
	/**
	 * 
	 * 
	 * 
	 */
	@PostMapping(value="/city",consumes="applicayion/json")
	public Result<City> insertCity(@RequestBody City city){
		return cityService.insertCity(city);
	}
}
