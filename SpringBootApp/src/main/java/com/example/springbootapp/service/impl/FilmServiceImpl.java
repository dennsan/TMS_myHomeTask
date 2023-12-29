package com.example.springbootapp.service.impl;

import com.example.springbootapp.entity.FilmEntity;
import com.example.springbootapp.repository.FilmRepository;
import com.example.springbootapp.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Override
    public List<FilmEntity> findAll() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<FilmEntity> findById(Integer id) {
        return filmRepository.findById(id);
    }

    @Override
    public List<FilmEntity> findByTitle(String title) {
        return filmRepository.findByTitle(title);
    }

    @Override
    public void save(FilmEntity film) {
        filmRepository.save(film);
    }
}
