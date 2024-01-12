package com.example.springbootth.dto;

import com.example.springbootth.enumerated.Genre;
import com.example.springbootth.validation.CheckTitleNameValidation;
import lombok.Data;

@Data
@CheckTitleNameValidation
public class FilmDto {
    private Integer id;
    private String title;
    private Integer age;
    private Genre genre;
    private Double rating;
}
