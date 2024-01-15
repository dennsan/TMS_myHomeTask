package com.tms.lessons43car.web;

import com.tms.lessons43car.dto.CarDto;
import com.tms.lessons43car.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor

@RestController
@RequestMapping("/cars")
public class CarController {
    private final CarService service;

    @PostMapping
    public CarDto save(@RequestBody CarDto dto) {
        return service.save(dto);
    }

    @GetMapping
    public List<CarDto> find() {
        return service.getAll();
    }

    @PostMapping("/{id}")
    public CarDto findById(@PathVariable(name = "id") Integer id) {
        return service.findById(id);
    }
}
