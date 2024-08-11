package com.example.City.entity;

import java.math.BigDecimal;

import org.springframework.aot.generate.GeneratedTypeReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="city_table")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String countryCode;
	
	private String district;
	
	private BigDecimal population;
	

	
	
	
	
	
	
	

}
