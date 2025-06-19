package com.davidhernandezn.best_travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.davidhernandezn.best_travel.entity.FlyEntity;

@Repository //no es necesario cuando se detecta que es un repositorio de spring debido a que lo carga
public interface FlyRepository extends JpaRepository<FlyEntity, Long> {

}
