package com.tms.lessons43car.service;

import com.tms.lessons43car.dto.CarDto;
import com.tms.lessons43car.mapper.CarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


public interface CarService {

    public CarDto save(CarDto dto);
    public List<CarDto> getAll();

}
