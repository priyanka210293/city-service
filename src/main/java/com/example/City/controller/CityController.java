package com.example.City.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.City.entity.City;
import com.example.City.service.CityService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
@Slf4j
public class CityController {

	private final CityService cityService;
	
	
	@PostMapping
    public City createCity(@RequestBody City city) {
		log.info("entering into city service");
        return cityService.saveCity(city);
    }
	
	
	@GetMapping
	public List<City> getAllCities() {
		log.info("entering into city service");
		return cityService.getAllCities(); 
		
	}
}
