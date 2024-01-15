package com.tms.lessons43car.dto;

import com.tms.lessons43car.model.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDto {
    private Integer id;
    private Model model;
    private Integer age;
}
