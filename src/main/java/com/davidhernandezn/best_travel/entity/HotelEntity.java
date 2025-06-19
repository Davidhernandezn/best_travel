package com.davidhernandezn.best_travel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "hotel")
@NoArgsConstructor //Constructor Vacio  
@AllArgsConstructor //Solicitado por Builder
@Data //get, set, toString, equals
@Builder //evita tener sobrecarga de constructores
public class HotelEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 50)
	private String name;
	
	@Column(length = 50)
	private String address;
	private Integer rating;
	private double price;

}
