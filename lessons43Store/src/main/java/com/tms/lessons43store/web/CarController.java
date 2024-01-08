package com.tms.lessons43store.web;

import com.tms.lessons43store.dto.CarDto;
import com.tms.lessons43store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/save")
public class CarController {
    private final StoreService service;

    @PostMapping
    public CarDto sava(@RequestBody CarDto dto){
        return service.save(dto);
    }
}
