package com.tms.lessons43car.service;

import com.tms.lessons43car.dto.CarDto;

import java.util.List;


public interface CarService {

    public CarDto save(CarDto dto);

    public List<CarDto> getAll();

    public CarDto findById(Integer id);

}
