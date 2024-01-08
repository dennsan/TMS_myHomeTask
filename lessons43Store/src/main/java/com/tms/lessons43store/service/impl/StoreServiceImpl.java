package com.tms.lessons43store.service.impl;

import com.tms.lessons43store.dto.CarDto;
import com.tms.lessons43store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class StoreServiceImpl implements StoreService {
    private final RestTemplate template;
    @Override
    public CarDto save(CarDto dto) {
        var response = template.postForEntity("http://127.0.0.1:8081/cars",dto,CarDto.class);
        return response.getBody();
    }
}
