package com.davidhernandezn.best_travel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.davidhernandezn.best_travel.repository.FlyRepository;
import com.davidhernandezn.best_travel.repository.HotelRepository;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

/**  commant runner: permite ejecutar un script de inicio
 * */

@SpringBootApplication
@Slf4j
public class BestTravelApplication implements CommandLineRunner {
	
	/*EN VERSIONES ACTUALES SE RECOMIENDA USAR POR CONSTRUCTOR*/
	@Autowired
	HotelRepository hotelRepository;
	
	@Autowired
	FlyRepository flyRepository;

	public static void main(String[] args) {
		SpringApplication.run(BestTravelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		var fly = flyRepository.findById(15L).get();
		
		var hotel = hotelRepository.findById(7).get();
		
		//log.info(String.valueOf(fly));
		System.out.println(String.valueOf(fly));
		//log.info(String.valueOf(hotel));
		System.out.println(String.valueOf(hotel));
	}

	
	
}
