package com.davidhernandezn.best_travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidhernandezn.best_travel.entity.HotelEntity;

public interface HotelRepository extends JpaRepository<HotelEntity, Integer>{

}
