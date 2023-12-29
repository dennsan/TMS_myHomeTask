package com.example.springbootapp.repository;

import com.example.springbootapp.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FilmRepository extends JpaRepository<FilmEntity, Integer> {

    public List<FilmEntity> findByTitle(String title);
}
