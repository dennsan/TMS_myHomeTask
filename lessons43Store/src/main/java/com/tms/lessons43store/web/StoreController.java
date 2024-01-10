package com.tms.lessons43store.web;

import com.tms.lessons43store.dto.CarDto;
import com.tms.lessons43store.service.StoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/store/")
public class StoreController {
    private final StoreService service;

    @PostMapping
    public CarDto sava(@RequestBody CarDto dto){
        return service.save(dto);
    }
    @GetMapping
    public List<CarDto> getAll(){
        return service.getAll();
    }
    @PostMapping("/{id}")
    public CarDto findById(@PathVariable(name = "id") Integer id){
        return service.findById(id);
    }
}
