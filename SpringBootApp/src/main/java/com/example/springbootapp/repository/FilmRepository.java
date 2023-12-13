package com.example.springbootapp.repository;

import com.example.springbootapp.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {

    public Optional<FilmEntity> findByTitle(String title);
}
