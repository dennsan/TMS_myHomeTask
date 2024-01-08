package com.tms.lessons43car.repository;

import com.tms.lessons43car.model.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<CarEntity, Integer> {

}
