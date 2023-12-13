package com.example.springbootapp.service;

import com.example.springbootapp.entity.FilmEntity;

import java.util.List;
import java.util.Optional;

public interface FilmService {
    List<FilmEntity> findAll();
    Optional<FilmEntity> findById(Integer id);
    Optional<FilmEntity> findByTitle(String title);
    void save(FilmEntity film);
}
