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

@RestController
@RequestMapping("/cities")
@RequiredArgsConstructor
public class CityController {

	private final CityService cityService;
	
	
	@PostMapping
    public City createCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }
	
	
	@GetMapping
	public List<City> getAllCities() {
	
		return cityService.getAllCities(); 
		
	}
}
