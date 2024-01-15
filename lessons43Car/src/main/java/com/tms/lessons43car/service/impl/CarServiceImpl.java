package com.tms.lessons43car.service.impl;

import com.tms.lessons43car.dto.CarDto;
import com.tms.lessons43car.exc.StoreFailedException;
import com.tms.lessons43car.mapper.CarMapper;
import com.tms.lessons43car.model.CarEntity;
import com.tms.lessons43car.repository.CarRepository;
import com.tms.lessons43car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor

@Service
@Transactional
public class CarServiceImpl implements CarService {

    private final CarMapper mapper;
    private final CarRepository repository;

    @Override
    public CarDto save(CarDto dto) {
        var entity = mapper.toEntity(dto);
        var save = repository.save(entity);
        return mapper.toDto(save);
    }

    @Override
    public List<CarDto> getAll() {
        var carEntities = repository.findAll();

        return mapper.toDtos(carEntities);
    }

    @Override
    public CarDto findById(Integer id) {
        var byId = repository.findById(id)
                .orElseThrow(() -> new StoreFailedException("car not found"));
        return mapper.toDto(byId);
    }
}
