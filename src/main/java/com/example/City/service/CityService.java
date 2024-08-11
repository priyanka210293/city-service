package com.example.City.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.City.entity.City;
import com.example.City.repository.CityRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CityService {
	
	private final CityRepository cityRepository;
	

	public List<City> getAllCities() {
		
		return cityRepository.findAll();
	}


	public City saveCity(City city) {
		
		return cityRepository.save(city);
	}

}
