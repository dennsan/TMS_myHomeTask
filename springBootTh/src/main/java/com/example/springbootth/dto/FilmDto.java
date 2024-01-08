package com.example.springbootth.dto;

import com.example.springbootth.enumerated.Genre;
import lombok.Data;

@Data

public class FilmDto {
private Integer id;
private String title;
private Integer age;
private Genre genre;
private Double rating;
}
