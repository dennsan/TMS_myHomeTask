package com.tms.lessons43store.service;

import com.tms.lessons43store.dto.CarDto;

import java.util.List;

public interface StoreService {
    CarDto save(CarDto dto);

    List<CarDto> getAll();

    CarDto findById(Integer id);
}
