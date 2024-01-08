package com.tms.lessons43store.dto;

import com.tms.lessons43store.enumerated.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CarDto {
    private Integer id;
    private Model model;
    private Integer age;
}
