package com.example.City.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.City.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

}
