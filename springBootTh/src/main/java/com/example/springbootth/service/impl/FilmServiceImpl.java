package com.example.springbootth.service.impl;

import com.example.springbootth.dto.FilmDto;
import com.example.springbootth.entity.FilmEntity;
import com.example.springbootth.mapper.FilmMapper;
import com.example.springbootth.repository.FilmRepository;
import com.example.springbootth.service.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {
    private final FilmRepository repository;
    private final FilmMapper mapper;

    @Override
    @Transactional
    public void updateRating(Integer id, Double rating) {
        Optional<FilmEntity> film = repository.findById(id);
        if (film.isEmpty()) {
            return;
        } else {
            FilmEntity filmEntity = film.get();
            filmEntity.setRating(rating);
        }
    }

    @Override
    public List<FilmDto> getAll() {
        var all = repository.findAll();
        return mapper.toDtos(all);
    }

    @Override
    public FilmDto save(FilmDto dto) {
        var entity = mapper.toEntity(dto);
        FilmEntity saved = repository.save(entity);
        return mapper.toDto(saved);
    }
}
