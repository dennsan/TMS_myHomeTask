package com.example.springbootth.service;

import com.example.springbootth.dto.FilmDto;
import com.example.springbootth.entity.FilmEntity;

import java.util.List;

public interface FilmService {
    void updateRating(Integer id, Double rating);

    List<FilmDto> getAll();

    FilmDto save(FilmDto dto);
}
