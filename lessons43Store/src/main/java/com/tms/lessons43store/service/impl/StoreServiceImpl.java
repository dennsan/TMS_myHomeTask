package com.tms.lessons43store.service.impl;

import com.tms.lessons43store.client.CarClient;
import com.tms.lessons43store.dto.CarDto;
import com.tms.lessons43store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService {
    private final RestTemplate template;
    private final CarClient carClient;

    @Override
    public CarDto save(CarDto dto) {
        return carClient.save(dto);
    }

    @Override
    public List<CarDto> getAll() {
        return carClient.find();
    }

    @Override
    public CarDto findById(Integer id) {
        return carClient.findById(id);
    }
}
